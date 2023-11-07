package com.Encapsulation_sel2;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginUser_TC01 {

	public static void main(String[] args) throws InterruptedException
	{

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().window().maximize();
		
		// create an object of login class
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername();
		lp.setPassword();
		lp.clickOnLoginButton();
		
		Thread.sleep(6000);
		driver.close();
		
	}

}
