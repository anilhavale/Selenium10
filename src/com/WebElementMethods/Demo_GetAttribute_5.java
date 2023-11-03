package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_GetAttribute_5  extends BaseTest
{
	public static void main(String[] args) 
	{
	
		// openApp("chrome", "https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
		
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement un = driver.findElement(By.id("inputUsername"));
		System.out.println(un.getAttribute("type"));
		
		
		
	}
	
	
}
