package SNDTUniversity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private WebDriver driver;
	Actions act;
	@FindBy(xpath="(//a[text()='Students'])[1]")
	private WebElement students;
	
	@FindBy(xpath="(//a[text()='Anita Dongre'])")
	private WebElement AnitaDongre;
	
	@FindBy(xpath="//a[text()='Dr. Revati Kamat']")
	private WebElement Revati;
	
	@FindBy(xpath="//span[text()='Dr. Revati Kamat']")
	private WebElement Revatiname;
	
	
	//@FindBy(xpath="(//a[text()='Anita Dongre'])")
	//private WebElement AnitaDongre; 
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
	}
	public void ClickOnStudents() {
		act.moveToElement(students).click().perform();
	}
	public void ClickOnStudentsName() {
		
		act.moveToElement(AnitaDongre).click().perform();
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
	/*public void ClickOnName() {
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.ScrollBy(0,4000)");
		AnitaDongre.click();
	*///}
	
	
	
}
