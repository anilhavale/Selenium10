package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MA_DoubleClick  extends BaseTest
{

	public static void main(String[] args) 
	{
		 
		openApp("chrome", "https://demoqa.com/buttons");
		
		
		WebElement element = driver.findElement(By.id("doubleClickBtn"));
	
		Actions act = new Actions(driver);
		
		act.doubleClick(element).build().perform();
		
	
	}

}
