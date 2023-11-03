package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoClear_1  extends BaseTest
{

	
	// This script is written to clear the data which is present inside the TextBox.

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");   // Calling method where 'Actual Arguments' are passed. It is Parameterised method
		
		WebElement unTB = driver.findElement(By.xpath("//input[@id='inputUsername']"));
		unTB.sendKeys("anilhavale.4@hotmail.com");
		
		Thread.sleep(6000);
		unTB.clear();
		
		Thread.sleep(6000);

		
		driver.close();
		
	}

}
