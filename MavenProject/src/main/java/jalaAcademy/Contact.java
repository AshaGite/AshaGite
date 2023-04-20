package jalaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
private WebDriver driver;
@FindBy(xpath="(//span[text()='Contact'])[1]")
private WebElement contact;

@FindBy(xpath="//h2[text()='REGISTERED OFFICE (SINGAPORE)']")
private WebElement RegisteredOffice;

public Contact(WebDriver driver){
PageFactory.initElements(driver,this);
this.driver=driver;
}


public void clickOnContact() {
	contact.click();
}
public String getTextRegisteredOffice() {
	String text=RegisteredOffice.getText();
	return text;
}
	
	
	
	
	
	
	
	
	
	
}
