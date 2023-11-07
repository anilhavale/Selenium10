package com.Encapsulation_Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{

public static WebDriver driver;
	
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
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	
}
