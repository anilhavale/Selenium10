package com.locators;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		
		// find the user name text box and send the value
		WebElement unTB = dr.findElement(By.id("inputUsername"));
		unTB.sendKeys("anil");
		
		// find the password text box and send the value
		WebElement pwTB = dr.findElement(By.name("inputPassword"));
		pwTB.sendKeys("1234");
		
		// to click on checkbox
		
		dr.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		
		dr.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		String errMsg = "* Incorrect username or password";
		
		WebElement realErmsg = dr.findElement(By.xpath("//p[text()='* Incorrect username or password']"));
		
		String ErText = realErmsg.getText();
		//System.out.println(" The Error msg is : "+ realErmsg);
		
		Thread.sleep(5000);
		
		
		if(ErText.equals(ErText))
		{
			System.out.println("The login is failed: ");
		}
		 
		 else
		 {
			 System.out.println("Login is Successful");
		 }
		
		Thread.sleep(5000);
		dr.close();
	}

}