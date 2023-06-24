package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
    private WebDriver driver;
 
    @FindBy(xpath = "//a[text()='Create new account']")
	private WebElement submit;
    
    @FindBy(xpath="(//input[@data-type='text'])[1]")
    private WebElement firstName;

    @FindBy(xpath="(//input[@data-type='text'])[2]")
    private WebElement lastName;

    @FindBy(xpath="(//input[@data-type='text'])[3]")
    private WebElement mbNo;

    @FindBy(xpath="//div[text()='Date of birth']")
    private WebElement dateOfBirth;

    @FindBy(xpath="//select[@id='day']")
    private WebElement day;

    @FindBy(xpath="//select[@title='Month']")
    private WebElement month;

    @FindBy(xpath="//select[@id='year']")
    private WebElement year;

    @FindBy(xpath="//div[text()='Gender']")
    private WebElement gender;

    @FindBy(xpath="(//input[@type='radio'])[1]")
    private WebElement female;

    @FindBy(xpath="//a[@id='terms-link']")
    private WebElement terms;

    public SignUpPage(WebDriver driver) {
PageFactory.initElements(driver, this);
this.driver = driver;
    }
    public void clickOnSubmit() {
    	submit.click();
    }

    public void sendFirstName() {
        firstName.sendKeys("Asha");
    }

    public void sendLastName() {
        lastName.sendKeys("Gite");
    }

    public void sendMobileNumber() {
        mbNo.sendKeys("8432344806");
    }

    public void clickOnDateOfBirth() {
        dateOfBirth.click();
    }

    public void selectDay() {
        Select s = new Select(day);
        s.selectByValue("22");
    }

    public void selectMonth() {
        Select monthDropdown = new Select(month);
        monthDropdown.selectByVisibleText("Dec");
    }

    public void selectYear() {
        Select yearDropdown = new Select(year);
        yearDropdown.selectByVisibleText("1996");
    }

    public void clickOnGender() {
        gender.click();
    }

    public void clickOnFemale() {
        female.click();
    }

    public void clickOnTerms() {
        terms.click();
    }
}
