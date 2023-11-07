package com.ActionClass;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollByPage  extends BaseTest{

	
	//To scroll down the web page at the bottom of the page.
	public static void main(String[] args) 
	{
		 

		openApp("chrome", "http://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        
        // Script Description : In the above code, we first launch the given url in Chrome browser. 
        //Next, scroll till the bottom of the page.
        //Javascript method scrollTo() scroll the till the end of the page .
		
	}

}
