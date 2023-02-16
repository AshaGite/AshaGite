package testng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browser.Browser;
import pomClass.LoginOrSignUpPage;
import pomClass.SignUpPage;
import utils.Utility;

public class TestNGFacebook extends Browser {
private WebDriver driver;
 SignUpPage signUpPage;
 LoginOrSignUpPage loginOrSignUpPage;
private String TestID;


@BeforeSuite
public void beforeSuit() {
	System.out.println("before suit");
}
@Parameters("browser")
@BeforeTest
public void OpenBrowser(String browser ) throws IOException {
	if(browser.equals("Chrome")) {
		driver=openChromeBrwser();
	}
	if(browser.equals("Firefox")) {
	driver=openFirefoxBrwser();	
	}
	if(browser.equals("Opera")) {
		driver=openOperaBrwser();
	}
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}


@BeforeMethod
public void beforeMethod() throws IOException, InterruptedException {
	System.out.println("Before Method");
	driver.get("https://www.facebook.com");

	LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
loginOrSignUpPage.sendUser(Utility.getDataFromExcel("TestData", 1, 0));
	loginOrSignUpPage.sendPass(Utility.getDataFromExcel("TestData", 1, 1));
	loginOrSignUpPage.ClickOnCreatNewAccount();
	

	
}

	
@Test(priority=1,enabled=false)
public void verifyTermsLink() throws InterruptedException {
TestID="T101";

	System.out.println("Test-A");
	SignUpPage  signUpPage=new SignUpPage(driver); 
	signUpPage.ClickOnTerms();
	
	Thread.sleep(3000);
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	String actualTitle=driver.getTitle();
	String expectedTitle="Facebook";
	
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actualTitle, expectedTitle);
	soft.assertNotEquals(actualTitle, expectedTitle);
	soft.assertAll();
}	
	
//	if(actualTitle.equals(expectedTitle)) {
//		System.out.println("Pass");
//	}
//	else {
//		System.out.println("Fail");
//	}

@Test(priority=2)
public void verifyprivacyPolicy() throws InterruptedException {
	TestID="T102";
	System.out.println("Test-B");
	Thread.sleep(3000);
	SignUpPage  signUpPage=new SignUpPage(driver); 
	signUpPage.ClickOnprivacyPolicy();
	
	Thread.sleep(3000);
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	String actualText=signUpPage.getTextprivacyPolicy();
	String expectedText="Privacy Policy ";

	SoftAssert soft=new SoftAssert();
	soft.assertEquals(actualText, expectedText);
	soft.assertNotEquals(actualText, expectedText);
	soft.assertAll();

//if(actualText.equals(expectedText)) {
//	System.out.println("Pass");
//}
//else {
//	System.out.println("Fail");
//	}

}
@Test(priority=3)
public void verifycookiesPolicy() throws InterruptedException {
	TestID="T103";
	System.out.println("Test-c");
	Thread.sleep(3000);
	SignUpPage  signUpPage=new SignUpPage(driver); 
	signUpPage.ClickOnCookiesPolicy();
	Thread.sleep(3000);
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
String actualText=signUpPage.getTextCookiesPolicy();
String expectedText="Cookies Policy";

SoftAssert soft=new SoftAssert();
soft.assertEquals(actualText, expectedText);
soft.assertNotEquals(actualText, expectedText);
soft.assertAll();
}

//if(actualText.equals(expectedText)) {
//	System.out.println("Pass");
//}
//else {
//	System.out.println("Fail");
//	}
//
//}


@AfterMethod
public void afterMethod() throws InterruptedException {
	
public void afterMethod(ITestResult result) throws IOException, InterruptedException {
	if(ITestResult.FAILURE == result.getStatus());{
		Utility.captureScreenshot(driver, TestID);
	}
//driver.close();
Thread.sleep(3000);
ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(addr.get(0));
}
@AfterClass
public void clearPomObject() {
	driver.quit();
}
@AfterSuite
public void afterSuite() {
	
}
@AfterTest
public void close() {
	driver=null;
	System.gc();	
}
}


	

