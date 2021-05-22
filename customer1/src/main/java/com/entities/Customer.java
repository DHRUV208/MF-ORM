package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.Validator.isValidPassword;




public class Customer {

	@NotEmpty(message="Empty")
	private String name;
	private String gender;
	@NotNull @Size(min =10, max=10, message = "not a phone number") @Pattern(regexp="^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$", message = "not a phone number")  
	private String phnNum;
	private String address;
	private String income;
	@Email @NotEmpty(message= "not an email")
	private String email;
	private int customerId;
	@Size(min= 3, message = " 3 characters required")
	@isValidPassword
	private String password;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String gender, String phnNum, String address, String income, String email,
			String password) {
		super();
		this.name = name;
		this.gender = gender;
		this.phnNum = phnNum;
		this.address = address;
		this.income = income;
		this.email = email;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhnNum() {
		return phnNum;
	}
	public void setPhnNum(String phnNum) {
		this.phnNum = phnNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
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
		return "Customer [name=" + name + ", gender=" + gender + ", phnNum=" + phnNum + ", address=" + address
				+ ", income=" + income + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	

}
