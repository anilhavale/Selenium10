package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MA_DragAndDrop extends BaseTest {

	public static void main(String[] args) 
	{
		openApp("firefox", "http://demo.guru99.com/test/drag_drop.html");
	
		
		// Element which needs to drag.    
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
		
		// element on which we need to drop
		
		WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));
	
		// using Action class for Drag and Drop
		Actions act = new Actions(driver);
		act.dragAndDrop(From, To).build().perform();
		
		
	}

}
