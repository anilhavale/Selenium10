package com.WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_IsEnabled_14  extends BaseTest
{
	
	// Its an script written to verify an element is Enabled or Not

	public static void main(String[] args) 
	{
		
		// The script is written to verify an element is Enabled.
		
		openApp("chrome","https://www.google.com/gmail/about/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement enb = driver.findElement(By.xpath("//a[text()='Sign in']"));
		boolean enable = enb.isEnabled();		
		System.out.println("The Element is  Enabled  : "+ enable);
		
		driver.quit();

	}

}
