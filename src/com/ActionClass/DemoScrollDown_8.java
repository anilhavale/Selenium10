package com.ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScrollDown_8 extends BaseTest {

	public static void main(String[] args) throws InterruptedException 
	{
 
	 	 openApp("chrome", "http://moneyboats.com/");
		 
		//Creating the JavascriptExecutor interface object by Type casting	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 
		 //Vertical scroll down by 600  pixels		
        js.executeScript("window.scrollBy(0,600)");
		
        Thread.sleep(5000);
	
        driver.close();
	}

}
