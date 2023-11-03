package com.WebElementMethods;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_GetHieght_GetWidth_Size_10  extends BaseTest
{
	
	// a selenium script to find the Height and Width of an Element

	public static void main(String[] args) 
	{
		openApp("chrome","https://google.com/ncr");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
		org.openqa.selenium.Dimension dim = searchBox.getSize();
		
		System.out.println(dim);
		System.out.println("----------");
		System.out.println("Height is : "+ dim.height);
		System.out.println("Width is : "+ dim.width);
		
		driver.quit();
		
	}
	
	
}
