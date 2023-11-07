package com.PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class confirmationPopUp_1  extends BaseTest
{

	public static void main(String[] args) 
	{
	
		openApp("chrome", "https://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("cusid")).sendKeys("12456");
		
		driver.findElement(By.name("submit")).submit();
		
		// switching to alert
		
		Alert alert = driver.switchTo().alert();
		
		// capturing the alert message
		
		String amsg = alert.getText();
		
		
		// displaying the alert message
		
		System.out.println(amsg);
		
		alert.accept();
	}

}
