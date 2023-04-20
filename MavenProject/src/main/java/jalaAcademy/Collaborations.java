package jalaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collaborations {
private WebDriver driver;
@FindBy(xpath="//span[text()='Collaborations']")
private WebElement collaboration;

@FindBy(xpath="(//a[text()='Franchise'])[1]")
private WebElement frachise;


@FindBy(xpath="//h2[text()='For Franchise']")
private WebElement franchise;



public Collaborations(WebDriver driver){
	PageFactory.initElements(driver,this);
	this.driver=driver;
}

public void clickOncollaboration() {
	collaboration.click();
} 

public void clickOnfrachise() {
	frachise.click();
}
public String getTextOnfrachise() {
	String text=franchise.getText();
	return text;
}
}
