package com.Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setScriptTimeout_ImplicitWait_2 {

	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	
	driver.manage().timeouts().setScriptTimeout(15,TimeUnit.SECONDS);
	
	/* 
	 
	 	setScriptTimeout command in Selenium timeout
		The setScriptTimeout command waits for the asynchronous parts of the web 
		page to finish loading for a specified number of seconds.
	 
	 */
	
	//(JavascriptExecutor) driver).executeScript("alert('hello world');");
	//((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
	}
}
