package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingMultiInput {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis=new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet2");
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);

		WebDriver driver=new ChromeDriver();
		for (int i = 1; i <= rowcount; i++) {

			driver.get("https://demo.actitime.com/");
			String un = wb.getSheet("Sheet2").getRow(i).getCell(0).toString();
			String pw = wb.getSheet("Sheet2").getRow(i).getCell(1).toString();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pw);
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();

		}
		driver.close();


	}

}

