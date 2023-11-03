package com.WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo_IsSelected_15  extends BaseTest
{ 
	// its an selenium script written to verify whether an element or check box is selected or checked.

	public static void main(String[] args) {
		
		openApp("firefox", "https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement radio_button = driver.findElement(By.xpath("(//input[@name='radioButton'])[1]"));
		radio_button.click();
		
		System.out.println("The Checkbox is selected : "+ radio_button.isSelected());
		
		
		driver.quit();

	}

}
