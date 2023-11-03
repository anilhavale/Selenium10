package com.Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Driver_Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String gTitle = driver.getTitle();
		System.out.println("The Title of the page is: "+ gTitle);
		driver.close();
		
	}

}
