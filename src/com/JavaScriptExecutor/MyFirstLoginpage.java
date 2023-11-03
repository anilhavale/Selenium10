package com.JavaScriptExecutor;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstLoginpage {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver	driver=new ChromeDriver();
		testLogin(driver);
	}

	private static void testLogin(WebDriver dr) throws InterruptedException 
	{
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://rahulshettyacademy.com/locatorspractice/");
		
		WebElement lbutton = dr.findElement(By.xpath("//button[text()='Sign In']"));
		
		// find the user name text box and send the value
		WebElement unTB = dr.findElement(By.id("inputUsername"));
		unTB.sendKeys("anil");
		
		// find the password text box and send the value
		WebElement pwTB = dr.findElement(By.name("inputPassword"));
		pwTB.sendKeys("rahulshettyacademy");
		
		// to click on checkbox
		
		JavascriptExecutor js = (JavascriptExecutor)dr;
		
		
		
		// Perform Click on LOGIN button using JavascriptExecutor		
        js.executeScript("arguments[0].click();", lbutton);
		
		//dr.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		
	//	dr.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		Thread.sleep(5000);
		dr.close();
	}

}