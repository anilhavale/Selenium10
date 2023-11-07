package com.ActionClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MA_DemoContextClick  extends BaseTest
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
 
		openApp("chrome", "https://www.qaclickacademy.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		WebElement linkEle = driver.findElement(By.xpath("//a[text()='Access all our Courses']"));
		
		WebElement linkFb = driver.findElement(By.xpath("//*[@class='fa fa-facebook-f']"));
		
		Actions act = new Actions(driver);
		

		act.doubleClick(linkFb).build().perform();
		
		//act.contextClick(linkEle).build().perform();
		
		
	//	act.contextClick(linkFb).build().perform();
		
		Thread.sleep(5000);
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_T);
		
		
		
	}

}
