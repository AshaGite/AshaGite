package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookiesPolicy {
private WebDriver driver;
@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement submit;
   
@FindBy(xpath="//a[text()='Cookies Policy']")
private WebElement cookiesPolicy;
@FindBy(xpath="(//span[text()='Cookies Policy'])[1]")
private WebElement textCookiesPolicy;

public CookiesPolicy(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
public void clickSubmitButton() {
	submit.click();
}
public void clickCookiesPolicy() {
	cookiesPolicy.click();
}
public String getTextCookiesPolicy() {
	String text=textCookiesPolicy.getText();
	return text;
}
}
