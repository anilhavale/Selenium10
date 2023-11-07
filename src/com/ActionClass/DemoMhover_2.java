package com.ActionClass;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMhover_2 
{

	public static void main(String[] args) 
	{

		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        driver.get("http://demo.guru99.com/test/guru99home/");

		driver.manage().window().maximize();
		
		// type cast the WebDriver Interface to the JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//WebElement ele = driver.findElement(By.xpath("//a[text()='Linux']"));
		
		WebElement Element = driver.findElement(By.linkText("Linux"));
		
		js.executeScript("arguments[0].scrollIntoView();", Element);
	 
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
