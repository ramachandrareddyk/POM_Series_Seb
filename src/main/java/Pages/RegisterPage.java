package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;
import bsh.util.Util;

public class RegisterPage extends BasePage{
	
	WebDriver driver;
	ElementUtilities  utilities;
	
	public RegisterPage(WebDriver driver) {
		this.driver= driver;
		utilities = new ElementUtilities(driver);
	}
	
	By FirstName=By.id("input-firstname");
	By LastName= By.id("input-lastname");
	By Email= By.id("input-email");
	By Teliphone = By.id("input-telephone");
	By Password = By.id("input-password");
	By ConformPassword = By.id("input-confirm");
	By NewsletterYes= By.xpath("//label[normalize-space()='Yes']");
	By NewsLetterNo= By.xpath("//label[normalize-space()='No']");
	By privacyPolacy =By.xpath("//input[@name='agree']");
	By continueBtn =By.xpath("//input[@value='Continue']");
	
	
	public String getRegisterPageTitle() {
	return utilities.doGetTitle();
	}
	
	public void doRegister(String firstname, String lastName, String email, String teliphone, String password, String subscription) {
		utilities.doSendKeys(FirstName, firstname);
		utilities.doSendKeys(LastName, lastName);
		utilities.doSendKeys(Email, email);
		utilities.doSendKeys(Teliphone, teliphone);
		utilities.doSendKeys(Password, password);
		utilities.doSendKeys(ConformPassword, password);
		if(subscription.equalsIgnoreCase("Yes")) {
			utilities.doClick(NewsletterYes);
		} else {
			utilities.doClick(NewsLetterNo);
			
		}
		utilities.doClick(privacyPolacy);
		utilities.doClick(continueBtn);
		
	}
	 

}
