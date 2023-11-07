package com.PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopUp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		//  driver.get(protocol://Usename:Password@URL Address);
		
		
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		//openApp("firefox","https://selenium:webdriver@chercher.tech/auth");
		
		
		//FirefoxDriver driver = new FirefoxDriver();	
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		// open webpage
		driver.get("https://selenium:webdriver@chercher.tech/auth");
		
		// verify the title
		if(driver.getTitle().equals("Authentication Successful"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
	}

}
