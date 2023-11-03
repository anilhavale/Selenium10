package com.JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;

public class Login extends BaseTest
{

	public static void main(String[] args) 
	{

		//openApp("chrome", "https://demo.guru99.com/V1/index.php");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60000));
		driver.findElement(By.id("uid")).sendKeys("mngr536214");
		
		//driver.findElement(By.name("password")).sendKeys("zygyjud");
		
		//driver.findElement(By.xpath("//input[@value='LOGIN']")).submit();
		
	}

}
