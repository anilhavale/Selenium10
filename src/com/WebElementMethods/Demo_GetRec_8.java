package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class Demo_GetRec_8 extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement el = driver.findElement(By.id("inputUsername"));
		Rectangle r = el.getRect();
		System.out.println("Element width is : "+ r.width);	
		System.out.println("The Element Height is : "+r.height);
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
