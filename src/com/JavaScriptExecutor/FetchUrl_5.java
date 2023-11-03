package com.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchUrl_5 {

	public static void main(String[] args) 
	{
		
	WebDriver	driver=new ChromeDriver();
	
	// //Creating the JavascriptExecutor interface object by Type casting
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	//launching the website
	driver.get("https://demo.guru99.com/V1/index.php");
	
	////Fetching the URL of the site. Tostring() change object to name
	
	String Url = js.executeScript("return document.URL;").toString();
	
	System.out.println(Url);
	}

}
