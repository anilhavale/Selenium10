package com.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

public class TitleofPage_6  extends BaseTest{

	public static void main(String[] args) 
	{
 
		openApp("chrome", "https://demo.guru99.com/V1/index.php");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Method document.title fetch the Title name of the site. Tostring() change object to name	
	String titleP = js.executeScript("return document.title;").toString();
	System.out.println("title of the page is : "+ titleP);
	
	driver.close();
	}

}
