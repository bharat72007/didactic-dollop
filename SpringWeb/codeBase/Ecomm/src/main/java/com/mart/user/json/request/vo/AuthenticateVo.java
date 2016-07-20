package com.mart.user.json.request.vo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticateVo extends UserVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(max=15,min=6)
	@JsonProperty("passwd")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName(){
		return super.Username;
	}
	
	public void setUserName(){
		this.Username = super.Username;
	}
	
}
