package testng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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



import SNDTUniversity.HomePage;
import SNDTUniversity.Name;
import SNDTUniversity.Name212;
import browser.Browser;

public class TestNGClassSNDTUniversity extends Browser {
	private WebDriver driver;
	private HomePage homePage;
	@BeforeSuite
	public void browserSuite() {
		System.out.println("Browser Suite");
	}
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
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
	/*@BeforeClass
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usha\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	*///}
	
	
		@BeforeMethod
		public void openLink() throws InterruptedException {
			driver.get("https://sndt.ac.in/");
			Thread.sleep(1000);
			 homePage=new HomePage(driver);
		}
		@Test(priority=1)
		public void verifyURLOnStudent() throws InterruptedException{
			System.out.println("test-1");
			homePage.ClickOnStudents();
			Thread.sleep(5000);
			String actualTitle = driver.getTitle();
					
			String expectedTitle="Students | SNDT Women's University";
			if(actualTitle.equals(expectedTitle))
			{
				System.out.println("PASSED");
			}
			else
			{
				System.out.println("FAILED");
			}

			
			
			/*String actualTitle = driver.getTitle();
			String expectedTitle = "Twitter Terms of Service";
			/String actualText= ;
			*///String expectedText="Sign in to Twitter";
			
		}
		
		@Test(priority=2)
		public void verifyURLOnStudentName() throws InterruptedException {
			System.out.println("test-2");
			Name name=new Name(driver);
			Thread.sleep(5000);
			name.ClickOnStudentsName();
			

		
			
			String actualURL = driver.getCurrentUrl();
			String expectedURL="https://sndt.ac.in/notable-alumni/anita-dongre";
			
			//String actualTitle = driver.getTitle();
			//String expectedTitle = "Students | SNDT Women's University";
			
			if( actualURL.equals(expectedURL))
			{
				System.out.println("PASSED");
			}
			
			else
			{
				System.out.println("FAILED");
			}
		}
		@Test(priority=3)
		public void getTextStudentName() throws InterruptedException {
			System.out.println("test-3");
			//JavascriptExecutor js= (JavascriptExecutor)driver;
			//js.executeScript("window.ScrollBy(0,3000)");
			Name212 name212=new Name212(driver);
			name212.ClickOnRevati();
			Thread.sleep(5000);

		
			String actualURL=driver.getCurrentUrl();
			String expectedURL="https://sndt.ac.in/musicpune/dr-revati-kamat";
			if(actualURL.equals(expectedURL)) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}
		@AfterMethod
		public void closeed() {
			System.out.println("After Method");
			//driver.close();
			//ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(addr.get(0));
		}
		
		@AfterClass
		public void CloseAllTab() {
			driver.quit();
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("After Test-TestNGClass");
		}
		@AfterSuite
		public void afterSuit() {
			System.out.println("After Suit-TestNGClass");
			driver=null;
			System.gc();
			//driver.quit();
	}
}
