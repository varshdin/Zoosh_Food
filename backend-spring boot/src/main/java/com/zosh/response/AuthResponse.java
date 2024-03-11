package com.zosh.response;


import com.zosh.domain.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
	
	private String message;
	private String jwt;
	private USER_ROLE role;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getJwt() {
		return jwt;
	}
	public void setJwt(String jwt) {
		this.jwt = jwt;
	}
	public USER_ROLE getRole() {
		return role;
	}
	public void setRole(USER_ROLE role) {
		this.role = role;
	}
	public AuthResponse(String message, String jwt, USER_ROLE role) {
		super();
		this.message = message;
		this.jwt = jwt;
		this.role = role;
	}
	public AuthResponse() {
		super();
	}
	
	


}
