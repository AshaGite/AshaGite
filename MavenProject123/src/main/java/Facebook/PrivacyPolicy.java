package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy {
private WebDriver driver;
@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement submit;
   
@FindBy(xpath="(//a[text()='Privacy Policy'])[2]")
private WebElement privacyPolicy;

public PrivacyPolicy(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
} 
public void clickSubmitButton() {
	submit.click();
}
public void clickPrivacyPolicyTab() {
	privacyPolicy.click();
}
}
