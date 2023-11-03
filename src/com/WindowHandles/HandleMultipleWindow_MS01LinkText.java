// The below script is written to close the Specific Tab.

package com.WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow_MS01LinkText 
{
	/*
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	*/
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
	WebDriver	driver=new ChromeDriver();
	testWindowHandles(driver);

	}

	private static void testWindowHandles(WebDriver dr) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		dr.manage().window().maximize();
		Thread.sleep(5000);
		dr.get("https://www.w3schools.com/");
		
		System.out.println("The Title Of The Page is : " + dr.getTitle());
		
		String PWH = dr.getWindowHandle();
		System.out.println("The Parent Window Handle Address is : " + dr.getWindowHandle());
		
		dr.findElement(By.linkText("Log in")).click();
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys("anil");
		dr.findElement(By.id("current-password")).sendKeys("1234");
		
		dr.findElement(By.linkText("Log in")).click();
		
		Thread.sleep(5000);
		
		dr.close();
		
	}
		
	
	
}