package com.WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoGetTextContent_10  extends BaseTest
{

	public static void main(String[] args) {
		// A selenium script written to get text contetn of the link text.
		
	/* 	openApp("firefox","https:/browserstack.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Locating the element 

		WebElement e = driver.findElement(By.id("signupModalButton"));


		//using getText method the retrieve the text of the element

		System.out.println(e.getText());
		
	*/
		
		openApp("firefox", "https://testsigma.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//a[@class='show_schedule btn_secondary black_btn']
		
		WebElement TextContent = driver.findElement(By.xpath("//a[@class='show_schedule btn_secondary black_btn']"));
		String txt = TextContent.getText();
		System.out.println("  the text content of the element is : "+ txt);
		driver.quit();
		
	}

}
