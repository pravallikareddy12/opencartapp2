package com.cts.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.pages.MainPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinitions {
WebDriver driver;
@Given("I have browser with opencartpage")
public void i_have_browser_with_opencartpage() {

	System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	ChromeOptions chrome = new ChromeOptions();
	chrome.setAcceptInsecureCerts(true);
	driver = new ChromeDriver(chrome);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://opencart.abstracta.us/");

}


@When("I enter email as {string} and I enter password as {string}")
public void i_enter_email_as_and_I_enter_password_as(String email, String password) {
 HomePage homepage = new HomePage(driver);
 homepage.clickOnMyAccount();
   homepage.clickOnLogin();
   LoginPage loginpage = new LoginPage(driver);
   loginpage.enteremail(email);
   loginpage.enterpassword(password);
   loginpage.clickOnLogin();
   
}

@Then("my account should access to the portal with title as {string}")
public void my_account_should_access_to_the_portal_with_title_as(String string) {
	LoginPage loginpage = new LoginPage(driver);
  String actualTitle = loginpage.getCurrentTitle();
  String expectedTitle =loginpage.getCurrentTitle();
  Assert.assertEquals(expectedTitle, actualTitle);

}
@When("I click on the product Desktops")
public void i_click_on_the_product_Desktops() {
	MainPage mainpage = new MainPage(driver);
	mainpage.clickOnDesktops();
	mainpage.clickOnseeall();
  // MainPage.clickOnDesktops(driver);
   //MainPage.clickOnseeall(driver);
}

@Then("I should get all Desktops")
public void i_should_get_all_Desktops() {
	MainPage mainpage = new MainPage(driver);
	String actualTitle = mainpage.getDesktopTitle();
	Assert.assertEquals("Desktops", actualTitle);
	System.out.println(actualTitle);

}

@When("I click on the product Laptops and Notebooks")
public void i_click_on_the_product_Laptops_and_Notebooks() {
	MainPage mainpage = new MainPage(driver);
	mainpage.clickOnLaptopsandNotebooks();
	mainpage.clickOnShowAll();
    
}

@Then("I should get all Laptops and Notebooks")
public void i_should_get_all_Laptops_and_Notebooks() {
	MainPage mainpage = new MainPage(driver);
	String actualTitle =mainpage.getLaptopTitle();
Assert.assertEquals("Laptops & Notebooks", actualTitle);
	System.out.println(actualTitle);
}

@When("I click on the product Components")
public void i_click_on_the_product_Components() {
	MainPage mainpage = new MainPage(driver);
	mainpage.clickOnComponents();
	mainpage.clickOnMonitors();
	
   
}

@Then("I should get all Components")
public void i_should_get_all_Components() {
	MainPage mainpage = new MainPage(driver);
	String actualTitle = mainpage.getComponentsTitle();
	Assert.assertEquals("Monitors", actualTitle);
	System.out.println(actualTitle);

}

@When("I click on the product Tablets")
public void i_click_on_the_product_Tablets() {
	MainPage mainpage = new MainPage(driver);
  mainpage.clickOnTablets();
}

@Then("I should get all Tablets")
public void i_should_get_all_Tablets() {
	MainPage mainpage = new MainPage(driver);
	String actualTitle =mainpage.getTabletsTitle();
	Assert.assertEquals("Tablets", actualTitle);
	System.out.println(actualTitle);
}
@When("I enter {string} and {string} click on shopping cart")
public void i_enter_and_click_on_shopping_cart(String email, String password) {
	HomePage homepage = new HomePage(driver);
	 homepage.clickOnMyAccount();
	   homepage.clickOnLogin();
	   LoginPage loginpage = new LoginPage(driver);
	   loginpage.enteremail(email);
	   loginpage.enterpassword(password);
	   loginpage.clickOnLogin();
	   MainPage mainpage = new MainPage(driver);
		mainpage.clickOnTablets();
		mainpage.clickOnAddtoCart();
		mainpage.ClickOnShoppingCart();
	
}
@Then("I should get the products which I added into the cart")
public void i_should_get_the_products_which_I_added_into_the_cart() {
	MainPage mainpage = new MainPage(driver);
	String actualTitle = mainpage.getShoppingCartTitle();
	Assert.assertEquals("Samsung Galaxy Tab 10.1", actualTitle);
	System.out.println(actualTitle);
}
}






