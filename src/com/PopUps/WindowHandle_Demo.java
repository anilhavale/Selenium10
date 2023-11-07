package com.PopUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class WindowHandle_Demo extends BaseTest 
{
	
	/*   
	 When you execute the above code, it launches the site and on clicking the link “Click here,” it opens up a child window in a new tab. 
	 You can close the child window, and
	 switch to the parent window once the operation is completely done.
	 Hence handling more than one window in the application. 
	 */

	public static void main(String[] args) throws InterruptedException 
	{
	
		openApp("chrome", "https://demo.guru99.com/popup.php");
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String Main_Window = driver.getWindowHandle();
		
		
		// to handle all the new opened windows
		Set<String> s1 = driver.getWindowHandles();
		
			Iterator<String> i1 = s1.iterator();
			
			while(i1.hasNext())
			{
				
			 String Child_Window = i1.next();
			 
			 if(!Main_Window.equalsIgnoreCase(Child_Window))
			 {
				 
				 // switching to the child window
				 
				 driver.switchTo().window(Child_Window);
				 
				 driver.findElement(By.name("emailid")).sendKeys("anilhavale.4@gmail.com");
				 
				 driver.findElement(By.name("btnLogin")).submit();
				 
					
					Thread.sleep(5000);
					
					// closing the child window
					//driver.close();
					
			 }
			}
		
		driver.switchTo().window(Main_Window);
		Thread.sleep(5000);
		
		// closing the parent  window
		driver.close();
		
	}
	
	
	

}
