package com.question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Customer {
	private String username;
	private String password; 
	private String email; 
	private String mobileNumber;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}

class Demo{
	public boolean validate(String username, String Password, String Email, String mobile) {
		if(!Pattern.matches("[A-Za-z0-9] {3,8}", username)) return false;
		
		if(!Pattern.matches("[A-Za-z0-9] {3,8}", password)) return false;
		
		if(!Pattern.matches(("[6789]{1}[]0-9 {9}", mobile)) return false;
		
		if(!Pattern.matches([A-Za-z0-9]+@[A-Za-z0-9]", email)) return false;
		
		return true;
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		Customer c=new Customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		String name=sc.next();
		System.out.println("Enter Password :");
		String pwd=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Mobile Number: ");
		String mobile=sc.next();
		
		c.setEmail(email);
		c.setMobileNumber(mobile);
		c.setPassword(pwd);
		c.setUsername(name);
		System.out.println("=================");
		boolean b=d.validate(c.getUsername(),c.getPassword(),c.getEmail(),c.getMobileNumber());
		if(b) {
			System.out.println("UserName IS : "+c.getUsername());
			System.out.println("Password IS : "+c.getPassword());
			System.out.println("Email ID is :" + c.getEmail());
			System.out.println("Mobile Number is: "+ c.getMobileNumber());
		}else {
			System.out.println("Enter Right Details");
		}
	
	}
}


