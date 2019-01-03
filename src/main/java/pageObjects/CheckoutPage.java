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


	@FindBy(xpath="(//a[@class='a-button-text a-text-center'])[1]")
	private WebElement checkout;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	


	public void checkout()
	{
		checkout.click();
	}
	
	public void continuebtn()
	{
		continueButton.click();	
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
		continuebtn();
		password.sendKeys(pwd);
		Thread.sleep(5000);
		
	}

}
