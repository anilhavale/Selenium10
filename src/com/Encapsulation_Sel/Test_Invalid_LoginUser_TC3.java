package com.Encapsulation_Sel;

public class Test_Invalid_LoginUser_TC3 extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");
		
		// create an object of Login Class.
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName();
		lp.clickLoginButton();
		
		Thread.sleep(5000);
		
		lp.setPassword1();
		lp.clickLoginButton();
		
		driver.close();
		
		
	}
	
}
