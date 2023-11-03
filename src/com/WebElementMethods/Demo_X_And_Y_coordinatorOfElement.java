package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Demo_X_And_Y_coordinatorOfElement  extends BaseTest
{

	
	// This script is written to delete the Text in TextBox without clear().

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");
		WebElement unTB = driver.findElement(By.xpath("//input[@id='inputUsername']"));
		//unTB.sendKeys("anilhavale.4@hotmail.com");
		
		Point loc = unTB.getLocation();
		System.out.println("The Location of X & Y co ordinates are : "+ loc);
		
		Thread.sleep(6000);
		
		
		
		driver.close();
		
	}

}
