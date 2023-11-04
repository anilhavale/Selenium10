package com.Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_ImplicitWait_3 
{

	public static void main(String[] args) 
	{

		WebDriver	driver=new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		// Launch website

        driver.get("https://www.registration.tools4testing.com/");
        
        driver.manage().window().maximize();
		
        
        driver.findElement(By.id("loginopener")).click();
        
        driver.findElement(By.id("loginUsername")).sendKeys("anilhavale.4@gmail.com");
        
        driver.findElement(By.name("loginPassword")).sendKeys("Password123123");
        
        driver.findElement(By.className("login-button")).click();
        
        
      //wait some time to get login response
        
        try
        {
        	Thread.sleep(8000);
        }
        
        catch (InterruptedException e) {
			// TODO: handle exception
		}
        
        driver.quit();
	}

}
