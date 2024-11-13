package amz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amz.Asetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Asetup {
		WebDriver driver;
		Aloginpage Aloginpage;
		Amzhomepage Amzhomepage;
		Addtocart Addtocart;
		@BeforeMethod
		void setup()
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar.Vishwakarma\\Chromedriver-64\\chromedriver.exe");
//			driver= new ChromeDriver();
//			driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
			driver.get("https://www.amazon.in/");//https://www.amazon.in/
			driver.manage().window().maximize();
			Aloginpage = new Aloginpage(driver);
			Amzhomepage = new Amzhomepage(driver);
			Addtocart  = new Addtocart(driver);

			
		}
		@Test(priority = 1)
		void Testpage()
		{
			//Aloginpage ap = new Aloginpage(driver);
			Aloginpage.clickSignIn();
			Aloginpage.enterEmail("sagarvish.009@gmail.com");
			Aloginpage.enterPassword("sagar@123");
			
			Amzhomepage.sname("shirt");
			
			Addtocart.addtocart();
			Addtocart.addAddress();

		}
//		@Test(priority = 2)
//		void homemage()
//		{
//			Amzhomepage home= new Amzhomepage(driver);
//			home.sname("shirt");
//			home.sbtn();
//			home.shirt();
//		}
//		@Test(priority = 2)
//		void AddtoCart()
//		{
//			Addtocart.addtocart();
//			
//		}
//		@AfterMethod
//		void teardown()
//		{
//			driver.quit();
//		}
}

