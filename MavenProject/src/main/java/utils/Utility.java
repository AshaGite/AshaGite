package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	WebDriver driver;
	
	//2 Methods
	//public static
	//ScreenShot Method
	//ExcelSheet Method
	
		public static void captureScreenshot( WebDriver driver , String TestId) throws IOException, InterruptedException {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");  
			TakesScreenshot t=(TakesScreenshot)driver;

			File src=t.getScreenshotAs(OutputType.FILE);
			LocalDateTime now = LocalDateTime.now();  

File dest=new File("C:\\Users\\Usha\\OneDrive\\Documents\\ASHA\\test"+dtf.format(now) +"Test_VerifyPolicy.jpeg");
			//Thread.sleep(1000);
			//File dest=new File("C:\\Users\\Usha\\OneDrive\\Documents\\New folder\\Test Math.random().jpeg");
			FileHandler.copy(src, dest);
//	
//		
	}



	
		
		
		
	

	
	
public static String getDataFromExcel(String sheet,int row,int column) throws EncryptedDocumentException, IOException  {
		String path="C:\\All JAVA files\\Asha\\Rani.xlsx";
		FileInputStream file=new FileInputStream(path);
		String Data=WorkbookFactory.create(file).getSheet("Asha").getRow(1).getCell(0).getStringCellValue();
return Data;
}
		}
//
//		
//	}
//
//	}
/*try {
 * 
			Data=getStringCellValue();
		}
		catch(IllegalStateException e){
		
			double value=getNumericCellValue(); //returnType=double
		//double to String convert code
		data=//double to string conversion;
		*///}

		
	

