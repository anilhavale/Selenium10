package com.Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Navigation2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// in this script we have navigated to, back, forward and refreshed the page.
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String gTitle = driver.getTitle();
		System.out.println("The Title of the page is: "+ gTitle);
		System.out.println("-----------------------------------");
		
		
		Thread.sleep(6000);
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		 
		String BackPage = driver.getTitle();
		
		Thread.sleep(8000);
		
		driver.close();
		
	}

}
