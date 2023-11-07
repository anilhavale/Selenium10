package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollByVisibleElement  extends BaseTest
{

	public static void main(String[] args) 
	{
	
		openApp("chrome", "http://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        /*
		
		In the above code, we first launch the given url in Chrome browser. 
		Next, scroll the page until the mentioned element is visible on the current page. 
		Javascript method scrollIntoView() scrolls the page until the mentioned element is in full view :
		
		
		*/
	}

}
