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
import pomClass.LoginOrSignUpPage;
import pomClass.SignUpPage;
import utils.Utility;
public class TestNGFacebook extends Browser {
WebDriver driver;
 private  LoginOrSignUpPage loginOrSignUpPage;
private SignUpPage signUpPage;
private String TestID;
private SoftAssert softAssert;

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
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
}
@BeforeClass
public void beforeClass() {
	loginOrSignUpPage=new LoginOrSignUpPage(driver);
	softAssert=new SoftAssert();
}


@BeforeMethod
public void beforeMethod() throws Exception {
	
	System.out.println("Before Method");
	driver.get("https://www.facebook.com");
Thread.sleep(1000);
	LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
	loginOrSignUpPage.sendUser(Utility.getDataFromExcel("src/test/resources/TestData/ProjectTestData/Rani.xlsx", "Asha", 1,0));
	loginOrSignUpPage.sendPass(Utility.getDataFromExcel("src/test/resources/TestData/ProjectTestData/Rani.xlsx", "Asha", 1,1));
	loginOrSignUpPage.ClickOnCreatNewAccount();
	
	softAssert=new SoftAssert();

	
}

	
@Test
public void verifyTermsLink() throws Exception {
	
	TestID="T101";

	System.out.println("Test-A");
	SignUpPage  signUpPage=new SignUpPage(driver); 
	signUpPage.sendFirstName(Utility.getDataFromExcel("src//test//resources//TestData//ProjectTestData//Rani.xlsx", "Asha", 1,0));
	signUpPage.sendLastName(Utility.getDataFromExcel("src//test//resources//TestData//ProjectTestData//Rani.xlsx", "Asha", 1,2));
	signUpPage.sendMob(Utility.getDataFromExcel("src//test//resources//TestData//ProjectTestData//Rani.xlsx", "Asha", 1,1));
	
	signUpPage.ClickOnTerms();
	
	Thread.sleep(3000);
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	Thread.sleep(2000);
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://www.facebook.com/legal/terms/update1234";
//	if(actualURL.equals(expectedURL)) {
//		System.out.println("pass");
//	}
//	else {
//		System.out.println("Fail");
//	}
	softAssert.assertEquals(actualURL, expectedURL);
	softAssert.assertAll();
}	
	

@Test
public void verifyprivacyPolicy() throws Exception {
	TestID="T102";
	System.out.println("Test-B");
	Thread.sleep(3000);
	SignUpPage  signUpPage=new SignUpPage(driver); 
	signUpPage.sendFirstName(Utility.getDataFromExcel("src//test//resources//TestData//ProjectTestData//Rani.xlsx", "Asha", 1,0));
	signUpPage.sendLastName(Utility.getDataFromExcel("src//test//resources//TestData//ProjectTestData//Rani.xlsx", "Asha", 1,2));
	signUpPage.sendMob(Utility.getDataFromExcel("src//test//resources//TestData//ProjectTestData//Rani.xlsx", "Asha", 1,1));
	
	signUpPage.ClickOnprivacyPolicy();
	
	Thread.sleep(3000);
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	Thread.sleep(3000);
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://www.facebook.com/";
//	if(actualURL.equals(expectedURL)) {
//		System.out.println("pass");
//	}
//	else {
//		System.out.println("Fail");
//	}
	softAssert.assertEquals(actualURL, expectedURL);	
	softAssert.assertAll();


}
@Test

public void verifycookiesPolicy() throws Exception {
	TestID="T103";
	System.out.println("Test-c");
	SignUpPage  signUpPage=new SignUpPage(driver); 
	signUpPage.sendFirstName(Utility.getDataFromExcel("src//test//resources//TestData//ProjectTestData//Rani.xlsx", "Asha", 1,0));
	signUpPage.sendLastName(Utility.getDataFromExcel("src//test//resources//TestData//ProjectTestData//Rani.xlsx", "Asha", 1,2));
	signUpPage.sendMob(Utility.getDataFromExcel("src//test//resources//TestData//ProjectTestData//Rani.xlsx", "Asha", 1,1));
	
	signUpPage.ClickOnCookiesPolicy();
	Thread.sleep(3000);
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	Thread.sleep(3000);

String actualURL=driver.getCurrentUrl();
String expectedURL="https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
//if(actualURL.equals(expectedURL)) {
//	System.out.println("pass");
//}
//else {
//	System.out.println("Fail");
//}
//SoftAssert soft=new SoftAssert();
softAssert.assertNotEquals(actualURL, expectedURL);
softAssert.assertAll();
}

	@AfterMethod
public void afterMethod(ITestResult result) throws IOException, InterruptedException {
if(ITestResult.FAILURE == result.getStatus());
{
	Utility.takeScreenshot(driver,TestID);
}
}

@AfterClass
public void clearPomObject() {
	loginOrSignUpPage=null;
	signUpPage=null;
	}

@AfterTest
public void close() {
	driver=null;
	System.gc();	}
@AfterSuite
public void afterSuite() {
System.out.println("Afte suite");	
}
}
