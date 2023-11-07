package com.PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadPopup2 extends BaseTest
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	
		openApp("chrome", "https://www.google.com/gmail/about/");
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("havaleindustries@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		Thread.sleep(6000);
		
		
		driver.findElement(By.name("Passwd")).sendKeys("Rani@9591177932");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//div[@gh='cm']")).click();
		Thread.sleep(4000);
		
		// maximize the message pane
		
		driver.findElement(By.xpath("//img[@aria-label='Full screen (Shift for pop-out)']")).click();
		
		
		driver.findElement(By.xpath("//div[@aria-label='Attach files']/div/div/div")).click();
		
		Thread.sleep(4000);
		StringSelection filepath = new StringSelection("C:\\Users\\LENOVO\\FileUplodPopUp.doc");
		
		Toolkit t = Toolkit.getDefaultToolkit();
		
		Clipboard c = t.getSystemClipboard();
		
		c.setContents(filepath, null);
		
		
		Robot r = new Robot();
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
		//driver.close();
		
	}
	
}
