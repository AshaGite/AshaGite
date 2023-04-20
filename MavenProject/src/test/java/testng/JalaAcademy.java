package testng;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import browser.Browser;
import jalaAcademy.AboutUs;
import jalaAcademy.Careers;
import jalaAcademy.Collaborations;
import jalaAcademy.Contact;
import jalaAcademy.HomePage;
import jalaAcademy.Links;
import jalaAcademy.Tecnology;

public class JalaAcademy extends Browser {
WebDriver driver;
private HomePage homePage;
private SoftAssert softAssert;
static ExtentTest test;
static ExtentHtmlReporter reporter;



@BeforeTest
@Parameters("browser")

public void OpenBrowser(String browser) throws Exception {
 reporter = new ExtentHtmlReporter("test-output/ExtendReport/Extent.html");
	ExtentReports extend = new ExtentReports();
	extend.attachReporter(reporter);
	if(browser.equals("Firefox")) {
		driver=openFirefoxBrwser();
	}
	driver.manage().window().maximize();
	
}
//@BeforeClass
//public void openURL() {
//
//}
@BeforeMethod
public void OpenLink() throws InterruptedException {
	driver.get("https://jalaacademy.com/");
	Thread.sleep(1000);
	homePage=new HomePage(driver);
	homePage.clickOnHomePage();
	 softAssert=new SoftAssert();
}
	
@Test(priority=1)
public void verifyTextHomePage() throws InterruptedException {
	Thread.sleep(5000);
	String actualText=homePage.getTextHomePage();
	String expectedText="Training without Trainers";
	
	softAssert.assertEquals(actualText, expectedText);
	softAssert.assertAll();
	
}
@Test(priority=2)
public void verifyTecnologyButton() throws InterruptedException {
	Tecnology tecnology=new Tecnology(driver);
	tecnology.clickOnTechnologyButton();
	Thread.sleep(3000);

	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://jalaacademy.com/technologies/";
	Thread.sleep(1000);
	Assert.assertEquals(actualURL, expectedURL);
	


}
@Test(priority=3)
public void verifyBrightITCareerButton() throws InterruptedException {
	Links links=new Links(driver);
	Thread.sleep(1000);
	links.clickOnLinks();
	links.clickOnBrightITCareerButton();
	Thread.sleep(1000);

	String actualTitle=driver.getTitle();
	String expectedTitle="JALA Academy - Anyone Can become a Software Engineer";
	Thread.sleep(1000);
	Assert.assertEquals(actualTitle, expectedTitle);


}
@Test(priority=4)
public void verifyAboutUsPage() throws InterruptedException {
	AboutUs aboutUs=new AboutUs(driver);
	Thread.sleep(1000);
	aboutUs.clickOnAboutUsTab();
	Thread.sleep(1000);

	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://jalaacademy.com/about/";
	Thread.sleep(1000);
Assert.assertEquals(actualURL, expectedURL);

	
}
@Test(priority=5)
public void verifyCollaborations() throws InterruptedException {
	Collaborations collaborations=new Collaborations(driver);
	Thread.sleep(1000);

	collaborations.clickOncollaboration();
	collaborations.clickOnfrachise();
	Thread.sleep(1000);

	String actualText=collaborations.getTextOnfrachise();
	String expectedText="For Franchise";
	Thread.sleep(1000);

	Assert.assertEquals(actualText, expectedText);

} 
@Test(priority=6)
public void verifyCareers() throws InterruptedException {
	Careers careers=new Careers(driver);
	careers.clickOnCareer();
	Thread.sleep(1000);

	String actualURL=driver.getCurrentUrl();
String expectedURL="https://jalaacademy.com/careers/";
	Thread.sleep(1000);

	Assert.assertEquals(actualURL, expectedURL);

} 
@Test(priority=7)
public void verifyContactUs() throws InterruptedException {
	Contact contact =new Contact(driver);
	contact.clickOnContact();
	contact.getTextRegisteredOffice();
	Thread.sleep(1000);

	String actualText=contact.getTextRegisteredOffice();
String expectedText="REGISTERED OFFICE (SINGAPORE)";
	Thread.sleep(1000);

	Assert.assertEquals(actualText, expectedText);

} 
@Test(priority=8)
public void verifyHomePageTitle() throws InterruptedException {
	Thread.sleep(1000); 
	homePage.clickOnHomePage();
	 Thread.sleep(1000);
	String actualTitle=driver.getTitle();
	String expectedTitle="JALA Academy - Anyone Can become a Software Engineer";
	Assert.assertEquals(actualTitle, expectedTitle);

} 
@Test(priority=9)
public void verifyMobileNOText() throws InterruptedException {
	Thread.sleep(1000); 
	homePage.clickOnHomePage();
	 Thread.sleep(1000);
	String actualText=homePage.getTextMobileNumber();
	String expectedText="+91-970-490-7458";
	Assert.assertEquals(actualText, expectedText);

} 
@Test(priority=10)
public void verifyJIRA() throws InterruptedException {
	Links links=new Links(driver);
	links.clickOnLinks();
	links.clickOnJira();
	
	 Thread.sleep(1000);
	String actualTitle=driver.getTitle();
	String expectedTitle="Atlassian Cloud Notifications - Page Unavailable";
	Assert.assertEquals(actualTitle, expectedTitle);

} 
//@AfterMethod
//public void afterMethod() throws InterruptedException {
//	Thread.sleep(1000);
//	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
//	driver.switchTo().window(addr.get(0));
//	driver.close();
//	
//}

@AfterClass
public void afterClass() {
	homePage=null;
}
@AfterTest
public void afterTest() {
	driver.quit();
	driver=null;
	System.gc();
}
@AfterSuite
public void afterSuite() {
	System.out.println("after Suite");
	
	
	
}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	


