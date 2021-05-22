package com.entities;

public class CustomerLogin {
	private String email;
	private String password;
	
	
	public CustomerLogin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CustomerLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "CustomerLogin [email=" + email + ", password=" + password + "]";
	}
	
	

}
