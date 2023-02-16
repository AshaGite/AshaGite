package Instagram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Terms {
	private WebDriver driver;
	@FindBy(xpath="//a[text()='Terms']")
	private WebElement TermsLink;




	public Terms(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void ClickOnTermsLink() {
		TermsLink.click();
	}

	}


