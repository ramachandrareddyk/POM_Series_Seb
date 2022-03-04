package Base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.AccountCreatedPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.RegisterPage;

public class BaseTest {
	
	public BasePage base;
	public Properties prop;
	public WebDriver driver;
	public HomePage home;
	public LoginPage login;
	public MyAccountPage Myaccount;
	public RegisterPage register;
	public AccountCreatedPage accountpage;
	
	
	
	
	
	@BeforeMethod
	public void setUp() {
		base= new BasePage();
		prop=base.init_properties();
		driver=base.init_browser(prop.getProperty("browser"));
		home=new HomePage(driver);
		login= new LoginPage(driver);
		Myaccount= new MyAccountPage(driver);
		register = new RegisterPage(driver);
		accountpage= new AccountCreatedPage(driver);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	

}
