package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constents;

public class LoginPageTest extends BaseTest{

	@Test
	public void verifyLoginPageTitleTest() {
		home.navigateToLoginPage();
		String title= login.getLoginPageTitle();
		Assert.assertEquals(title, Constents.LoginPageTitle);
	}
	@Test
	public void verifyLoginWithVlidCredentialsTest() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("validusername"), prop.getProperty("validpassword"));
	}
	
	@Test
	public void verifyLoginWithInvalidCredentials() {
		home.navigateToLoginPage();
		login.doLogin(prop.getProperty("invalidusername"), prop.getProperty("invalidpassword"));
		
		Assert.assertTrue(login.isWarningMessageDisPlayed());
	}
	
	
	
	
	
	
	
	
	
	
	
}
