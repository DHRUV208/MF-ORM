package com.Validator;

import java.util.regex.Matcher;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.util.regex.*;

public class PasswordConstraintValidator implements ConstraintValidator<isValidPassword, String> {
	private static final String PASSWORD_PATTERN = "^(?=.*[0-9])"
            + "(?=.*[a-z])(?=.*[A-Z])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$";
	private Pattern pattern;
	private Matcher matcher;
	
	public PasswordConstraintValidator() {
		pattern = Pattern.compile(PASSWORD_PATTERN );
	}
	
	public void initialize(isValidPassword isValid) {
		
		 isValid.message();
	}
	
	public boolean isValid(String value, ConstraintValidatorContext cxt) {
		System.out.println("password :"+ value);
		if(value == null) {
			return false;
		}
		matcher = pattern.matcher(value);
		return matcher.matches();	
	}
	
	
	
	

}
