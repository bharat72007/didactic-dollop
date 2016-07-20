package com.mart.user.json.response.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SignResponseVo extends UserResponseVo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("sigup-done")
	private boolean signup;

	public SignResponseVo(){
		super();
	}
	
	public boolean isSignup() {
		return signup;
	}

	public void setSignup(boolean signup) {
		this.signup = signup;
	}

	@Override
	public String toString() {
		return "SignResponseVo [signup=" + signup + ", msg=" + msg + ", code="
				+ code + "]";
	}
	
	
	
}
