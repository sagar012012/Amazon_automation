package amz;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amzhomepage {
	WebDriver driver;
	Amzhomepage (WebDriver d)
	{
		this.driver=d; 
		PageFactory.initElements(driver, this);// mandatory 
	}
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement search;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement searchbtn;
	void sname(String srch)
	{
		search.sendKeys(srch);
		//assertEquals(true, "shirt");
		searchbtn.click();
	}
	

}
