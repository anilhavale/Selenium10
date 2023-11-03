package com.WindowHandles;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



// A selenium script to handle the multiple windows  and print the seession id for all the windows.

public class DemoWindowBC {
	
/*	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	*/
	public static void WindowHandlesBrowser(WebDriver dr) throws InterruptedException
	{
		
		dr.manage().window().maximize();
		
		//1.Navigate to the url
		dr.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		String pwh = dr.getWindowHandle();
		Thread.sleep(10000);
	
		//2. Get the current window's handle and write to the console window. It must be first window handle.
		System.out.println("The Current Window Handle Address : "+ dr.getWindowHandle() + "\n");
		
		
		// switch to iframe result as the All Elements are located in this frame.
				dr.switchTo().frame("iframeResult");
				
		//3. Locate the Link and find it and click it.
				WebElement visitLink = dr.findElement(By.linkText("Visit W3Schools.com!"));
				visitLink.click();
				
		//4. Get the All the WIndow Handle and store them in a LIST
				Set<String> whs = dr.getWindowHandles();
				
				ArrayList wl = new ArrayList<>(whs);
				
				System.out.println("Size of the Array is : "+ wl.size());
				System.out.println("-----------------------");
				System.out.println(wl);
				
	}

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver	driver=new ChromeDriver();
		WindowHandlesBrowser(driver);
		
	}

}
