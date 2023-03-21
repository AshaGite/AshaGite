package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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

import Rediff.mail.Shopping;
import browser.Browser;

public class TestNG_Rediff_Mail extends Browser {
private WebDriver driver;
private Shopping shopping;
private SoftAssert soft;
static ExtentTest test;
static ExtentHtmlReporter reporter;



@BeforeTest
@Parameters("browser")

public void OpenBrowser(String browser) throws Exception {
	reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
	ExtentReports extend = new ExtentReports();
	extend.attachReporter(reporter);
		if(browser.equals("Chrome")) {
			driver=openChromeBrwser();
		}
		if(browser.equals("Firefox")) {
			driver=openFirefoxBrwser();
		}
		if(browser.equals("Opera")) {
			driver=openOperaBrwser();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void openBrowser() {
		shopping=new Shopping(driver);	

	}
	@BeforeMethod
	public void openURL() throws InterruptedException {

		driver.get("https://www.rediff.com/");
		shopping=new Shopping(driver);

		shopping.ClickOnShopping();
soft=new SoftAssert();
		
		

	}
	
	@Test(priority=2)
	public void verifyFootwear() throws InterruptedException {
		Thread.sleep(3000);

shopping.clickOnAllCategories();
		Thread.sleep(3000);
		
		shopping.clickFootwear();
		Thread.sleep(1000);
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://shopping.rediff.com/categories/footwear/cat-10971/?sc_cid=inhome_icon|fixcat_browse";
		String actualTitle=driver.getTitle();
		String expectedTitle="Buy Casual Shoes (Men's) Online @ Best Price in India";
		Assert.assertEquals(actualURL,expectedURL);
		Assert.assertEquals(actualTitle,expectedTitle);
//		SoftAssert soft=new SoftAssert();
//		soft.assertEquals(actualURL, expectedURL);
//		soft.assertEquals(actualTitle,expectedTitle);
//	soft.assertAll();
	}
	
	
	
	
	@Test(priority=1)
	public void verifyCasualBag() throws InterruptedException {
		Thread.sleep(3000);

		shopping.clickOnWomen();
		Thread.sleep(1000);

		shopping.clickOnHandBags();
		shopping.clickOnCasualBags();
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://shopping.rediff.com/categories/casual-bags/cat-9786/?sc_cid=inhome_icon|fixcat_womensclothing|browse";
	
	String actualTitle=driver.getTitle();
	String expectedTitle="Collection Of Stylish Casual Leather Handbags For Women Online Rediff Shopping";
	Assert.assertEquals(actualURL,expectedURL);
	Assert.assertEquals(actualTitle,expectedTitle);
//	SoftAssert soft=new SoftAssert();
//
//	soft.assertEquals(actualURL, expectedURL);
//	soft.assertEquals(actualTitle, expectedTitle);
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
		System.gc();	
		}
	
	@AfterSuite
	public void afterSuite() {
	System.out.println("After suite");	
	}
}
	
	
