package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement submit;
//	 @FindBy(xpath="//input[@id='u_3_b_Zu']")
//	    private WebElement firstName;
//
//	    @FindBy(xpath="//input[@id='u_3_d_0n']")
//	    private WebElement lastName;
//
//	    @FindBy(xpath="//input[@id='u_3_g_zt']")
//	    private WebElement mbNo;
//	    @FindBy(xpath="//a[@id='terms-link']")
//	    private WebElement terms;


	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void sendUserName() {
		userName.sendKeys("ashagite1122@gmail.com");
	}
	
	public void sendPassword() {
		password.sendKeys("9689930633");
	}
	
	public void clickSubmit() {
		submit.click();
	}
//	 public void sendFirstName() {
//	        firstName.sendKeys("Asha");
//	    }
//
//	    public void sendLastName() {
//	        lastName.sendKeys("Gite");
//	    }
//
//	    public void sendMobileNumber() {
//	        mbNo.sendKeys("8432344806");
//	    }
//	    public void clickOnTerms() {
//	        terms.click();
//	    }
}
