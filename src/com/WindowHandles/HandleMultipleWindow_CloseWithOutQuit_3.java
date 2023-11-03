// Write a selenium script to handle the multiple window and close the browsers without  using Quit Method

package com.WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow_CloseWithOutQuit_3 {

	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver	driver3=new ChromeDriver();
	windowHandleBrowser(driver3);
	
	}

	private static void windowHandleBrowser(WebDriver dr) {
		// TODO Auto-generated method stub
		
		dr.manage().window().maximize();
		
		dr.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		// first window address is 
		System.out.println("The First Window Address is : "+ dr.getWindowHandle()+"\n");
		
		System.out.println("=============================================================");
		
		dr.switchTo().frame("iframeResult");
		
		//Locate the link and find it and click It.
		WebElement Linktext1 = dr.findElement(By.linkText("Visit W3Schools.com!"));
		Linktext1.click();
		
		
		//Get the All the WIndow Handle and store them in a LIST.
		Set<String> gWHS = dr.getWindowHandles();
		
		for (String w : gWHS)
		{
			dr.switchTo().window(w);
			dr.close();
		}
	}

}
