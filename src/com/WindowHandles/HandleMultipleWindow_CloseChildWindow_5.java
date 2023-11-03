package com.WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow_CloseChildWindow_5 
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
		
		for(String w : Mwhs)
		{
			dr.switchTo().window(w);
			if(PWH.equals(w))
			{
				System.out.println("The Parent Window title is : "+dr.getTitle());
			}
			
			else
			{
				System.out.println("The Child Window Title page name is : "+ dr.getTitle());
				Thread.sleep(15000);
				dr.close();
			}
			
		}
	
		 
		
	}

}
