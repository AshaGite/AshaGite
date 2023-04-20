package jalaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

private WebDriver driver;

@FindBy(xpath="(//span[text()='Home'])[1]")
private WebElement homePage;

@FindBy(xpath="//h2[text()='Training without Trainers']")
private WebElement TextHomePage; 

@FindBy(xpath="//p[text()='+91-970-490-7458']")
private WebElement mobileNo;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
}


public void clickOnHomePage() {
	homePage.click();
} 
public String getTextHomePage() {
	String result=TextHomePage.getText();
	return result;
}
public String getTextMobileNumber() {
	String text=mobileNo.getText();
	return text;
}

	
	
	
	
	
	
	
	
	
	
	

}
