package com.WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_IsDisplayed_13  extends BaseTest
{

	public static void main(String[] args) 
	{
		
		// The script is written to verify an element is displayed
		
		openApp("chrome","https://www.google.com/gmail/about/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement dis = driver.findElement(By.xpath("//a[text()='Sign in']"));
		boolean displ = dis.isDisplayed();
		
		System.out.println("The Element is Displayed : "+ displ);
		
		driver.quit();

	}

}
