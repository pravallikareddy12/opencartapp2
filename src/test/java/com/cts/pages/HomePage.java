  package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private static By waitLoc = By.xpath("//a[@title='My Account']");
	private static By myAccLocator = By.xpath("//a[@title='My Account']");
	private static By loginLoc = By.linkText("Login");
	private static WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public static void explicitWait() {
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(waitLoc));
		
	}
	
	public static void clickOnMyAccount() 
	{
		
       driver.findElement(myAccLocator).click();
		
	}public static void clickOnLogin() 
	{
		
	       driver.findElement(loginLoc).click();
	}
	
}
