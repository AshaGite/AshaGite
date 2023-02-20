package testng;
		//Asha Gite
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

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

import Instagram.CookiesPolicy;
import Instagram.PrivacyPolicy;
import Instagram.SignUp;
import Instagram.Terms;
import browser.Browser;
import utils.Utility;

public class TestNG_Instagram extends Browser {

	
		WebDriver driver;
		private SignUp signUp;
		

		private SoftAssert softAssert;

		@BeforeSuite
		public void beforeSuit() {
			System.out.println("Before Suite");
		}
		
		
		@Parameters("browser")
		@BeforeTest
		public void OpenBrowser(String browserName) {
			if(browserName.equals("Chrome")) {
				driver=openChromeBrwser();
			//driver=Browser.openChromeBrwser();	
			}
			if(browserName.equals("Firefox")) {
				driver=openFirefoxBrwser();
			//driver=Browser.openFirefoxBrwser();	
			}
			if(browserName.equals("Opera")) {
			driver=openOperaBrwser();
					
				//driver=Browser.openOperaBrwser();	
			}
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
@BeforeClass
public void openURl() {
	signUp=new SignUp(driver);	
}
	@BeforeMethod
	public void  OpenLink() throws InterruptedException, Exception {
			System.out.println("Before Method");
			driver.get("https://www.instagram.com/");
			Thread.sleep(1000);
			signUp=new SignUp(driver);
			
			signUp.ClickOnSignUp();

			signUp.SendfirstName(Utility.getDataFromExcel ("C:\\All JAVA files\\Asha\\Book1.xlsx","Asha",1,0));
			signUp.SendMobNoOrEmailId(Utility.getDataFromExcel("C:\\All JAVA files\\Asha\\Book1.xlsx","Asha",1,1));
			
			softAssert=new SoftAssert();

	}
	
	
	
	
	
	
	@Test
public void VeriyfyTerms() throws InterruptedException {
		//TestID="T101";

		System.out.println("test-A");
		Thread.sleep(3000);

		Terms terms=new Terms(driver);
	terms.ClickOnTermsLink();
		//signUp.ClickOnTermsLink();
		Thread.sleep(3000);
		String actualURL=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
	ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
		
	
		
		String expectedURL="https://www.instagram.com/accounts/emailsignup/";
		String expectedTitle="Sign up • Instagram";
		//softAssert=new SoftAssert();
		
		softAssert.assertEquals(actualURL, expectedURL);
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertAll();
	}
		//Thread.sleep(1000);

	@Test
	
	public void VeriyfyPrivacyPolicy() throws InterruptedException {
		//TestID="T102";

		System.out.println("test-B");
		Thread.sleep(5000);

			PrivacyPolicy privacyPolicy=new PrivacyPolicy(driver);
			privacyPolicy.ClickOnPrivacyPolicyLink();
			Thread.sleep(3000);
			String actualURL=driver.getCurrentUrl();
			String actualTitle=driver.getTitle();
			ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
					
			
			String expectedURL="https://www.instagram.com/accounts/emailsignup/";
		String expectedTitle="Sign up • Instagram";
			//softAssert=new SoftAssert();
//			
			softAssert.assertEquals(actualURL, expectedURL);
			softAssert.assertEquals(actualTitle, expectedTitle);
			softAssert.assertAll();
	}
			
	
	@Test 
	public void VerifyCookiesPolicy() throws InterruptedException {
		//TestID="T103";

		CookiesPolicy cookiesPolicy=new CookiesPolicy(driver);
		Thread.sleep(3000);

		cookiesPolicy.clickOnCookiesPolicy();
		Thread.sleep(3000);
	//softAssert=new SoftAssert();
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://www.instagram.com/accounts/emailsignup/";

		String actualTitle=driver.getTitle();
		String expectedTitle="Sign up • Instagram";
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
					
	softAssert.assertEquals(actualURL, expectedURL);
	softAssert.assertEquals(actualTitle, expectedTitle);
	softAssert.assertAll();
	}
//	@AfterMethod
//	public void afterMethod(ITestResult result) throws IOException, InterruptedException {
//	if(ITestResult.FAILURE == result.getStatus());{
//		Utility.captureScreenshot(driver, TestID);
//	}
//	}
	@AfterClass
	public void afterClass() {
		signUp=null;
	}
	
@AfterTest
	public void afterTest() {
		System.out.println("After Test-TestNGClass");
driver.quit();	
}
	@AfterSuite
	public void afterSuit() {
		System.out.println("After Suit-TestNGClass");
		driver=null;
		System.gc();
		//driver.quit();
	}
}

	
	
	
	


