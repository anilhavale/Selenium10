package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_GetSessionId 
{
	// the aim of the script is to get the SessionID Of the Browser & Current Windows.
	
	public static void main(String[] args) throws InterruptedException 
	{
	
	WebDriver	driver=new ChromeDriver();
	testBrowser(driver);
	
	}
	
	public static void testBrowser(WebDriver dr) throws InterruptedException
	{
		dr.manage().window().maximize();
		dr.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		/*	String pTitle = dr.getTitle();
		System.out.println("The Title of the page is : "+ pTitle);
		
		
		String Curl = dr.getCurrentUrl();
		System.out.println(" The Curretn url of the page is\n"+ Curl);
		*/
		
		String src = dr.getPageSource();
		System.out.println("The page Source is : "+ src);
		
		// get window handle is used to get the address of the browser
		String pwh = dr.getWindowHandle();
		System.out.println(" Session ID is :  "+ pwh);
		Thread.sleep(5000);
		dr.close();
		
	}	
}
