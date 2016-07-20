package com.mart.user.json.request.vo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class UserVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(max=8)
	@JsonProperty("uname")
	protected String Username;

	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	
}
