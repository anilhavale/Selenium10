package com.JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

public class DomainName_4 extends BaseTest
{

	public static void main(String[] args)
	{
		
		openApp("chrome","https://demo.guru99.com/V1/index.php");
		
		 //Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
      //Fetching the Domain Name of the site. Tostring() change object to name.
      String domain_Name = js.executeScript("return document.domain;").toString();
        System.out.println("Domain name of the Site is : "+ domain_Name);
	}

}
