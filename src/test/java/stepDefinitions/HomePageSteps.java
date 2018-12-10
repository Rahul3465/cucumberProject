package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import pageObjects.HomePage;

public class HomePageSteps
{
	TestContext testContext;
	HomePage homePage;
	
	public HomePageSteps(TestContext context)
	{
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Exception
	{
		homePage = testContext.getPageObjectManager().getHomePage();
		homePage.navigateTo_HomePage();
	}

}
