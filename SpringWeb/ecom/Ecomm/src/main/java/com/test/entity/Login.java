package com.test.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_LOGIN")
public class Login implements Entity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Integer Id;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@Column(name="LOGIN_TIME")
	private Date LoginTime;
	
	@Column(name="IS_SUCCESS_LOGIN")
	private Enum IsSuccessFulLogin;
	
	@Column(name="IP")
	private String IP;
	
	@Column(name="COOKIE")
	private Enum Cookie;

	public Integer getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getLoginTime() {
		return LoginTime;
	}

	public void setLoginTime(Date loginTime) {
		LoginTime = loginTime;
	}

	public Enum getIsSuccessFulLogin() {
		return IsSuccessFulLogin;
	}

	public void setIsSuccessFulLogin(Enum isSuccessFulLogin) {
		IsSuccessFulLogin = isSuccessFulLogin;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}

	public Enum getCookie() {
		return Cookie;
	}

	public void setCookie(Enum cookie) {
		Cookie = cookie;
	}
}
