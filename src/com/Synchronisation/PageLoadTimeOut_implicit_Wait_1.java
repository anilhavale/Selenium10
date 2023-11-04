package com.Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut_implicit_Wait_1 
{

	
	public static void main(String[] args) 
	{
	
		
		
		WebDriver	driver=new ChromeDriver();
		
		/* 
		 pageLoadTimeout command in Selenium timeout
As the name suggests, pageLoadTimeout command waits for the page to load completely 
for a specified number of seconds. 
The default value is 0 and a negative value means infinite wait.
		  
		 */
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.close();
		
	}
}
