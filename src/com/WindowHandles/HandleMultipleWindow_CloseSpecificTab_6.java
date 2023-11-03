// The below script is written to close the Specific Tab.

package com.WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow_CloseSpecificTab_6 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
	WebDriver	driver=new ChromeDriver();
	testWindowHandles(driver);

	}

	private static void testWindowHandles(WebDriver dr) throws InterruptedException {
		// TODO Auto-generated method stub
		
		dr.manage().window().maximize();
		
		dr.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		
		System.out.println("The Title Of The Page is : " + dr.getTitle());
		
		String PWH = dr.getWindowHandle();
		System.out.println("The Parent Window Handle Address is : " + dr.getWindowHandle());
		
		// switch on to the other frames
		
		dr.switchTo().frame("iframeResult");
		
		WebElement LinkText = dr.findElement(By.linkText("Visit W3Schools.com!"));
		LinkText.click();
		
		
		Set<String> Mwhs = dr.getWindowHandles();
		
		int count =Mwhs.size();
		System.out.println("The number of windows are : "+ count);
		
		System.out.println("The Multiple window are : "+ Mwhs);
		
		
		/*Mwhs.remove(PWH);
		System.out.println("The no of windows now are : "+ Mwhs.size()); */
		
		for(String w:Mwhs)
		{
			dr.switchTo().window(w);
			String PTitle = dr.getTitle();
			
			
			System.out.println("The Page Title is : "+  PTitle);
			
			if(PTitle.contains("Tryit Editor"))
			{
				
			
			Thread.sleep(10000);
			dr.close();
		}
		 	
	}
		
	}
	
}