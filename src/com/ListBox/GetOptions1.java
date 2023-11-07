package com.ListBox;

import java.util.List;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GetOptions1 extends BaseTest
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	
	OpenApp("chrome", "https://demoqa.com/select-menu");
	
	
	WebElement Element = driver.findElement(By.id("cars"));

	Select sele = new Select(Element);
	
	System.out.println("is it multiple : "+ sele.isMultiple());
	
	
	List<WebElement> items = sele.getOptions();
	
	for (WebElement item : items)
	{
	
		String s = item.getText();
		System.out.println(s);
	}
	Thread.sleep(5000);
	
	driver.close();
		
	}
}
