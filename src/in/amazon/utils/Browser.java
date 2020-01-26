package in.amazon.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	static WebDriver driver;
	
public static WebDriver getObject(String browserName) throws java.lang.Exception {
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
			driver = new FirefoxDriver();
			
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjula\\Downloads\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			throw new Exception("Invalid browser name");
		}
		
		return driver;
		
	}
	

}
