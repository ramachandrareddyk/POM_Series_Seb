package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.BasePage;
import Utilities.ElementUtilities;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	private By Username=By.id("input-email");
	private By Password= By.id("input-password");
	private By LoginBtn= By.xpath("//input[@value='Login']");
	private By forgetPassword=By.linkText("Forgotten Password");
	private By Warningmessage =By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	
	public String getLoginPageTitle() {
		return ElementUtilities.doGetTitle();
	}
	
	public void doLogin(String username, String password) {
		ElementUtilities.doSendKeys(Username, username);
		ElementUtilities.doSendKeys(Password, password);
		ElementUtilities.doClick(LoginBtn);;
		
	}
	
	public boolean isWarningMessageDisPlayed() {
		return ElementUtilities.doIsDisplayed(Warningmessage);
	}
	
	
	
	public void clickOnForgetPassword() {
		ElementUtilities.doGetText(forgetPassword);
	}
	
	
	
	
	

}
