package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Title_2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
	WebDriver	driver=new ChromeDriver();
	testBrowser(driver);	// calling method
	}
	
	public static void testBrowser(WebDriver dr) throws InterruptedException
	{
		dr.manage().window().maximize();
		dr.get("https://rahulshettyacademy.com/locatorspractice/");
		
		// to get the title of the page
		String pTitle = dr.getTitle();
		System.out.println("The Title of the page is : "+ pTitle);
		
		
		Thread.sleep(5000);
		
		dr.close();
	}
	
	
	
	
}
