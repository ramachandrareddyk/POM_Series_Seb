package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.BasePage;
import Utilities.ElementUtilities;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	ElementUtilities utils;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		utils= new ElementUtilities(driver);
	}
	
	
	private By Username=By.id("input-email");
	private By Password= By.id("input-password");
	private By LoginBtn= By.xpath("//input[@value='Login']");
	private By forgetPassword=By.linkText("Forgotten Password");
	private By Warningmessage =By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	
	public String getLoginPageTitle() {
		return utils.doGetTitle();
	}
	
	public MyAccountPage doLogin(String username, String password) {
		utils.doSendKeys(Username, username);
		utils.doSendKeys(Password, password);
		utils.doClick(LoginBtn);
		
		return new MyAccountPage(driver);
		
	}
	
	public boolean isWarningMessageDisPlayed() {
		return utils.doIsDisplayed(Warningmessage);
	}
	
	
	
	public void clickOnForgetPassword() {
		utils.doGetText(forgetPassword);
	}
	
	
	
	
	

}
