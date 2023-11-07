package com.Encapsulation_Sel;

public class TestLoginUser_TC01 extends BaseTest
{

	public static void main(String[] args) 
	{
	
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");
		
		// create an object of Login Class.
		LoginPage lp = new LoginPage(driver);
		lp.setUserName();
		lp.setPassword();
		lp.clickLoginButton();
		
	}
	
}
