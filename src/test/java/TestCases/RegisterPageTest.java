package TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.ExcelUtilities;

public class RegisterPageTest extends BaseTest{
	
	
	
	@DataProvider
	public Object[][] getRegisterTestData(){
		Object data[][]=ExcelUtilities.getTestDat("registration");
		
		return data;
	}
	
	
	
	
	@Test(dataProvider = "getRegisterTestData")
	public void registrationTest(String firstname, String lastname, String email, String telephone, String password, String subscribe) {
		home.navigateToRegisterPage();
		register.doRegister(firstname, lastname, email,telephone,password,subscribe);
		
		Assert.assertTrue(accountpage.verifySuccessMessage());
	}
	
	

}
