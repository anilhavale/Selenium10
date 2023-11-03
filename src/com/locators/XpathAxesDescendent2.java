package com.locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDescendent2 {

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tools4testing.com/contents/selenium/testpages/xpath-axes-testpage");
	}

}
