package com.mart.user.json.request.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginVo extends UserVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(max=15,min=6)
	@JsonProperty("passwd")
	private String password;

	public String getPassword() {
		return password;
	}
}
