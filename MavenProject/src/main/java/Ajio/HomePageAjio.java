package Ajio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
																			
public class HomePageAjio {
private WebDriver driver;
private Actions act;
//@FindBy(xpath="//span[text()='Sign In / Join AJIO']")
//private WebElement SigninOrAjio;

//@FindBy(xpath="(//a[text()='Customer Care'])[1]")
//private WebElement CustomerCare;

@FindBy(xpath="//input[@autocomplete='off']")
private WebElement searchAjioProduct;

@FindBy(xpath="//span[@class='ic-search']")
private WebElement searchIcon;

@FindBy(xpath="//a[@title='MEN']")
private WebElement men;

@FindBy(xpath="//a[@title='Formal Shoes']")
private WebElement formalshoes;

@FindBy(xpath="//a[@title='WOMEN']")
private WebElement women;

@FindBy(xpath="(//a[@title='Dupattas'])[1]")
private WebElement dupattas;

@FindBy(xpath="//a[text()='KIDS']")
private WebElement kids;

@FindBy(xpath="//a[@title='Gaming, Robots & Vehicles']")
private WebElement gamingRobotsAndVehicles;

//@FindBy(xpath="//a[text()='MEN']")
//private WebElement Men;

public HomePageAjio (WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	act=new Actions(driver);
}

//public void ClickOnSignInOrJoinAjioButton() {
	// SigninOrAjio.click();
//}
//public void ClickOnCustomerCare() {
	//CustomerCare.click();
//}
public String getMenText() {
String text=men.getText();
return text;
}
public String getWomenText() {
	String text=women.getText();
	return text;
}
public String getkidsText() {
	String text=kids.getText();
return text;
}
public void sendProductName(String productName) {
	searchAjioProduct.sendKeys(productName);
}
public void clickOnSearchIcon() {
	searchIcon.click();
}
public void moveFocusOnMen() {
	act.moveToElement(men).perform();
}
public void clickOnMen() {
	men.click();
}
public void clickOnFormalShoes() {
	act.moveToElement(formalshoes).click().perform();
}
public void moveFocusOnWomen() {
	act.moveToElement(women).perform();
}
public void clickOnWomen() {
	women.click();
}
public void clickOnDupattas() {
	dupattas.click();
}
public void moveFocusOnKids() {
	act.moveToElement(kids).perform();
}
public void clickOnKids() {
	kids.click();
}
public void clickOngamingRobotsAndVehicles() {
	act.moveToElement(gamingRobotsAndVehicles).click().perform();
}
public String getTextOnHeaderPage() {
	String text=men.getText();
	return text;
}






























}

