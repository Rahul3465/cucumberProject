package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CartPage;

public class CartPageSteps
{
	TestContext testContext;
	 CartPage cartPage;
	 
	 public CartPageSteps(TestContext context) {
	 testContext = context;
	 cartPage = testContext.getPageObjectManager().getCartPage();
	 }
	 
	 @When("^choose to buy the first item$")
		public void choose_to_buy_the_first_item()
		{
			cartPage = testContext.getPageObjectManager().getCartPage();
			cartPage.select_Product(0);
			cartPage.add_to_cart();
		}
}
