package testng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.ITestResult;
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

import browser.Browser;
import trip.Booking;
import trip.MYBooking;
import utils.Utility;

public class TestNgMyTripApp extends Browser {
WebDriver driver;
private MYBooking mYBooking;
private Booking booking;

private SoftAssert softAssert;
private String TestID;
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
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}

@BeforeClass
public void OpenBrowser(){
	 softAssert=new SoftAssert();
mYBooking=new MYBooking(driver);
booking=new Booking(driver);


			
}

@BeforeMethod
public void OpenURL(){
	System.out.println("Before Method");
	driver.get("https://www.mytrip.com/");
	 mYBooking=new MYBooking(driver);
	mYBooking.ClearCookies();
	mYBooking.ClickOnBooking();
	booking=new Booking(driver);

	softAssert=new SoftAssert();
}
@Test(priority=1)
public void VerifyMyBooking() throws InterruptedException {
	TestID="T101";
	System.out.println("test-A");
	booking.getTextBooking();
String actualText=booking.getTextBooking();
String expectedText="Welcome! Please log in to proceed.";
Thread.sleep(1000);
	
	softAssert.assertEquals(actualText, expectedText);
	softAssert.assertAll();
}

@Test(priority=2)
public void VerifySignInPage() throws InterruptedException {
	TestID="T102";
	System.out.println("test-B");
	Thread.sleep(000);
	booking.SendEmail();
	Thread.sleep(3000);
	booking.ClickOnSignIn();
	Thread.sleep(5000);

	
	booking.SendEmailIdOrMbNo();
	Thread.sleep(3000);
	booking.SendPassward();
	Thread.sleep(1000);
	booking.ClickOnLogin();
	String actualTitle=driver.getTitle();
	String expectedTitle="Facebook";
	//Assert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertAll();

}

@AfterMethod
public void afterMethod(ITestResult result) throws IOException, InterruptedException {
	if(ITestResult.FAILURE == result.getStatus());
	{
		Utility.takeScreenshot(driver,TestID);
	}			Thread.sleep(2000);
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(0));
}

@AfterClass
public void closeBrowser() {
	System.out.println("After Class");
	driver.quit();
	mYBooking=null;
	booking=null;
}
@AfterTest
public void afterTest() {
	System.out.println("After Test");
	driver=null;
	System.gc();
	}
@AfterSuite
public void afterSuite() {
	System.out.println("After suite");
}



}


