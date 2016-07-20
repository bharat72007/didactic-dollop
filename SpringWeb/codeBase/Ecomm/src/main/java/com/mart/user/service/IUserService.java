package com.mart.user.service;

import java.util.List;

import com.mart.user.entity.User;
import com.mart.user.json.request.vo.AuthenticateVo;
import com.mart.user.json.request.vo.SignupVo;
import com.mart.user.json.response.vo.AuthResponseVo;
import com.mart.user.json.response.vo.SignResponseVo;
import com.mart.user.service.exception.HibernateException;


public interface IUserService {
	public List<User> fetchAll();
	public SignResponseVo SignupResponse(SignupVo signupVo) throws HibernateException;
	public AuthResponseVo fetch(AuthenticateVo authenticateVo);
	public User UserById(String userId);
	public String fetchPasswordByUserName(String username);
}
