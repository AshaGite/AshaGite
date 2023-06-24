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
		//String path="src//test/resources//TestData//ProjectTestData.xlsx";
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

	public static void captureScreenshot(WebDriver driver, String screenshotPath, String methodName) {
        try {
            TakesScreenshot t = (TakesScreenshot) driver;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
            LocalDateTime now = LocalDateTime.now();
            File src = t.getScreenshotAs(OutputType.FILE);
            File dest = new File(screenshotPath + methodName + "--" + dtf.format(now) + "Facebook.jpg");
            FileHandler.copy(src, dest);
        } catch (Exception e) {
            System.err.println("Failed to take screenshot: " + e.getMessage());
        }
    
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

		
	
