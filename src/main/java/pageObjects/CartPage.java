package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
	WebDriver driver;
	String parentWindow;
	String childWindow;


	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//input[@class='nav-input'])[2]")
	private WebElement searchtext;

	@FindBy(xpath="(//input[@class='nav-input'])[1]")
	private WebElement clickSearch;

	@FindBy(xpath="(//div[@class='s-item-container'])[1]/div[2]/div")
	private WebElement selectShoe;

	@FindBy(xpath="//*[@id='add-to-cart-button']")
	private WebElement addtoCart;

	public void select_Product() {
		searchtext.sendKeys("shoes");;
	}

	public void clickOnSearch()
	{
		clickSearch.click();
	}

	public void selectingShoe()
	{
		selectShoe.click();
	}

	public void add_to_cart() throws Exception
	{
		addtoCart.click();
	}
}
