package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basiclocators {

	public static void main(String[] args) {

	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/LENOVO/Desktop/Anil%20DeskTop/LinkPage.html");
	String tagname = "a";
	By by = By.tagName(tagname);
	WebElement linkT = driver.findElement(by);
	linkT.click();
	}

}
