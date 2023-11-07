package com.PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadPopup extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://demo.guru99.com/test/upload/");
		
		WebElement UploadElement = driver.findElement(By.id("uploadfile_0"));
		
		UploadElement.sendKeys("C:\\Users\\LENOVO\\FileUplodPopUp.doc");
		
		
		driver.findElement(By.id("terms")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[contains(@class,'btn buttoncolor has-spinner')]")).click();
		
		Thread.sleep(6000);
		
		driver.close();
		
	}
	
}
