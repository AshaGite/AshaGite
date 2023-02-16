package Instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiesPolicy {
	private WebDriver driver;
@FindBy(xpath="//a[text()='Cookies Policy']")
private WebElement cookiesPolicy;

public CookiesPolicy(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}

public void clickOnCookiesPolicy() {
	cookiesPolicy.click();
}	
}

