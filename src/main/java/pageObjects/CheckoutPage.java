package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;
import jxl.Cell;
import managers.FileReaderManager;

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
	
	@FindBy(xpath="//input[@id='log']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='pwd']")
	private WebElement password;
	
	
	public void cart()
	{
		cart.click();
	}

	public void checkout()
	{
		checkout.click();
	}
	
	public void enterDetails(String sheet, String uniqueName) throws Exception
	{
		Cell[] record=null;
		try{FileReaderManager.getInstance().getConfigReader();
		record=ConfigFileReader.readExcel(sheet,uniqueName);}catch(Exception e){}

		String un = record[1].getContents().trim();
		String pwd = record[1].getContents().trim();
		
		userName.sendKeys(un);
		Thread.sleep(5000);
		password.sendKeys(pwd);
		Thread.sleep(5000);
		
	}

}
