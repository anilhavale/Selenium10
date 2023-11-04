package com.HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_2_HandlingAutoSuggestions 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver	driver=new ChromeDriver();		
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	WebElement searchBX = driver.findElement(By.name("q"));
	
	searchBX.sendKeys("java");
	
	List<WebElement> weblinks = driver.findElements(By.className("sbct"));
	
	int count=weblinks.size();
	
	System.out.println("The Number of AutoSuggestion links are : "+ count);
	
	
	for (WebElement link : weblinks)
	{
	
		String linkText = link.getText();
		System.out.println(linkText);
		
	}
	
	
	//Thread.sleep(8000);
	
	//driver.close();

		
		
		
	}

}
