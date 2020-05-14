package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingExcel {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	 String url = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
	 System.out.println(url);
	 String un = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	 String pw = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	 WebDriver driver=new ChromeDriver();
	 driver.get(url);
	 driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pw);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.close();
	 
	
}
}
