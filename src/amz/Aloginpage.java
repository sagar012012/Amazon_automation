package amz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Aloginpage {
	
	//with page factory
	WebDriver driver;
	Aloginpage(WebDriver d)
	{
		this.driver=d; 
		PageFactory.initElements(driver, this);// mandatory 
	}
	
	@FindBy(xpath = "//span[normalize-space()='Account & Lists']")
	WebElement signInButton;
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement emailField;
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continueButton;
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement passwordField;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement submitLogin;
	
	public void clickSignIn()
	{
		signInButton.click();
	}
	public void enterEmail(String email)
	{
		emailField.sendKeys(email);
		continueButton.click();
	}
	
	public void enterPassword(String password)
	{
		passwordField.sendKeys(password);
		submitLogin.click();
	}
	

}
