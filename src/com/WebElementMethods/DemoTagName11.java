package com.WebElementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class DemoTagName11 extends BaseTest
{
	
	public static void main(String[] args) 
	{
	
		// to get the tagname of the logo or an element
		
		openApp("chrome", "https://testsigma.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String tn = driver.findElement(By.xpath("//img[@id='second_logo']")).getTagName();
		System.out.println("Tag name of the Element is : "+ tn);
		
		driver.quit();
	}

}
