package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class StaffModel {
	
	 private String UserId;
	  private String PhoneNumber;
	  private String Password;
	  private String UserName;
	  private String RegistrationTime;
	  private String LastLoginTime;
	  
	  public String getUserId() {
		return UserId;
	  }
	  
	  public void setUserId(String UserId) {
		this.UserId = UserId;
	  }
	  public String getPhoneNumber() {
		return PhoneNumber;
	  }
	  
	  public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	  }
	  
	  public String getPassword() {
		return Password;
	  }
	  
	  public void setPassword(String Password) {
		this.Password = Password;
	  }
	  
	  public String getUserName() {
		return UserName;
	  }
	  
	  public void setUserName(String UserName) {
		this.UserName = UserName;
	  }
	  
	  public String getRegistrationTime() {
		return RegistrationTime;
	  }
	  
	  public void setRegistrationTime(String RegistrationTime) {
		this.RegistrationTime = RegistrationTime;
	  }
	  public String getLastLoginTime() {
		return LastLoginTime;
	  }
	  
	  public void setLastLoginTime(String LastLoginTime) {
		this.LastLoginTime = LastLoginTime;
	  }
	  

}