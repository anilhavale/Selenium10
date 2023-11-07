package com.PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp2_handled {

	
	public static void main(String[] args) 
	{
	
		// customize the Browser settings
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		
		// open the browser
		WebDriver	driver=new ChromeDriver(opt);
		
		// set the browser timeouts for the specific browser for synchronisation
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// enter the url
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
	}
}
