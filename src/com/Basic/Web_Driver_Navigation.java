package com.Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String gTitle = driver.getTitle();
		System.out.println("The Title of the page is: "+ gTitle);
		System.out.println("-----------------------------------");
		
		
		Thread.sleep(6000);
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		Thread.sleep(7000);
		driver.navigate().back();
		 
		String BackPage = driver.getTitle();
		
		String Firstpage = "Rahul Shetty Academy - Login page";
		if(Firstpage.equals(BackPage))
		{
			System.out.println("The WD returned to the Orginal page");
		}
		
		Thread.sleep(8000);
		
		
		
		driver.close();
		
	}

}
