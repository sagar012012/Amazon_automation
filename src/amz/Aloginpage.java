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
	WebElement uname;
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement usernum;
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continuebtn;
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement pass;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement signin;
	
	public void clickacc()
	{
		uname.click();
	}
	public void userid(String uid)
	{
		usernum.sendKeys(uid);
	}
	public void clickbutton()
	{
		continuebtn.click();
	}
	public void userpass(String p)
	{
		pass.sendKeys(p);
	}
	public void signbutton()
	{
		signin.click();
	}

}
