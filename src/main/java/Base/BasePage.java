package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
WebDriver driver;
Properties prop;


public WebDriver init_browser(String browser) {
	
	if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	} else if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver= new FirefoxDriver();
	} else if(browser.equalsIgnoreCase("safari")){
		WebDriverManager.getInstance(SafariDriver.class).setup();
		driver= new SafariDriver();
	} else {
		System.out.println("Please pass the correct browser");
	}
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	

	
	return driver;
	
}


public Properties init_properties() {
	
	String path="C:\\Users\\LENOVO\\eclipse-workspace\\OpenCartFrontEnd\\src\\main\\java\\ConfigProperties\\Config.properties";
	prop= new Properties();
	try {
		FileInputStream fs=  new FileInputStream(path);
		
		prop.load(fs);
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	return prop;
	
}

	
	
	
	
	

}
