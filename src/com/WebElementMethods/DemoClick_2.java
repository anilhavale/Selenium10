package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoClick_2  extends BaseTest
{

	
	// This script is written to click 

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");   // Calling method where 'Actual Arguments' are passed. It is Parameterised method
		
		WebElement unTB = driver.findElement(By.xpath("//input[@id='inputUsername']"));
		unTB.sendKeys("anilhavale.4@hotmail.com");
		
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxTwo")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();		
	 
		/*
		 * 
		 * dr.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		
		dr.findElement(By.xpath("//button[text()='Sign In']")).click();
		 */
		
		Thread.sleep(6000);
		
		driver.close();
		
	}

}
