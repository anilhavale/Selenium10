package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MA_ContextClick  extends BaseTest
{

	public static void main(String[] args) 
	{
	
		openApp("chrome", "https://demoqa.com/buttons");
		
		WebElement element = driver.findElement(By.id("rightClickBtn"));

		Actions act = new Actions(driver);
		
		act.contextClick(element).perform();
		
	}

}
