package com.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop2  extends BaseTest
{

	public static void main(String[] args) {
		
		openApp("chrome","http://demo.guru99.com/test/drag_drop.html");
	
		
		//Element(BANK) which need to drag.		
    	 WebElement From1=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        
    	//Element(DEBIT SIDE) on which need to drop.		
    	WebElement To1=driver.findElement(By.xpath("//*[@id='bank']/li"));					
     
	//Element(SALES) which need to drag.		
    	WebElement From2=driver.findElement(By.xpath("//*[@id='credit1']/a"));
       
	//Element(CREDIT SIDE) on which need to drop.  		
    	WebElement To2=driver.findElement(By.xpath("//*[@id='loan']/li"));					
    
    	//Element(500) which need to drag.		
       WebElement From3=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
       
       //Element(DEBIT SIDE) on which need to drop.		
    	WebElement To3=driver.findElement(By.xpath("//*[@id='amt7']/li"));					
        
	//Element(500) which need to drag.		
       WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
       
       //Element(CREDIT SIDE) on which need to drop.		
    	WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));					
     
	//Using Action class for drag and drop.		
    	Actions act=new Actions(driver);					

	//BANK drag and drop.		
    	act.dragAndDrop(From1, To1).build().perform();
       
	//SALES drag and drop.		
    	act.dragAndDrop(From2, To2).build().perform();
       
	//500 drag and drop debit side.		
    	act.dragAndDrop(From3, To3).build().perform();	
       
	//500 drag and drop credit side. 		
    	act.dragAndDrop(From4, To4).build().perform();		
     
	//Verifying the Perfect! message.		
	if(driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")).isDisplayed())							
    	{		
        	System.out.println("Perfect Displayed !!!");					
    	}
		else
    	{
       	System.out.println("Perfect not Displayed !!!");					
    	}		
	}
}


/* 
 
 Summary
In the above tutorials, we illustrate the drag and drop functionality of the web application through Action methods in Webdriver:
dragAndDrop(Sourcelocator, Destinationlocator)
dragAndDropBy(Sourcelocator, x-axis pixel of Destinationlocator, y-axis pixel of Destinationlocator)
To drag and drop the element first we used DragAndDrop method from the Actions class in which we pass the 2 parameters, 1st parameter is the element which we need to drag, and 2nd parameter is the element on which we need to drop the 1st element.
Second, we used the dragAndDropBy method from the Actions class in which we pass the 3 parameters, the 1st parameter is the element which we need to drag, 2nd parameter is the x-axis pixel value of the 2nd element, 3rd parameter is the y-axis pixel value of the 2nd element.
 
 
 
 
 
  
 */
