package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;

public class AccountCreatedPage extends BasePage{
	
	WebDriver driver;
	ElementUtilities utilities;
	 public AccountCreatedPage(WebDriver driver) {
		this.driver=driver;
		utilities= new ElementUtilities(driver);
		
		
	}
	 
	 
	 
	 By AccountCreatedSuccessMessageHeader= By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
	 
	 
	 
	 public String getAccountCreatedPageHeader() {
		return utilities.doGetTitle();
	 }
	 
	 public boolean verifySuccessMessage() {
		 
		 return utilities.doIsDisplayed(AccountCreatedSuccessMessageHeader);
	 }
	
	

}
