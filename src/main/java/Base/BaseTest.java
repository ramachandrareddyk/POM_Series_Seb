package Base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.HomePage;
import Pages.LoginPage;

public class BaseTest {
	
	public BasePage base;
	public Properties prop;
	public WebDriver driver;
	public HomePage home;
	public LoginPage login;
	
	
	
	
	
	@BeforeMethod
	public void setUp() {
		base= new BasePage();
		prop=base.init_properties();
		driver=base.init_browser(prop.getProperty("browser"));
		home=new HomePage(driver);
		login= new LoginPage(driver);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
