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

import browser.Browser;
import trip.Booking;
import trip.MYBooking;
import utils.Utility;


public class TestNgMyTripApp extends Browser {
WebDriver driver;
private SoftAssert softAssert;
private String TestID;
@BeforeSuite
public void beforeSuite() {
System.out.println("Before Suite");
}
@Parameters("browser")

@BeforeTest
public void OpenBrowser(String browser) {
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

/*@BeforeClass
public void OpenBrowser(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usha\\Downloads\\chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver();	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
*///}

@BeforeMethod
public void OpenURL(){
	System.out.println("Before Method");
	driver.get("https://www.mytrip.com/");
	MYBooking mYBooking=new MYBooking(driver);
	mYBooking.ClearCookies();
	mYBooking.ClickOnBooking();
	softAssert=new SoftAssert();
}
@Test(priority=1)
public void VerifyMyBooking() {
	TestID="T101";
	System.out.println("test-A");
	Booking booking=new Booking(driver);
	booking.getTextBooking();
	
//String actualURL=driver.getCurrentUrl();
	/*String expectedURL="https://www.mytrip.com/rf/order-login";
	
	String actualText=booking.getTextBooking();
	*///String expectedText="My Bookings";
	
	String actualTitle=driver.getTitle();
	String expectedTitle="Best deals to fly! Save on tickets, fares & airlines | Mytrip";
	//Assert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertAll();
	//Assert.assertEquals(actualTitle, expectedTitle);
//	if(actualTitle.equals(expectedTitle)) {
//System.out.println("Pass");	
//}
//else {
//	System.out.println("Fail");
//}
}

@Test(priority=2)
public void VerifySignInPage() throws InterruptedException {
	TestID="T102";
	System.out.println("test-B");
	Booking booking=new Booking(driver);
	Thread.sleep(1000);
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
	String expectedTitle="Facebook123";
	//Assert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertAll();
//if(actualTitle.equals(expectedTitle)) {
//	System.out.println("Pass");
//}
//else {
//	System.out.println("Fail");
//}
}

//@AfterMethod
//public void afterMethod(ITestResult result) throws IOException, InterruptedException {
//	if(ITestResult.FAILURE == result.getStatus());
//		Utility.captureScreenshot(driver, TestID);
//	}

@AfterClass
public void closeBrowser() {
	System.out.println("After Class");
//driver.quit();
}
@AfterSuite
public void afterSuite() {
	System.out.println("After suite");
}
@AfterTest
public void afterTest() {
	System.out.println("After Test");
	driver=null;
	System.gc();
	}


}


