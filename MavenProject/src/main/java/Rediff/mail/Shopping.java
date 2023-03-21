package Rediff.mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shopping {
private WebDriver driver;
private Actions act;
	
@FindBy(xpath="//a[@title='Online Shopping']")
private WebElement shop;

@FindBy(xpath="//span[@id='topcat2']")
private WebElement WomenLifeStyle;

@FindBy(xpath="//p[text()='Handbags']")
private WebElement HandBags;

@FindBy(xpath="//p[text()='Casual Bags']")
private WebElement casualBags;

@FindBy(xpath="//a[text()='All Categories']")
private WebElement AllCategories;

@FindBy(xpath="//a[@id='href_10971']")
private WebElement Footwear;


public Shopping(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	act=new Actions(driver);
}

public void ClickOnShopping() {
	shop.click();
}
public void clickOnWomen() {
	WomenLifeStyle.click();
}
public void clickOnHandBags() {
	HandBags.click();
	
}
public void clickOnCasualBags() {
	casualBags.click();
}
public void clickOnAllCategories() {
	AllCategories.click();;
}

public void clickFootwear() {
	Footwear.click();
}


}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

