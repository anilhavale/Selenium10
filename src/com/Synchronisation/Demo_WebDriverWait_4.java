package com.Synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo_WebDriverWait_4 
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
        
        
        // to get the title of the login page
        
        String LGNPgTitle = driver.getTitle();
        System.out.println("The Login page Title is : "+ LGNPgTitle);
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(5000));
        
        WebElement LoginBTN = driver.findElement(By.className("login-button"));
        
        wait.until(ExpectedConditions.elementToBeClickable(LoginBTN));
        
        LoginBTN.click();
        
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
