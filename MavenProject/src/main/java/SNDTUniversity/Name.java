package SNDTUniversity;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Name {
	private WebDriver driver;
	Actions act;
	
	@FindBy(xpath="(//a[text()='Anita Dongre'])")
	private WebElement AnitaDongre;
	
	
	
	
	public Name (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
	}
	public void ClickOnStudentsName() {
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.ScrollBy(0,3000)");
		//ArrayList<String>addr=new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(addr.get(1));
		act.moveToElement(AnitaDongre).click().perform();
	}
	
	
	
	
	
	
}
