package com.PopUps;

import org.openqa.selenium.By;

public class HiddenDivisionPopUP extends BaseTest
{
	
	/*   
	 
	 Hidden division pop is nothing but HTML code which is hidden initially, hidden division pop up also known as dialog or overlay.
	The overlay is triggered when an application user performs specific tasks like clicking a button, submitting a form, or on page load...

Examples :
Calender Popups
Contact forms
Error and success Messages

Properties of Hidden division Pop up :

1)Cannot be moved here and there
2)We can inspect the overlay
3)This is not javaScript popup
4)We can resize and customize the content of the pop-up
5)If the content is more then the pop-up size, pop shows scroll bar
6)When hidden division pop is opened, pop takes the focus from the application.
7)When pop up is closed, focus automatically goes to the application
8)Hidden division popup could be nested, i.e. a hidden division pop can have another hidden division pop up
9)Hidden division pop can hold other pop-ups/ alerts on it.
	 
	 Limitations:

We cannot perform an operation on the webpage until we close the pop up if we try to access selenium throws ElementNotClickable exception
	 
	 
	 
	  */

	public static void main(String[] args) throws InterruptedException 
	
	{

		openApp("chrome","https://chercher.tech/practice/hidden-division-popup");
		
		driver.findElement(By.className("cd-popup-trigger")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hidden Division Text");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		
		Thread.sleep(5000);
	
		
	driver.close();
	}

}
