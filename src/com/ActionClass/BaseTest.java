package com.ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{

	 
	
	public static WebDriver driver;
	
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public static void openApp(String sBrowser, String url)
	{
	
		if(sBrowser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		else if(sBrowser.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
	
	
}
