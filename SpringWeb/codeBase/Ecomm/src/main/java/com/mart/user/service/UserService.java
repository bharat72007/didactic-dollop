package com.mart.user.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mart.user.dao.User.Userdao;
import com.mart.user.entity.Registration;
import com.mart.user.entity.User;
import com.mart.user.entity.UserToken;
import com.mart.user.json.request.vo.AuthenticateVo;
import com.mart.user.json.request.vo.LoginVo;
import com.mart.user.json.request.vo.SignupVo;
import com.mart.user.json.response.vo.AuthResponseVo;
import com.mart.user.json.response.vo.SignResponseVo;
import com.mart.user.service.exception.CustomErrorCodes;
import com.mart.user.service.exception.CustomErrorMsg;
import com.mart.user.service.exception.HibernateException;
import com.mart.user.utils.EncryptPassword;

@Service
public class UserService implements IUserService{

	@Autowired
	private Userdao userdao;
	
	
	@Transactional
	public List<User> fetchAll() {
		// TODO Auto-generated method stub
		List<User> list = userdao.findAll(User.class);
		return list;
	}

	@Transactional
	public SignResponseVo SignupResponse(SignupVo signupVo) throws HibernateException{
		// TODO Auto-generated method stub
		Registration registration = new Registration();
		registration.setFirstName(signupVo.getFirstName());
		registration.setMiddleName(signupVo.getMiddleName());
		registration.setLastName(signupVo.getLastName());
		registration.setPrimaryEmail(signupVo.getEmail1());
		registration.setSecondaryEmail(signupVo.getEmail2());
		registration.setMobile(signupVo.getContact());
		registration.setAccountCreated(new Date());
		
		User user = new User();
		user.setName(signupVo.getUserName());
		user.setPassword(EncryptPassword.getHashedPassKey(signupVo.getPassword()).toString());
		user.setRegistration(registration);
		
		userdao.UserRegistration(user, registration);
		
		SignResponseVo responseVo = new SignResponseVo();
		responseVo.setSignup(true);
	//	responseVo.setResCode(CustomErrorCodes.APP_SUCCESS_CODE);
	//	responseVo.setResMsg(CustomErrorMsg.APP_SUCCESS_Msg);
		System.out.println(responseVo.toString());
		return responseVo;
	}

	@Transactional
	public AuthResponseVo fetch(AuthenticateVo authenticateVo) {
		// TODO Auto-generated method stub
		AuthResponseVo resp = new AuthResponseVo();
		String username = authenticateVo.getUserName();
		String password = authenticateVo.getPassword();
		
		User user = userdao.getUserByUsername(username);
		
		if(user != null && user.getName().equals(username) && user.getPassword().equals(EncryptPassword.getHashedPassKey(password).toString())){
			resp.setAuth(true);
			resp.setResCode("100");
			resp.setResMsg("success");
		}
		else{
			resp.setAuth(false);
			resp.setResCode("101");
			resp.setResMsg("error");
		}
		
	return resp;
	}
	
	@Transactional
	public void Auth(LoginVo loginVo){
		String username =loginVo.getUsername();
		String password = loginVo.getPassword();
		String passwd = UserById(username).getPassword();
		
		if(EncryptPassword.getHashedPassKey(password).toString().equals(passwd)){
			UserToken sessionToken  = new UserToken();
			sessionToken.setExpiryTime(new java.util.Date().getTime());
			sessionToken.setToken(UUID.randomUUID());
			
		}
		
	}

	@Override
	public User UserById(String userId) {
		// TODO Auto-generated method stub
		return userdao.getUserById(userId);
	}

	@Override
	public String fetchPasswordByUserName(String username) {
		// TODO Auto-generated method stub
		return userdao.fetchPassByusername(username);
	}
	
	
	
}
