package com.Encapsulation_sel2;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginUser_TC2
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().window().maximize();
		
		// create an object of login class
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername();
		lp.clickOnLoginButton();
		Thread.sleep(2000);
		lp.verifyErrorMSG(driver);
		
		lp.setPassword2();
		lp.clickOnLoginButton();
		Thread.sleep(2000);
		lp.verifyErrorMSG(driver);
	}

}
