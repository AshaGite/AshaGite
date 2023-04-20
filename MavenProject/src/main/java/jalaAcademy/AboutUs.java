package jalaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs {
	private WebDriver driver;
	@FindBy(xpath="//span[text()='About us']")
	private WebElement AboutUs;
	
	@FindBy(xpath="//h2[text()='About Us']")
	private WebElement AboutUsPage;
	
	
	
	
	
	
	public AboutUs(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
			
	}
	
	public void clickOnAboutUsTab() {
		AboutUs.click();
	}
	
	
	public String getTextAboutUsPage() {
		String text=AboutUsPage.getText();
		return text;
	}
	
	
	
	
	
	
	
	
	
	
	
}
