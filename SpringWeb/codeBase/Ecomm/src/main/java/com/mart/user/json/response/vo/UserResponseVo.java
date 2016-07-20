package com.mart.user.json.response.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResponseVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("msg")
	protected String msg;
	@JsonProperty("code")
	protected String code;
	
	public UserResponseVo(){
		
	}
	
	public String getResMsg() {
		return msg;
	}
	public void setResMsg(String msg) {
		this.msg = msg;
	}
	public String getResCode() {
		return code;
	}
	public void setResCode(String code) {
		this.code = code;
	}
	
	

}
