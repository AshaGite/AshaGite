package ICICIBank;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	private WebDriver driver;
	private Actions act;
	
	
	
	@FindBy(xpath="//span[text()='Offers']")
		private WebElement offers; 
	
	@FindBy(xpath="//a[text()='Authenticate yourself to view and apply for your personalised product offers']")
	private WebElement perosnalProductOffers;
	
	@FindBy(xpath="//input[@id='mobileId']")
		private WebElement Id;
	
	@FindBy(xpath="//b[text()='DIGITAL BANKING']")
		private WebElement DigitalBanking;
	
	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement Login;

	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement UserId;

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mbNo ;

	
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	act=new Actions(driver);
	}
	
	
	
	public void sendUser() {
		UserId.sendKeys("ashagite1122@gmail.com");	
	}
	public void sendMbNo() {
		mbNo.sendKeys("856748448");	
	}
	
	
	
	
	public void clickOnLogin() {
		Login.click();
	}
	
	public void clickOnOffers() {
act.moveToElement(offers).click().perform();	}
	
	public void ClickOnProductOffers() {
	
	act.moveToElement(perosnalProductOffers).click().perform();	
	}
	public void sendId() {
		Id.sendKeys("843284759");
		
	}
	public String ScrollDigitalBanking() {
	JavascriptExecutor js=( JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,1000)");
act.moveToElement(DigitalBanking);
String text=DigitalBanking.getText();
return text;
	}
	
	
	
	
	
	
}
