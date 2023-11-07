package com.ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demo_DropDown_MultiSelect  extends BaseTest
{

	public static void main(String[] args) 
	{
	
		OpenApp("chrome", "https://demoqa.com/select-menu");
		
		WebElement Element = driver.findElement(By.id("cars"));

		// Create object of the Select class
		
		Select sel = new Select(Element);
		
		 if(sel.isMultiple())
		 {
			 // select multiple values by Index
			 
			 sel.selectByIndex(0);
			 sel.selectByIndex(3);
			 
			 
			 // selecting multiple values by value
			 
			 sel.selectByValue("saab");
			 
			 
		 }
		
		 
	}

}
