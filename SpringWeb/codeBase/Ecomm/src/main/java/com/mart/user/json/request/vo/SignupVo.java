package com.mart.user.json.request.vo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SignupVo extends UserVo implements Serializable{

	private static final long serialVersionUID = 1L;
	@NotNull
	@Size(max=15,min=6)
	@JsonProperty("passwd")
	private String password;
	@NotNull
	@Size(max=10)
	@JsonProperty("fname")
	private String firstName;
	@JsonProperty("mname")
    private String middleName;
    @NotNull
    @JsonProperty("lname")
    private String lastName;
    @NotNull
    @JsonProperty("mail1")
    private String email1;
    @JsonProperty("mail2")
    private String email2;
    @NotNull
    @JsonProperty("mob")
    private String contact;
    
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public String getUserName(){
		//return "bhatO";
		return super.Username;
	}
	
	public void setUserName(){
		this.Username = super.Username;
	}
}
