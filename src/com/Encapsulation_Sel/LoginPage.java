package com.Encapsulation_Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{

	//declaration
	private WebElement unTB;
	
	private WebElement pwTB;
	
	private WebElement lgnBTN;
	
	
	//initialization
	
	public LoginPage(WebDriver driver)
	{
		
		unTB=driver.findElement(By.id("inputUsername"));
		
		pwTB=driver.findElement(By.name("inputPassword"));
		
		lgnBTN=driver.findElement(By.xpath("//button[text()='Sign In']"));
		
	}
	
	
	
	// utilization
	
	public void setUserName()
	{
	
		unTB.sendKeys("anil");
		
	}
	
	public void setPassword()
	{
		pwTB.sendKeys("rahulshettyacademy");
	}
	
	public void setPassword1()
	{
		pwTB.sendKeys("rahulshettyacademy1");
	}
	
	public void clickLoginButton()
	{
		lgnBTN.click();
	}
	
	
}
