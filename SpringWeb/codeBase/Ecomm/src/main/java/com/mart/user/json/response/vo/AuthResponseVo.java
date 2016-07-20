package com.mart.user.json.response.vo;

public class AuthResponseVo extends UserResponseVo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean auth;

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}
	
	
}
