package SNDTUniversity;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Name212 {
	private WebDriver driver;
	Actions act;
	
	
	@FindBy(xpath="//a[text()='Dr. Revati Kamat']")
	private WebElement Revati;
	
	@FindBy(xpath="//span[text()='Dr. Revati Kamat']")
	private WebElement Revatiname;
	
	public Name212 (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
	}
	
	public void ClickOnRevati() {
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.ScrollBy(0,3000)");
		//ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(addr.get(1));
	
		Revati.click();
	}
	public String getText() {
		String text=Revatiname.getText();	
		return text;
	}
}
