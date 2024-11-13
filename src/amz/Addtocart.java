package amz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	WebDriver driver;
	Addtocart(WebDriver d)
	{
		this.driver=d; 
		PageFactory.initElements(driver, this);// mandatory 
	}
	@FindBy(xpath = "//span[@id='nav-cart-count']")
	WebElement addToCartButton;
	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	WebElement ProceedtoBuy;
//	@FindBy(xpath = "//a[@id='add-new-address-popover-link']")
//	WebElement aa ;
	@FindBy(xpath = "//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")
	WebElement userAddress ;
	public void addtocart()
	{
		addToCartButton.click();
		ProceedtoBuy.click();
		
	}
	public void addAddress()
	{
//		aa.click();
		userAddress.click();
}
	
}
