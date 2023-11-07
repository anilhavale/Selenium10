package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MA_MouseHover_MoveToElement extends BaseTest
{

	public static void main(String[] args) 
	{
		openApp("chrome", "http://demo.guru99.com/test/newtours");
		
		WebElement link_Home = driver.findElement(By.xpath("//a[text()='Home']"));

		Actions builder = new Actions(driver);
		Action mousehover_home = builder.moveToElement(link_Home).build();
	
		mousehover_home.perform();
	
	}

}
