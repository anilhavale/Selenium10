package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoSendKeys_16  extends BaseTest
{

	
	// This script is written to send keys use

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");   // Calling method where 'Actual Arguments' are passed. It is Parameterised method
		
		WebElement unTB = driver.findElement(By.xpath("//input[@id='inputUsername']"));
		unTB.sendKeys("anilhavale.4@hotmail.com");
		
		Thread.sleep(6000);
		 
		
		 

		
		driver.close();
		
	}

}
