package testNGPack;
//hiiiiii
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Instagram {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver;
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(options);
	Thread.sleep(1000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);

	WebElement userName=driver.findElement(By.xpath("//input[@type='text']"));
	userName.sendKeys("ashagite1122@gmail.com");
	Thread.sleep(3000);
	WebElement passward=driver.findElement(By.xpath("//input[@type='password']"));
	passward.sendKeys("Pass@123");
	Thread.sleep(3000);
	WebElement creteNewAcc=driver.findElement(By.xpath("//a[text()='Create new account']"));
	creteNewAcc.click();
	Thread.sleep(3000);
	WebElement firstName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	firstName.sendKeys("ASha");
	Thread.sleep(3000);
	WebElement lastName=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	lastName.sendKeys("Gite");
	Thread.sleep(3000);
	WebElement mbNo=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	mbNo.sendKeys("8432344806");
	Thread.sleep(3000);
	WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
	Select s=new Select(day);
	s.selectByValue("22");
	Thread.sleep(3000);
	WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
	Select u=new Select(month);
	u.selectByVisibleText("Dec");
	Thread.sleep(3000);
	WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
	Select w=new Select(year);
	w.selectByVisibleText("1996");
	Thread.sleep(3000);
	WebElement gender=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	gender.click();
	Thread.sleep(3000);
	WebElement terms=driver.findElement(By.xpath("(//a[text()='Terms'])[2]"));
	terms.click();
	Thread.sleep(3000);
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	String attributeValue=email.getAttribute("type");
	System.out.println(attributeValue);
	if(attributeValue.equals("text")) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}

}
}
