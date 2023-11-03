package com.WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Write a selenium script to to close the Parent Window
public class HandleMultipleWindow_CloseParentWindow_4 
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
	WebDriver	driver=new ChromeDriver();
	
	WindowHandlesBrowser(driver);

	}

	private static void WindowHandlesBrowser(WebDriver dr) throws InterruptedException {
		// TODO Auto-generated method stub
		
		dr.manage().window().maximize();
		dr.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		String PpageTitle = dr.getTitle();
		System.out.println("Page title is : "+ PpageTitle);
		System.out.println("========================================================");
		
		String Pwh = dr.getWindowHandle();
		System.out.println("Parent Window Handle Address is : "+ Pwh);
		
		
		// switch over to the another window, 
		dr.switchTo().frame("iframeResult");
		
		
		//Locate the link and find it and click It.
				WebElement Linktext1 = dr.findElement(By.linkText("Visit W3Schools.com!"));
				Linktext1.click();
				
				Set<String> GWhs = dr.getWindowHandles();
				
				for(String w: GWhs)
				{
					dr.switchTo().window(w);
					if(Pwh.equals(w))
					{
						String s = dr.getTitle();
						System.out.println("The PWH name is : "+ dr.getTitle());
						Thread.sleep(10000);
						dr.close();
					}
					
					else
					{
						String s = dr.getTitle();
						System.out.println("Title of page is : "+ s);
					}
				}
				
		
	
	}

}
