package Instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp{
	private WebDriver driver;
@FindBy(xpath="//span[text()='Sign up']")
private WebElement SignUp;

@FindBy(xpath="//input[@aria-label='Full Name']")
private WebElement firstName;

@FindBy(xpath="//input[@aria-label='Mobile Number or Email']")
private WebElement mobNoOrEmail;

@FindBy(xpath="//a[text()='Privacy Policy']")
private WebElement PrivacyPolicyLink;


@FindBy(xpath="//a[text()='Terms']")
private WebElement TermsLink;





public SignUp (WebDriver driver) {
	PageFactory.initElements(driver, this);
this.driver=driver;
}


public void ClickOnSignUp() {
	 SignUp.click();
}
public void SendfirstName() {
	firstName.sendKeys("Asha");
}

public void SendMobNoOrEmailId() {
	mobNoOrEmail.sendKeys("9689930633");
}




public void ClickOnPrivacyPolicyLink() {
	PrivacyPolicyLink.click();	
}


public void ClickOnTermsLink() {
	TermsLink.click();
	}


public void SendfirstName(String dataFromExcel) {
	firstName.sendKeys("Asha");
	
}


	
}	




