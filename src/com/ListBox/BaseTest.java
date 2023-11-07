package com.ListBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{

	public static WebDriver driver;
	
	public static void OpenApp(String sBrowser, String url)
	{
		if(sBrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(sBrowser.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
	}
}
