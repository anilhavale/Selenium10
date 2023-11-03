package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesChild 
{

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		testXpathAxes(driver);  //  calling method
	}

	private static void testXpathAxes(WebDriver dr) throws InterruptedException    // called Method
	{
		
		dr.get("https://www.tools4testing.com/contents/selenium/testpages/xpath-axes-testpage");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//form[@name='signup']/child::input[9]")).sendKeys("MyLove");
		
		Thread.sleep(6000);
		dr.close();
	}
	
}
