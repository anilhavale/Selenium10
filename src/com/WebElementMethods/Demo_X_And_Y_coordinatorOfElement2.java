package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Demo_X_And_Y_coordinatorOfElement2  extends BaseTest
{

	
	// This script is written to delete the Text in TextBox without clear().

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://en.wikipedia.org/wiki/Main_Page");
	
		WebElement element = driver.findElement(By.id("Welcome_to_Wikipedia"));
		
		Point loc = element.getLocation();
	
		System.out.println("The Location of X & Y co-ordinates are : " + loc);
		
		Thread.sleep(6000);
		
		driver.close();
		
	}

}
