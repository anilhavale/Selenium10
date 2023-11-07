package com.Encapsulation_Sel;

public class Test_Invalid_LoginUser_TC5 extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");
		
		// create an object of Login Class.
		LoginPage lp = new LoginPage(driver);
		
		
		lp.setPassword1();
		lp.clickLoginButton();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	}
	
}
