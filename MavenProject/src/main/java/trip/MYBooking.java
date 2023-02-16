package trip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MYBooking {
private WebDriver driver;
private Actions act;
@FindBy(xpath="(//button[@type='button'])[4]")
private WebElement clearCookies;
@FindBy(xpath="(//span[text()='My Bookings'])[2]")
private WebElement myBooking;

private WebElement getTextBooking;
public MYBooking (WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	act=new Actions(driver);
}
public void ClearCookies() {
	clearCookies.click();
}
public void ClickOnBooking() {
	act.moveToElement(myBooking).click().perform();
}

}
