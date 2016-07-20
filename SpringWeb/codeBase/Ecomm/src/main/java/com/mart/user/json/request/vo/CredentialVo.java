package com.mart.user.json.request.vo;

import javax.validation.constraints.NotNull;

public class CredentialVo extends UserVo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String UserEmail;

	public String getUserEmail() {
		return UserEmail;
	}

	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	
}
