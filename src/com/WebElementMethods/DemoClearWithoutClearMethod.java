package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DemoClearWithoutClearMethod  extends BaseTest
{

	
	// This script is written to delete the Text in TextBox without clear().

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");
		WebElement unTB = driver.findElement(By.xpath("//input[@id='inputUsername']"));
		unTB.sendKeys("anilhavale.4@hotmail.com");
		
		Thread.sleep(6000);
		
		unTB.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
		
		Thread.sleep(6000);

		
		driver.close();
		
	}

}
