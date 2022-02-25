package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.Constents;

public class HomePageTest extends BaseTest{
	
	@Test
	public void VerifyHomepageTitleTest() {
		String title=home.getHomePageTitle();
		
		Assert.assertEquals(title, Constents.HomePageTitle);
	}
	
	@Test
	
	public void VerifyTonavigationBarTest() {
		Assert.assertTrue(home.isTopNavigationBarExist());
	}
	
	@Test
	public void VerifySearchBoxTest() {
		Assert.assertTrue(home.isSearchBoxExist());
	}
	
	@Test
	public void VerifySearchButtonTest() {
		Assert.assertTrue(home.isSearchButtonExist());
	}
	
	
	
	
	
	

}
