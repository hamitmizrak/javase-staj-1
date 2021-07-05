package com.ecodation.dto;

import java.io.Serializable;

import com.ecodation.utils.CommonType;

//MODEL
public class AdminDto extends CommonType implements Serializable {
	private static final long serialVersionUID = 8889055638045504115L;
	
	// nesne değişkenleri
	private String userEmail = "";
	private String userPassword = "";
	
	// constructor parametresiz
	public AdminDto() {
		this.userEmail    = "mail adresini girmediniz";
		this.userPassword = "şifrenizi girmediniz";
	}
	
	// constructor parametreli
	public AdminDto(String userEmail, String userPassword) {
		super();
		this.userEmail    = userEmail;
		this.userPassword = userPassword;
	}
	
	@Override
	public void countYear() {
		System.out.println(" çalışma yılınız: " + (2021 - this.getYear()));
		
	}
	
	// getter setter
	public String getUserEmail() {
		return userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	// tosTring
	@Override
	public String toString() {
		return "AdminDto [userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
	}
	
}
