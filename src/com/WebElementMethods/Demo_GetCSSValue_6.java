package com.WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_GetCSSValue_6 extends BaseTest
{

	public static void main(String[] args) {
		
		openApp("chrome", "https://testkru.com/Elements/Buttons");
		
		WebElement ele = driver.findElement(By.xpath("//label[@id='leftClickButtonLabel']"));
		System.out.println(ele.getCssValue("font-weight"));
		
		driver.close();
	}
	
}
