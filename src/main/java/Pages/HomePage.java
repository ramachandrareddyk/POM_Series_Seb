package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasePage;
import Utilities.ElementUtilities;

public class HomePage extends BasePage{
	
	WebDriver driver;
	
	
	//page class constractor
	public HomePage(WebDriver driver) {
		this.driver=driver; 
	}
	
	//Page objects using By locater
	
	private By SearchTextBox=By.name("search");
	private By SearchButton=By.className("input-group-btn");
	private By MyAccount= By.xpath("//span[text()='My Account']");
	private By Register= By.xpath("//a[text()='Register']");
	private By Login=By.xpath("//a[text()='Login']");
	private By NavigationBar =By.xpath("//ul[@class='nav navbar-nav']");
	
	
	//action mehods
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean isSearchBoxExist() {
		//return driver.findElement(SearchTextBox).isDisplayed();
		
		return ElementUtilities.getElement(SearchButton).isDisplayed();
	}
	
	public boolean isSearchButtonExist() {
		return   driver.findElement(SearchButton).isDisplayed();
	}
	
	public boolean isTopNavigationBarExist() {
		return driver.findElement(NavigationBar).isDisplayed();
	}
	
	public void navigateToLoginPage() {
		ElementUtilities.doClick(MyAccount);
		driver.findElement(Login).click();
		
	
	}
	
	public void navigateToRegisterPage() {
		driver.findElement(MyAccount).click();
		driver.findElement(Register).click();
	}
	
	
	
	
	
	

}
