package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;

public class PageObjectManager
{
	private WebDriver driver;
	 
	 private CartPage cartPage;
	 private HomePage homePage; 
	 private CheckoutPage checkoutPage;
	 
	 
	 public PageObjectManager(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 public HomePage getHomePage()
	 {
		 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	 }
	 
	 public CartPage getCartPage()
	 {
		 return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
	 }
	 
	 public CheckoutPage getCheckoutPage()
	 {
		 return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
	 }
}
