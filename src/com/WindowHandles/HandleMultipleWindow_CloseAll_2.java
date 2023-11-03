package com.WindowHandles;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow_CloseAll_2 
{

	/*
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	*/
	
	public static void main(String arg[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		WindowHandlesClose(driver);
	}

	private static void WindowHandlesClose(ChromeDriver driver1) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver1.manage().window().maximize();
		
		//1.Navigate to the url
		//driver1.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		driver1.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		Thread.sleep(10000);
		
	
		// get the fist window handle and write on to the console window. It must be first window hanlde
		
		System.out.println("The First window address is : "+ driver1.getWindowHandle() +"\n");
		
		// swith to the iframe result as all the elements are located in this frame.
		driver1.switchTo().frame("iframeResult");
		
		
		// Locate the link and find it and click It.
		WebElement vLink = driver1.findElement(By.linkText("Visit W3Schools.com!"));
		vLink.click();
		
		//4. Get the All the WIndow Handle and store them in a LIST
		Set<String> whs = driver1.getWindowHandles();
		ArrayList ar = new ArrayList<>(whs);
		System.out.println("Size of whs is : "+ ar.size());
		
		System.out.println("The windows are as below: ");
		System.out.println(ar);
		
		Thread.sleep(10000);
		
		driver1.quit();
	}
}
