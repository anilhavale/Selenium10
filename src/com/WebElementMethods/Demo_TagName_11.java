package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_TagName_11 extends BaseTest {

	public static void main(String[] args)
	{

		openApp("chrome", "https://rahulshettyacademy.com/AutomationPractice/");
		WebElement DropdnEle = driver.findElement(By.xpath("(//input[@name='radioButton'])[2]"));
		String TagN = DropdnEle.getTagName();
		System.out.println("The TagName is : "+ TagN);
		
		driver.close();
		
		
	}

}
