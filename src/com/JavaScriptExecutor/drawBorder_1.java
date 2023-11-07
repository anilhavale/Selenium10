package com.JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class drawBorder_1 extends BaseTest
{

	public static void main(String[] args) 
	{

		openApp("chrome", "https://rahulshettyacademy.com/locatorspractice/");// https://demo.guru99.com/V1/index.php
		
		WebElement ele = driver.findElement(By.id("inputUsername"));
		
		drawBorder(ele,driver);	
	}

	public static void drawBorder(WebElement ele, WebDriver driver) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(null, null)
		
		
		//js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		js.executeScript("arguments[0].style.border:'3px solid red'", ele);
	}

}
