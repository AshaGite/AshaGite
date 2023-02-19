package testng;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestNGException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Ajio.HomePageAjio;
import browser.Browser;
import utils.Utility;

//import Ajio.CustomerCarePage;
// Testing this line


public class TestNGAjio extends Browser {
 WebDriver driver;
private SoftAssert softAssert;
private String TestID;
private HomePageAjio homePageAjio;

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
public void OpenBrowser() {
	homePageAjio=new HomePageAjio(driver);
}

@BeforeMethod
public void openUrl() throws IOException {
	System.out.println("Before Method");
	driver.get("https://www.ajio.com/");
	 HomePageAjio homePage=new HomePageAjio(driver);


	
	//ExcelSheet
	//String user=Utility.getDataFromExcel("TestData", 1, 0);
	//short
	//homePage.sendusername(Utility.getDataFromExcel("TestData", 1, 0));
}
@Test
public void verifyKidsGetText() throws InterruptedException {
	//TestID="T122";
	System.out.println("Test-A");
	HomePageAjio homePage=new HomePageAjio(driver);


	homePage.clickOnKids();
	Thread.sleep(3000);
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://www.ajio.com/shop/kids";
	softAssert=new SoftAssert();
	
	softAssert.assertEquals(actualURL, expectedURL);
	softAssert.assertAll();
		
	//String expectedURL="https://www.ajio.com/shop/kids123";
	
	
//	if(actualURL.equals(expectedURL)) {
//		System.out.println("Pass");
//	}
//	else {
//		System.out.println("Fail");
//	}
}
@Test()
public void verifyMenText() {
	//TestID="T123";
	System.out.println("Test-B");
//CustomerCarePage customerCarePage=new CustomerCarePage(driver);
	//HomePageAjio homePage=new HomePageAjio(driver);
	
	
	//String actualText=homePage.getMenText();
//String expectedText="MEN";
	HomePageAjio homePage=new HomePageAjio(driver);


	homePage.clickOnMen();
String actualURL=driver.getCurrentUrl();
String expectedURL="https://www.ajio.com/shop/men";
softAssert =new SoftAssert();
softAssert.assertEquals(actualURL, expectedURL);
softAssert.assertAll();
}
//String actualTitle=driver.getTitle();
//String expectedTitle="Online Shopping for Women, Men, Kids – Clothing, Footwear | AJIO";




//if(actualURL.equals(expectedURL)) {
//	System.out.println("Pass");
//}
//else {
//	System.out.println("Fail");
//	}
//
//}


//@AfterMethod
//public void afterMethod(ITestResult result) throws IOException, InterruptedException {
//if(ITestResult.FAILURE == result.getStatus());
//	Utility.captureScreenshot(driver, TestID);
//}



@AfterClass
public void close() {
	System.out.println("after class");
	//homePageAjio=null;
	}
@AfterTest
public void afterrTest() {
	System.out.println("After Test-TestNGClass");
	driver.quit();

}	
@AfterSuite
public void afterSuite() {
	System.out.println("After Suit-TestNGClass");
	driver=null;
	System.gc();


	
}
	
}
