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

import browser.Browser;
import pomClass.LoginOrSignUpPage;
import pomClass.SignUpPage;
import utils.Utility;

public class TestNGFacebook extends Browser {
WebDriver driver;
 private  LoginOrSignUpPage loginOrSignUpPage;
private SignUpPage signUpPage;
//private String TestID;
private SoftAssert softAssert;



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
@BeforeClass
public void beforeClass() {
	loginOrSignUpPage=new LoginOrSignUpPage(driver);
}


@BeforeMethod
public void beforeMethod() throws Exception {
	
	System.out.println("Before Method");
	driver.get("https://www.facebook.com");
Thread.sleep(1000);
	LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
	loginOrSignUpPage.sendUser(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 1,0));
	loginOrSignUpPage.sendPass(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 1,1));
	loginOrSignUpPage.ClickOnCreatNewAccount();
	
	softAssert=new SoftAssert();

	
}

	
@Test(enabled=false)
public void verifyTermsLink() throws Exception {
	
	//TestID="T101";

	System.out.println("Test-A");
	SignUpPage  signUpPage=new SignUpPage(driver); 
	signUpPage.sendFirstName(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 4,0));
	signUpPage.sendLastName(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 4,1));
	signUpPage.sendMob(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 4,2));
	
	signUpPage.ClickOnTerms();
	
	Thread.sleep(3000);
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	Thread.sleep(2000);
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://www.facebook.com/legal/terms/update";
	if(actualURL.equals(expectedURL)) {
		System.out.println("pass");
	}
	else {
		System.out.println("Fail");
	}
//	SoftAssert soft=new SoftAssert();
//	soft.assertEquals(actualURL, expectedURL);
//	soft.assertAll();
}	
	

@Test
public void verifyprivacyPolicy() throws Exception {
	//TestID="T102";
	System.out.println("Test-B");
	Thread.sleep(3000);
	SignUpPage  signUpPage=new SignUpPage(driver); 
	signUpPage.sendFirstName(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 4,0));
	signUpPage.sendLastName(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 4,1));
	signUpPage.sendMob(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 4,2));
	
	signUpPage.ClickOnprivacyPolicy();
	
	Thread.sleep(3000);
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	Thread.sleep(3000);
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://www.facebook.com/";
	if(actualURL.equals(expectedURL)) {
		System.out.println("pass");
	}
	else {
		System.out.println("Fail");
	}
//	SoftAssert soft=new SoftAssert();
//	soft.assertEquals(actualURL, expectedURL);
//	soft.assertAll();


}
@Test(enabled=false)
public void verifycookiesPolicy() throws Exception {
//	TestID="T103";
	System.out.println("Test-c");
	SignUpPage  signUpPage=new SignUpPage(driver); 
	signUpPage.sendFirstName(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 4,0));
	signUpPage.sendLastName(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 4,1));
	signUpPage.sendMob(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx", "Asha", 4,2));
	
	signUpPage.ClickOnCookiesPolicy();
	Thread.sleep(3000);
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	Thread.sleep(3000);

String actualURL=driver.getCurrentUrl();
String expectedURL="https://www.facebook.com/privacy/policies/cookies/?entry_point=cookie_policy_redirect&entry=0";
if(actualURL.equals(expectedURL)) {
	System.out.println("pass");
}
else {
	System.out.println("Fail");
}
//SoftAssert soft=new SoftAssert();
//soft.assertEquals(actualURL, expectedURL);
//soft.assertAll();
}

//	@AfterMethod
//public void afterMethod(ITestResult result) throws IOException, InterruptedException {
//if(ITestResult.FAILURE == result.getStatus());{
//	Utility.captureScreenshot(driver, TestID);
//}
//}

@AfterClass
public void clearPomObject() {
	loginOrSignUpPage=null;
	signUpPage=null;
	}

@AfterTest
public void close() {
	driver.quit();
}
@AfterSuite
public void afterSuite() {
	driver=null;
	System.gc();	
}
}
