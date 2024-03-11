package com.zosh.request;

import lombok.Data;

@Data
public class ResetPasswordRequest {
	
	private String password;
	private String token;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public ResetPasswordRequest(String password, String token) {
		super();
		this.password = password;
		this.token = token;
	}
	public ResetPasswordRequest() {
		super();
	}
	


}
