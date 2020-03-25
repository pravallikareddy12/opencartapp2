Feature: OpenCartApplication 
  In order to create a webpage
  As a e-commerce vendor
  I want to get access to the portal
  
  Background: these are the steps common for every scenario to be followed
  Given I have browser with opencartpage 
  
  
  Scenario: ValidRegisterCredentail
  When I enter email as 'pravallika12@gmail.com' and I enter password as 'sunny123'
  Then my account should access to the portal with title as 'My Account'
  
  Scenario: ClickOnDesktops
  When I click on the product Desktops
 Then I should get all Desktops
   
   Scenario: ClickOnLaptops and Notebooks
   When I click on the product Laptops and Notebooks
   Then I should get all Laptops and Notebooks
   
    Scenario: ClickOnComponents
   When I click on the product Components
   Then I should get all Components
   
    Scenario: ClickOnTablets
   When I click on the product Tablets
  Then I should get all Tablets
  Scenario Outline: ClickOnShopping Cart
  When I enter '<email>' and '<password>' click on shopping cart
   Then I should get the products which I added into the cart
   
   Examples:
   |email|password|
   |pravallika12@gmail.com|sunny123|