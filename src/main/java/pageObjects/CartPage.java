package pageObjects;

import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
	WebDriver driver;
	int productNumber ;
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//	 	public void choose_to_buy_the_first_item() {
	//		 List<WebElement> items = driver.findElements(By.xpath("//a[contains(text(),'More Details >')]"));
	//		 items.get(0).click();

	//	 WebElement addToCart = driver.findElement(By.xpath("//input[@value='Add To Cart']"));
	//	 addToCart.click(); 

	@FindBy(xpath="//a[contains(text(),'More Details >')]")
	private List<WebElement> items;

	@FindBy(xpath="//input[@value='Add To Cart']")
	private WebElement addtoCart;

	public void select_Product(int productNumber) {
		items.get(productNumber).click();
	}

	public void add_to_cart()
	{
		addtoCart.click();
	}
}
