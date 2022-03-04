package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasePage;

public class ElementUtilities extends BasePage{
	
	WebDriver driver;
	
	public ElementUtilities(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public WebElement getElement(By Locater) {
		WebElement elemnt=null;
		try {
		elemnt=driver.findElement(Locater);
		}catch(Exception e){
			e.printStackTrace();
		}
		return elemnt;
	}
	//---------*****Perform click*****------------------------//
	public void doClick(By Locater) {
		try {
			getElement(Locater).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//---------*****Perform click using actions class*****----------------//
	
	public void doActionClick(By Locater) {
		try {
			Actions act = new Actions(driver);
			act.click(getElement(Locater)).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//------------------***SendKeys***------------------------------//
	
	public void doSendKeys(By Locater, String value) {
		
		try {
			getElement(Locater).clear();
			getElement(Locater).sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//--------------*****Send keys using actions class*****----------------//
	public void doActionsSendKeys(By Locater, String value) {
		try {
			Actions act = new Actions(driver);
			act.sendKeys(getElement(Locater), value).build().perform();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//--------------*****getText*****--------------------------//
	public String doGetText(By Locater) {
		String text=null;
		try {
			text=getElement(Locater).getText();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return text;
	}
	//---------------*****IsDisplayed*****---------------------------//
	
	public boolean doIsDisplayed(By Locater) {
		boolean flag= false;
		try {
			flag=getElement(Locater).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	//--------------*****doGetTitle*****----------------------------//
	
	public String doGetTitle() {
		String title=null;
		try {
			title= driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return title;
	}
	
	//-----------------****Wait for element****-------------------//
	public void waitForAnElementToBePrasent(By locater) {
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locater));
	}
	
	

}
