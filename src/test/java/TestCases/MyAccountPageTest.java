package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constents;

public class MyAccountPageTest extends BaseTest{
	
	
	@Test
	public void verifyMyAccountpageTitleTest() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("validusername"), prop.getProperty("validpassword"));
		String title=Myaccount.getMyAccountPageTitle();
		Assert.assertEquals(title, Constents.MyAccountPageTitle);
	}
	
	@Test
	public void verifyMyAccountHeaderTest() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("validusername"), prop.getProperty("validpassword"));
		Assert.assertTrue(Myaccount.isMyAccountHeaderDisplayed());
	}
	
	@Test
	public void VerifyMyOrdersHeaderTest() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("validusername"), prop.getProperty("validpassword"));
		Assert.assertTrue(Myaccount.isMyOrdrsHeaderIsDisplayed());
	}

	@Test
	public void VerifyMyAffiliateAccountHeaderTest() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("validusername"), prop.getProperty("validpassword"));
		Assert.assertTrue(Myaccount.isMyAffiliateAccountIsDisplayed());
	}
	
	@Test
	public void VerifyNewsLetterHeaderTest() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("validusername"), prop.getProperty("validpassword"));
		Assert.assertTrue(Myaccount.isNewletterIsDisplyed());
	}
}
