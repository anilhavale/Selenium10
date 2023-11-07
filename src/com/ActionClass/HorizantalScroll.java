package com.ActionClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizantalScroll 
{
	public static void main(String[] args) throws InterruptedException 
	{
		  //Initialising the driver
	       WebDriver driver = new ChromeDriver();
	 
	       //launch the website
	       driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
	 
	       //maximize the window to full screen
	       driver.manage().window().maximize();
	 
	       //It will wait for maximum of 10sec for each object
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	    
	       JavascriptExecutor js = (JavascriptExecutor) driver;
	     
	    //   js.executeScript(“window.scrollTo(5000,40)”);
	       
	       WebElement Element = driver.findElement(By.linkText("VBScript"));
	       
	     //This will scroll the page Horizontally till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        
	        Thread.sleep(5000);
	        
	       driver.close();
	   }
}
