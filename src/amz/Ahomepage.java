package amz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ahomepage {
	WebDriver driver;
	Ahomepage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);// mandatory 
	}
	@FindBy(xpath = "")
	WebElement home;

}
