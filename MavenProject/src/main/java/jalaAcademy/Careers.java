package jalaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Careers {
private WebDriver driver;
@FindBy(xpath="(//span[text()='Careers'])[1]")
private WebElement careers;



public Careers(WebDriver driver) {
	PageFactory.initElements(driver,this);
	this.driver=driver;
}

public void clickOnCareer() {
	careers.click();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
