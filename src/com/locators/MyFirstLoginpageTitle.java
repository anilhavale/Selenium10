package com.locators;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstLoginpageTitle {
	
	public static void main(String[] args) throws InterruptedException
	{
	
	WebDriver	driver=new ChromeDriver();
	testLogin(driver);
	
	}

	private static void testLogin(WebDriver dr) throws InterruptedException {
		// TODO Auto-generated method stub
		
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://rahulshettyacademy.com/locatorspractice/");
	
		String ExpectedTitle = "Rahul Shetty Academy - Login page";
		
		String actualtitle = dr.getTitle();
		
		if(actualtitle.equals(ExpectedTitle))
		{
			System.out.println("The Test Case is passed : "+ ExpectedTitle);
		}
		
		else
		{
			System.out.println(" The Test Case is Failed : "+ actualtitle);
		}
		
		Thread.sleep(5000);
		dr.close();
	}

}