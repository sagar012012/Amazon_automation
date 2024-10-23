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
		@BeforeMethod
		void setup()
		{
//			WebDriverManager.chromedriver().setup();
//		    driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sagar.Vishwakarma\\Chromedriver-64\\chromedriver.exe");
			driver= new ChromeDriver();
//			driver.get("https://saucedemo.com/");
			driver.get("https://www.amazon.in/");//https://www.amazon.in/
			driver.manage().window().maximize();
			
		}
//		@Test(priority = 1)
//		void testloginpage()
//		{
//			Aloginpage login=new Aloginpage(driver);
//			login.clickacc();
//			login.userid("sagarvish.009@gmail.com");
//			login.clickbutton();
//			login.userpass("sagar@123");
//			login.signbutton();
//		}
		@Test()
		void homemage()
		{
			Amzhomepage home= new Amzhomepage(driver);
			home.sname("shirt");
			home.sbtn();
			home.shirt();
		}
//		@AfterMethod
//		void teardown()
//		{
//			driver.quit();
//		}
}

