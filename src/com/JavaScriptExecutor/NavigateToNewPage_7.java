package com.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

public class NavigateToNewPage_7  extends BaseTest{

	public static void main(String[] args) throws InterruptedException 
	{
 
		openApp("chrome", "https://demo.guru99.com/V1/index.php");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// 
	js.executeScript("window.location = 'https://www.facebook.com/ '");
	
	System.out.println("title of the page is : "+ driver.getTitle());
	
	Thread.sleep(5000);
	
	driver.close();
	}

}
