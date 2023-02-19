package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	WebDriver driver;
	
	public static String getDataFromExcel(String path,String sheet,int row,int cell) throws Exception  {
		//String path="C:\\All JAVA files\\Asha\\Rani.xlsx";
	double data1;
	String data;
	long data2;
	
	FileInputStream file=new FileInputStream(path);
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet1=workbook.getSheet(sheet);
		try {
			data=sheet1.getRow(row).getCell(cell).getStringCellValue();
		return data;
		}
		catch (Exception e){
			data1=sheet1.getRow(row).getCell(cell).getNumericCellValue();
			data2=(long)data1;
			return String.valueOf(data2);
		}
	}

public static void captureScreenshot( WebDriver driver , String TestId) throws IOException, InterruptedException {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");  
			TakesScreenshot t=(TakesScreenshot)driver;

			File src=t.getScreenshotAs(OutputType.FILE);
			LocalDateTime now = LocalDateTime.now();  

File dest=new File("C:\\Users\\Usha\\OneDrive\\Documents\\ASHA\\test"+dtf.format(now) +"Test_VerifyPolicy.jpeg");
			//Thread.sleep(1000);
			//File dest=new File("C:\\Users\\Usha\\OneDrive\\Documents\\New folder\\Test Math.random().jpeg");
			FileHandler.copy(src, dest);
	
		
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

		
	

