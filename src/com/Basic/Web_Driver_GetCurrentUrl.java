package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_GetCurrentUrl 
{
	// the aim of the script is to get the current url

	public static void main(String[] args) throws InterruptedException 
	{
	
	WebDriver	driver=new ChromeDriver();
	testBrowser(driver);	// calling method
	}
	
	public static void testBrowser(WebDriver dr) throws InterruptedException    // called method 
	{
		dr.manage().window().maximize();    // It Maximizes the Window
		dr.get("https://rahulshettyacademy.com/locatorspractice/"); 
		
		// To get the Title of the Page
		String pTitle = dr.getTitle();
		System.out.println("The Title of the page is : "+ pTitle);
		
		// To get the Current url
		String Curl = dr.getCurrentUrl();
		System.out.println(" The Current url of the page is\n"+ Curl);
		
		Thread.sleep(5000);
		
		dr.close();
	}
	
	
	
	
}
