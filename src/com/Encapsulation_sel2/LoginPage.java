package com.Encapsulation_sel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//Declaration
	@FindBy(id="inputUsername")
	private WebElement unTB;
	
	@FindBy(name="inputPassword")
	private WebElement pwTB;
	
	@FindBy(xpath ="//button[text()='Sign In']")
	private WebElement lgnBTN;
	
	@FindBy(xpath ="//p[@class='error']")
	private WebElement errMSG;
	
	
	// Initialisation
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void setUsername() 
	{
		unTB.sendKeys("anil");
	}
	
	public void setPassword()
	{
		
		pwTB.sendKeys("rahulshettyacademy");
	}
	
	public void setPassword2()
	{
		
		pwTB.sendKeys("rahulshettyacademy2");
	}
	
	
	public void clickOnLoginButton()
	{
		lgnBTN.click();
	}
	
	
	public void verifyErrorMSG(WebDriver driver)
	{
		
		System.out.println(errMSG.isDisplayed()+ " ------- "+ errMSG.getText());
		
	}
}
