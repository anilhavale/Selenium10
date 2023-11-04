package com.HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1_MultipleElements 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/LENOVO/Desktop/Anil%20DeskTop/MultipleElements.html");
		
		 List<WebElement> webLinks = driver.findElements(By.xpath("//a"));
		
		 int count=webLinks.size();
		 
		 System.out.println("The Number of Links are : "+ count);
		 
		 for (WebElement link : webLinks)
		 {
		
			 String linkText = link.getText();
			System.out.println(linkText); 
		 }
		 
		 webLinks.get(1).click();
		 
		 
		 
//		driver.close();

	}

}
