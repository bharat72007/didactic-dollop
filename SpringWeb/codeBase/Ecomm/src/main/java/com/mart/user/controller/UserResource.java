package com.mart.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mart.user.entity.UserToken;
import com.mart.user.json.request.vo.AuthenticateVo;
import com.mart.user.json.request.vo.CredentialVo;
import com.mart.user.json.request.vo.LoginVo;
import com.mart.user.json.request.vo.SignupVo;
import com.mart.user.json.response.vo.AuthResponseVo;
import com.mart.user.json.response.vo.CredResponseVo;
import com.mart.user.json.response.vo.LoginResponseVo;
import com.mart.user.json.response.vo.SignResponseVo;
import com.mart.user.service.IUserService;
import com.mart.user.service.exception.HibernateException;
import com.mart.user.utils.EncryptPassword;

@Controller
@RequestMapping("/user")
public class UserResource {

	@Autowired
	private IUserService UserService;
	
	@Autowired
	private HttpServletRequest req;
	
	//Session TimeOut Duration
	private static final int SESSION_TIMEOUT = 10*60;

	
	static Logger log = Logger.getLogger(UserResource.class.getName());
	
	@RequestMapping(value="/json/v1/authenticate/", method=RequestMethod.POST)
	public @ResponseBody ResponseEntity<AuthResponseVo> userAuth(@Valid @RequestBody AuthenticateVo authenticateVo){
		return new ResponseEntity<AuthResponseVo>(UserService.fetch(authenticateVo),HttpStatus.OK);
	}
	
	@RequestMapping(value="/json/v1.0/credentials/", method=RequestMethod.POST)
	public @ResponseBody CredResponseVo userCred(@Valid @RequestBody CredentialVo credentialVo){
		return null;
	}
	
	@RequestMapping(value="/json/v1/signup", method=RequestMethod.POST)
	public @ResponseBody ResponseEntity<SignResponseVo> userSignup(@Valid @RequestBody SignupVo signupVo){
		//String errorType = null;
		try{
			SignResponseVo signvo = UserService.SignupResponse(signupVo);
			System.out.println(signvo.toString());
			return new ResponseEntity<SignResponseVo>(signvo,HttpStatus.CREATED);
		}catch(HibernateException e){
			//errorType = "Unable to Connect";
		}
		return new ResponseEntity<SignResponseVo>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	@RequestMapping(value="/json/v1/login", method=RequestMethod.POST)
	public @ResponseBody ResponseEntity<LoginResponseVo> userLogin(@Valid @RequestBody LoginVo loginVo){
		
		String username =loginVo.getUsername();
		String password = loginVo.getPassword();
		String passwd = UserService.UserById(username).getPassword();
		if(EncryptPassword.getHashedPassKey(password).toString().equals(passwd)){
		/*	HttpSession session = req.getSession();
		
			if(session.isNew()){
				
				System.out.println("new session");
				session.setAttribute("authentication", username);
				session.setMaxInactiveInterval(SESSION_TIMEOUT);
			}
			else{
				System.out.println(session.getAttribute("authentication"));
			}
		*/	
			UserToken token = new UserToken();
			LoginResponseVo loginrespvo = new LoginResponseVo();
			loginrespvo.setResCode("101");
			loginrespvo.setResMsg("success");
			loginrespvo.setUsername(username);
			return new ResponseEntity<LoginResponseVo>(loginrespvo,HttpStatus.OK);
		}else{
			return new ResponseEntity<LoginResponseVo>(HttpStatus.UNAUTHORIZED);
		}
	}
	
	@RequestMapping(value= "/json/v1/logout", method=RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<String> userLogout(){
		  HttpSession session = req.getSession();
		  if(session != null){
			  session.invalidate();
			  System.out.println("Invalidate");
		  }
		 return new ResponseEntity<String>("",HttpStatus.OK);
	}
	
	
	
}



