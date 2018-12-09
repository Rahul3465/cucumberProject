package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage
{
	WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[contains(text(),'Car')]")
	private WebElement cart;

	@FindBy(xpath="//span[contains(text(),'Continue')]")
	private WebElement checkout;

	public void cart()
	{
		cart.click();
	}

	public void checkout()
	{
		checkout.click();
	}

}
