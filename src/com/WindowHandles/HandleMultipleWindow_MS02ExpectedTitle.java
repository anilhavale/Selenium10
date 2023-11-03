// The below script is written to verify the expected page title is displayed.

package com.WindowHandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow_MS02ExpectedTitle 
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
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.get("https://www.w3schools.com/");
		
		System.out.println("The Title Of The Page is : " + dr.getTitle());
		
		String PWH = dr.getWindowHandle();
		System.out.println("The Parent Window Handle Address is : " + dr.getWindowHandle());
		
		dr.findElement(By.linkText("Log in")).click();
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys("anil");
		dr.findElement(By.id("current-password")).sendKeys("1234");
		
		//dr.findElement(By.linkText("Log in")).click();
		
		// dr.findElement(By.className("Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu")).click();
		dr.findElement(By.xpath("//span[text()='Log in']")).click();
		
		Thread.sleep(5000);
		String ErrMsg = dr.findElement(By.xpath("//span[text()='Looks like you forgot something']")).getText();
		System.out.println("The Error Message is:  "+ErrMsg);
		
		
		String expectedTitle = "Log in - W3Schools";
		String acTitle = dr.getTitle();
		
		// verify the title
		if(acTitle.equals(expectedTitle))
		{
			System.out.println("Test Case is Passed--."+ expectedTitle);
		}
		//dr.close();
		
	}
		
	
	
}