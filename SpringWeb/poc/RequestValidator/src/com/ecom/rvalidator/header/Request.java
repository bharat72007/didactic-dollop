package com.ecom.rvalidator.header;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Entity;

@Embeddable
public class Request {
	
	@Column(name="host")
	private String host;
	
	@Column(name="connection")
	private String connection;
	
	@Column(name="content_Length")
	private int content_Length;
	
	@Column(name="user_Agent")
	private String user_Agent;
	
	@Column(name="cache_Control")
	private String cache_Control;
	
	@Column(name="origin")
	private String origin;
	
	@Column(name="accept")
	private String accept;

	@Column(name="accept_Encoding")
	private String accept_Encoding;
	
	@Column(name="accept_Language")
	private String accept_Language;
	
	@Column(name="UUID")
	private String UUID;

	public String getAccept() 
	{return accept;}

	public void setAccept(String accept) 
	{this.accept = accept;}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public int getContent_Length() {
		return content_Length;
	}

	public void setContent_Length(int content_Length) {
		this.content_Length = content_Length;
	}

	public String getUser_Agent() {
		return user_Agent;
	}

	public void setUser_Agent(String user_Agent) {
		this.user_Agent = user_Agent;
	}

	public String getCache_Control() {
		return cache_Control;
	}

	public void setCache_Control(String cache_Control) {
		this.cache_Control = cache_Control;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getAccept_Encoding() {
		return accept_Encoding;
	}

	public void setAccept_Encoding(String accept_Encoding) {
		this.accept_Encoding = accept_Encoding;
	}

	public String getAccept_Language() {
		return accept_Language;
	}

	public void setAccept_Language(String accept_Language) {
		this.accept_Language = accept_Language;
	}
	
	public String getUUID() {
		return UUID;
	}

	public void setUUID(String UUID) {
		this.UUID = UUID;
	}
}
