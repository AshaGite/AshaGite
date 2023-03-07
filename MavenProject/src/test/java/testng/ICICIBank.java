package testng;

//ChangesTo ICICI Bank


import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.beust.jcommander.Parameter;

import ICICIBank.HomePage;
import browser.Browser;

public class ICICIBank extends Browser{

	private WebDriver driver;
	private HomePage homePage;
	private SoftAssert soft;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;

	@BeforeTest

	@Parameters("browser")

	public void OpenBrowser(String browserName) throws Exception {
		reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
if(browserName.equals("Chrome")) {
	driver=openChromeBrwser();
}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}		
	

	@BeforeClass
	public void rowser() {
		 homePage=new HomePage(driver);

		}
	
	@BeforeMethod
	public void OpenUrl() throws InterruptedException {
		driver.get("https://www.icicibank.com/");
		 homePage=new HomePage(driver);
		
		soft=new SoftAssert();
	}
	@Test(priority=1)
	public void verifyTextDigitalBanking () throws InterruptedException {
		homePage.ScrollDigitalBanking();
		Thread.sleep(000);
		

		String actualText=homePage.ScrollDigitalBanking();
		String expectedText="DigitalBanking";
		
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.icicibank.com/";
		
		soft.assertEquals(actualText, expectedText);
		soft.assertAll();

	}
	
	@Test(priority=2)
	public void verifyProduct() throws InterruptedException {

		homePage.clickOnOffers();


		Thread.sleep(1000);

		
		homePage.ClickOnProductOffers();
		Thread.sleep(3000);
		homePage.sendId();
		Thread.sleep(3000);

//		ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(addr.get(0));
		String actualTitle=driver.getTitle();
		String expectedTitle="Personalised Product Offers - Exciting Bank Offers | ICICI Bank";
		
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.icicibank.com/offers/product-offers/product-offers?ITM=nli_cms_OFFERS_Personalised_offers_navigation";
	
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertEquals(actualURL, expectedURL);
		soft.assertAll();
		
		
	}
	@Test(priority=3)
	public void verifyLoginButton() throws InterruptedException {

		homePage.clickOnLogin();

		homePage.sendUser();
		Thread.sleep(1000);
		homePage.sendMbNo();
		Thread.sleep(1000);

		//Thread.sleep(3000);


		String actualTitle=driver.getTitle();
		String expectedTitle="Log in to Internet Banking";
		
		
	
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertAll();
		
		
	}
	

	
	@AfterMethod
	public void close() {
		
	System.out.println("After Method");
	}
	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
	
	
	@AfterTest
	public void afterTest() {
		driver=null;
		System.gc();	}
	
	@AfterSuite
	public void afterSuite() {
	System.out.println("After suite");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
