package trip;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {
private WebDriver driver;
//@FindBy(xpath="(//span[text()='My Bookings'])[1]")
//private WebElement myBooking;

@FindBy(xpath="(//span[text()='My Bookings'])[2]")
private WebElement getTextBooking;

@FindBy(xpath="//input[@id='email']")
private WebElement EmailId;

@FindBy(xpath="//span[text()='Sign in with Facebook']")
private WebElement signIn;

@FindBy(xpath="//input[@type='text']")
private WebElement EmailIdOrMbNo;


@FindBy(xpath="//input[@type='password']")
private WebElement passward;

@FindBy(xpath="//input[@type='submit']")
private WebElement Login;

@FindBy(xpath="//span[text()='Sign in with Facebook']")
private WebElement SignIn;
public Booking (WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}

public String getTextBooking() {
	String text=getTextBooking.getText();
	return text;

}
public void SendEmail() {
	EmailId.sendKeys("ashagite1122@gmail.com");
}
public void ClickOnSignIn() {
	Actions act=new Actions(driver);
	
	act.moveToElement(signIn).click().perform();
}

public void SendEmailIdOrMbNo() {
	ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(addr.get(1));
	
	EmailIdOrMbNo.sendKeys("ashagite1122@gmail.com");
}
public void SendPassward() {
	passward.sendKeys("9689930633");
}
public void ClickOnLogin() {
	Login.click();
}
}
