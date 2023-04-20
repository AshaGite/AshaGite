package jalaAcademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Links {
private WebDriver driver;

@FindBy(xpath="(//span[text()='Links'])[1]")
private WebElement links ;

@FindBy(xpath="(//a[text()='Bright IT Career'])[1]")
private WebElement BrightITCareer;

@FindBy(xpath="(//a[text()='JIRA'])[1]")
private WebElement JIRA;

public Links(WebDriver driver) {
	
PageFactory.initElements(driver, this);
this.driver=driver;

}
public void clickOnLinks() {
	links.click();
}
public void clickOnBrightITCareerButton() {
	BrightITCareer.click();
}
public void clickOnJira() {
	JIRA.click();	
}


}
