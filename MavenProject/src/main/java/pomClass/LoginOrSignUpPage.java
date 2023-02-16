package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	private WebDriver driver;
	//private Actions act;
	@FindBy(xpath="//input[@type='text']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAccount;
	

	public LoginOrSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	public void sendUser(String user) {
		email.sendKeys(user);
	}
	public void sendPass(String user) {
		
		pass.sendKeys(user);	
	}
	
	public void ClickOnCreatNewAccount() {
		createNewAccount.click();
		
	}
}

//	public void ClickOnTerms() {
//		terms.click();
//	}
//	
//	public void ClickOnprivacyPolicy() {
//		privacyPolicy.click();
//	}
//	
	

