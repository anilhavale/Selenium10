package com.PopUps;

import org.openqa.selenium.By;

public class alertPopUp_3 extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		openApp("firefox","https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.id("alertbtn")).click();
		
		Thread.sleep(6000);
		
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(6000);
		
		driver.close();
		
		
	}

}
