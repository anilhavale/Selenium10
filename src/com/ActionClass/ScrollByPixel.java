package com.ActionClass;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollByPixel  extends BaseTest{

	
	//To scroll down the web page at the bottom of the page.
	public static void main(String[] args) 
	{
		 

		openApp("chrome", "http://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		// This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
        
        
      /*
       
       Script Description: In the above code first we launch the given URL in Chrome browser.
        Next, scroll the page by 1000 pixels through executeScript.
         Javascript method ScrollBy() scrolls the web page to the specific number of pixels.

						The syntax of ScrollBy() methods is :

					executeScript("window.scrollBy(x-pixels,y-pixels)");
       
        
       */
		
	}

}
