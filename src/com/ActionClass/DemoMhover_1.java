package com.ActionClass;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMhover_1 
{

	public static void main(String[] args) 
	{

		WebDriver	driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		
		WebElement rTab = driver.findElement(By.xpath("//a[contains(text(), 'Resources')]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(rTab).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		
		
	//	int Y_axis=driver.findElement(By.xpath("//p[contains(text(),'U.S. & Global')]")).getLocation().getY();
		
		//p[contains(text(),'Human Resources')]               
		
		int yaxis=driver.findElement(By.xpath("//p[contains(text(),'Human Resources')]")).getLocation().getY();

		
		// type cast the WebDriver Interface to the JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].scrollIntoView();", yaxis);
	//	js.executeScript("window.scrollTo(0,'+yaxis+')");
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
