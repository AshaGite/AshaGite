

package testNGPack;
//hhiiiiiiiiiiiiiii
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.ExtentReports;

import Facebook.CookiesPolicy;
import Facebook.HomePage;
import Facebook.PrivacyPolicy;
import Facebook.SignUpPage;
import browser.Browser;
import utils.Utility;

public class Facebook extends Browser {
	private WebDriver driver;
	private SoftAssert softAssert;
	private String testID;
	private HomePage homePage;
	private SignUpPage signUpPage;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;	
	private PrivacyPolicy privacyPolicy;
	private CookiesPolicy cookiesPolicy;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser) throws Exception {
		reporter = new ExtentHtmlReporter("test-output/ExtentReport/Extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);

		if (browser.equals("Chrome")) {
			driver = openChromeBrwser();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void beforeClass() {
		homePage = new HomePage(driver);
		signUpPage = new SignUpPage(driver);
	}

	@BeforeMethod
	public void openUrl() throws IOException, InterruptedException {
		System.out.println("Before Method");
		Thread.sleep(1000);
		driver.get("https://www.facebook.com/");
		signUpPage = new SignUpPage(driver);

	}

	@Test(priority=1)
	public void verifyLogin() throws InterruptedException {
		testID = "T122";
		System.out.println("Test-A");
		HomePage homePage = new HomePage(driver);
		homePage.sendUserName();
		Thread.sleep(3000);
		homePage.sendPassword();
		Thread.sleep(1000);
//		homePage.clickSubmit();
//		Thread.sleep(1000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority=2)
	public void verifyTermsLinkPage() throws InterruptedException {
		SignUpPage signUpPage=new SignUpPage(driver);
		signUpPage.clickOnSubmit();
		Thread.sleep(1000);
		signUpPage.sendFirstName();
		Thread.sleep(1000);
		signUpPage.sendLastName();
		Thread.sleep(1000);

		signUpPage.sendMobileNumber();
		
		signUpPage.clickOnTerms();
		Thread.sleep(1000);
		ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
	
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/legal/terms/update";
		Assert.assertEquals(actualURL, expectedURL);
	}
	@Test(priority=3)
	public void verifyPrivacyPolicyLinks() throws InterruptedException {
		PrivacyPolicy privacyPolicy=new PrivacyPolicy(driver);
		privacyPolicy.clickSubmitButton();
		privacyPolicy.clickPrivacyPolicyTab();
		Thread.sleep(2000);
		ArrayList<String>addrs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addrs.get(1));
		String actualTitile=driver.getTitle();
		String expecteTitle="Facebook – log in or sign up";
		Thread.sleep(1000);
		Assert.assertEquals(actualTitile, expecteTitle);
		
	}
	@Test(priority=4)
	public void verifyCookiesPolicy() throws InterruptedException {
		CookiesPolicy cookiesPolicy=new CookiesPolicy(driver);
		cookiesPolicy.clickSubmitButton();
		Thread.sleep(2000);

		cookiesPolicy.clickCookiesPolicy();
		Thread.sleep(2000);
		ArrayList<String>addrss=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addrss.get(1));
String actualText=cookiesPolicy.getTextCookiesPolicy();
String expectedText="Cookies Policy";
Assert.assertEquals(actualText, expectedText);

	}

	@AfterMethod
	public void logoutAccount(ITestResult result) throws InterruptedException, IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			Utility.captureScreenshot(driver, "test-output/Screenshot/", testID);
		}
	}


	@AfterTest
	public void afterTest() {
		System.out.println("After Test-");
		driver.quit();
	}
}

