package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
private WebDriver driver;
	@FindBy(xpath="(//a[text()='Terms'])[2]")
	private WebElement terms;
	
	@FindBy(xpath="(//a[text()='Cookies Policy'])")
	private WebElement cookiesPolicy;
	
	@FindBy(xpath="(//a[text()='Privacy Policy'])[2]")
	private WebElement privacyPolicy;
	
	@FindBy(xpath="(//span[text()='Privacy Policy'])[1]")
	private WebElement getTextprivacyPolicy;
	
	@FindBy(xpath="//span[text()='Cookies Policy']")
	private WebElement getcookiesPolicy;
	
	
	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void ClickOnTerms() {
		terms.click();
	}
	
	public void ClickOnprivacyPolicy() {
		privacyPolicy.click();
	}
	public String getTextprivacyPolicy() { 
		String text=getTextprivacyPolicy.getText();
		//System.out.println(title);
		return text;
	}

	public void ClickOnCookiesPolicy() {
		cookiesPolicy.click();
	}
	public String getTextCookiesPolicy() {
		String text=getcookiesPolicy.getText();
	return text;
	}
}
