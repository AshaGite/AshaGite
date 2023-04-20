package jalaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tecnology {
private WebDriver driver;

@FindBy(xpath="(//span[text()='Technologies'])[1]")
private WebElement Technology;
	
	
public Tecnology(WebDriver driver)	{
	PageFactory.initElements(driver, this);
	this.driver=driver;
	
}

public void clickOnTechnologyButton() {

	Technology.click();
}
	
	
	
	
}	
	
	
	

