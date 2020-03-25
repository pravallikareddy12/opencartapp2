package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private static By emailLocator=By.id("input-email");
	private static By passwordLocator=By.id("input-password");
	private static By LoginLocator=By.xpath("//input[@value='Login']");
	 private static By waitLocator = By.xpath("//h2[text()='My Orders']");
	 private static WebDriver driver;
		public LoginPage(WebDriver driver) {
			this.driver=driver;
		}

	public static void enteremail(String email)
	{
	driver.findElement(emailLocator).sendKeys(email);
	}

	public static void enterpassword(String password)
	{
	driver.findElement(passwordLocator).sendKeys(password);
	}

	public static void clickOnLogin( )
	{
	driver.findElement(LoginLocator).click();
	}

	public static void explicitWait() {
	WebDriverWait wait = new WebDriverWait(driver,50);
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(waitLocator));
	}
	public static String getCurrentTitle() {
		String expectedTitle = "My Account";
		String actualTitle = driver.getTitle();
		return actualTitle;
	}
	}



