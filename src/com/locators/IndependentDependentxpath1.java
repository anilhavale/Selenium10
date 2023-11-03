package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentxpath1 
{

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Desktop/Anil%20DeskTop/sel%20practice%20htmls/webtable1.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='testId']/../../td[2]/input")).sendKeys("God is Great");
	}
	
}
