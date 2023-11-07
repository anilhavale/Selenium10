package com.ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demo_DropDown_SelectByValue  extends BaseTest
{

	public static void main(String[] args) 
	{
	
		OpenApp("chrome", "https://demoqa.com/select-menu");
		
		WebElement Element = driver.findElement(By.id("oldSelectMenu"));

		// Create object of the Select class
		
		Select sel = new Select(Element);
		
		// select by value
		sel.selectByValue("2");

		sel.selectByValue("10");

		
	}

}
