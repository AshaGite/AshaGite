package Instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicy {
	private WebDriver driver;
	@FindBy(xpath="//a[text()='Privacy Policy']")
	private WebElement PrivacyPolicyLink;




	public PrivacyPolicy(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void ClickOnPrivacyPolicyLink() {
		PrivacyPolicyLink.click();
	}

	}


