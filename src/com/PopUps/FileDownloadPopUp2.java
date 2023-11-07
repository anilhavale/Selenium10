package com.PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.locators.basiclocators;

public class FileDownloadPopUp2 extends BaseTest
{

	public static void main(String[] args) 
	{
	 openApp("chrome", "https://www.selenium.dev/");
	 
	 driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	 
	 WebElement webD = driver.findElement(By.xpath("(//a[text()='WebDriver'])[1]"));
	 
	 int yaxis=webD.getLocation().getY();
	 
	JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollTo(0,"+yaxis+")");
	 
	// driver.findElement(By.xpath("//a[text()='4.14.1 (October 12, 2023)']")).click();
	 
	}

}
