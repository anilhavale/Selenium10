package com.ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demo_DropDown_DeselectByValue  extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		OpenApp("chrome", "https://demoqa.com/select-menu");
		
		WebElement Element = driver.findElement(By.id("cars"));

		// Create object of the Select class
		
		Select sel = new Select(Element);
		
		 if(sel.isMultiple())
		 {
			// selecting multiple values by value
			 
			 sel.selectByValue("saab");
			 sel.selectByValue("audi");
			 
			// sel.selectByIndex(2);
			 
			 Thread.sleep(5000);
			 
			 
			  sel.deselectByValue("audi");
			 
			 driver.close();
			 
			 
		 }
		
		 
	}

}
