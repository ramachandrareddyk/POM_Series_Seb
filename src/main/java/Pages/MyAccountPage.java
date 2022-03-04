package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;

public class MyAccountPage extends BasePage{
	
	WebDriver driver;
	ElementUtilities utils;
	
	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
		utils= new ElementUtilities(driver);
		
	}
	
	
	By MyAccountHeader= By.xpath("//h2[normalize-space()='My Account']");
	By MyOrdersHeader= By.xpath("//h2[normalize-space()='My Orders']");
	By MyAffiliateAccount = By.xpath("//h2[normalize-space()='My Affiliate Account']");
	By NewsLetter =By.xpath("//h2[normalize-space()='Newsletter']");
	
	public String getMyAccountPageTitle() {
		return utils.doGetTitle();
	}
	
	public boolean isMyAccountHeaderDisplayed() {
		return utils.doIsDisplayed(MyAccountHeader);
	}
	
	public boolean isMyOrdrsHeaderIsDisplayed() {
		return utils.doIsDisplayed(MyOrdersHeader);
	}
	
	public boolean isMyAffiliateAccountIsDisplayed() {
		return utils.doIsDisplayed(MyAffiliateAccount);
	}
	
	public boolean isNewletterIsDisplyed() {
		return utils.doIsDisplayed(NewsLetter);
	}
	
	

}
