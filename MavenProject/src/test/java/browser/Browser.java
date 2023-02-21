package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser {
	
public static WebDriver openChromeBrwser() {
	System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browserFiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	return driver;	
	}

public static WebDriver openFirefoxBrwser() {
	System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browserFiles\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	return driver;	
	}

public static WebDriver openOperaBrwser() {
	System.setProperty("webdriver.opera.driver", "src\\test\\resources\\browserFiles\\operadriver.exe");
	WebDriver driver=new OperaDriver();
	return driver;	
	}
	
	} 

