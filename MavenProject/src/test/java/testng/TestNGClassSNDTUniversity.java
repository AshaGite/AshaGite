package testng;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

import SNDTUniversity.HomePage;
import SNDTUniversity.Name;
import SNDTUniversity.Name212;
import browser.Browser;
import utils.Utility;
public class TestNGClassSNDTUniversity extends Browser {
	private WebDriver driver;
	private HomePage homePage;
	private SoftAssert softAssert;
	private String TestID;
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
		if(browserName.equals("Firefox")) {
			driver=openFirefoxBrwser();
		}
		if(browserName.equals("Opera")) {
			driver=openOperaBrwser();
		}
	}
	@BeforeClass
	public void OpenBrowser() {
		homePage =new HomePage(driver);
		softAssert=new SoftAssert();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
		@BeforeMethod
		public void openLink() throws InterruptedException {
			driver.get("https://sndt.ac.in/");
			Thread.sleep(1000);
			 homePage=new HomePage(driver);
				softAssert=new SoftAssert();

		}
		@Test(priority=1)
		public void verifyURLOnStudent() throws InterruptedException{
			TestID="T101";
			Thread.sleep(1000);
			homePage.ClickOnStudents();
			Thread.sleep(3000);
			
		String actualURL = driver.getCurrentUrl();
		String expectedURL="https://sndt.ac.in/students-sndt";
		Thread.sleep(5000);

		softAssert.assertEquals(actualURL, expectedURL);
		softAssert.assertAll();
		}
		
		
		@Test(priority=2)
		public void verifyURLOnStudentName() throws InterruptedException {
TestID="T102";			
	Name name=new Name(driver);
			name.ClickOnStudentsName();
			

		
			
			String actualURL = driver.getCurrentUrl();
			String expectedURL="https://sndt.ac.in/notable-alumni/anita-dongre";
			Thread.sleep(5000);
			Assert.assertEquals(actualURL, expectedURL, "URL is not matched");// Hard assert
			System.out.println("URL is matched");
			


			softAssert.assertEquals(actualURL, expectedURL);
			softAssert.assertAll();
			
			}
			
		
		@Test(priority=3)
		public void getTextStudentName() throws InterruptedException {
			TestID="T103";
			Name212 name212=new Name212(driver);
			name212.ClickOnRevati();
			
			String actualURL=driver.getCurrentUrl();
			String expectedURL="https://sndt.ac.in/musicpune/dr-revati-kamat";
			Thread.sleep(5000);
			Assert.assertEquals(actualURL, expectedURL, "URL is not matched"); //Hard assert
			System.out.println("URL is matched");

			//softAssert =new SoftAssert();
			softAssert.assertEquals(actualURL, expectedURL);
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
		public void CloseAllTab() {
			driver.quit();
			homePage=null;
		}
		
		@AfterTest
		public void afterTest() {
			driver=null;
			System.gc();
		}
		@AfterSuite
		public void afterSuit() {
			System.out.println("After Suit-TestNGClass");
			
	}
}
