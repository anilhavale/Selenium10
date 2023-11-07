package com.ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demo_DropDown_MultiSelect_ByVisibleText_1  extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		OpenApp("chrome", "https://demoqa.com/select-menu");
		
		WebElement Element = driver.findElement(By.id("cars"));

		// Create object of the Select class
		
		Select sel = new Select(Element);
		
		 if(sel.isMultiple())
		 {
			 // selecting by visible text
			 
			 sel.selectByVisibleText("audi");
			 
			 Thread.sleep(5000);
			 
			 //driver.close();
			 
			 
		 }
		
		 
	}

}
