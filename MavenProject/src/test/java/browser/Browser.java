package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Browser {
	
public static WebDriver openChromeBrwser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	return driver;	
	}

public static WebDriver openFirefoxBrwser() {
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.32.1-win32\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	return driver;	
	}

public static WebDriver openOperaBrwser() {
	System.setProperty("webdriver.opera.driver", "C:\\All JAVA files\\operadriver_win32\\operadriver.exe");
	WebDriver driver=new OperaDriver();
	return driver;	
	}
	
	} 

