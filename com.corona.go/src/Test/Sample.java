package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass1;
import com.actitime.generics.FileLib;
import com.actitime.generics.WebDriverCommonLib;
import com.actitime.pom.HomePage;

@Listeners(com.actitime.generics.ListenerImplementation.class)
public class Sample extends Baseclass1 {
	@Test
	public void test1() throws InterruptedException, EncryptedDocumentException, IOException {
		 WebDriverCommonLib w=new WebDriverCommonLib();
		 FileLib f=new FileLib();
		HomePage h=new HomePage(driver);
		w.waitForPageLoad();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		w.waitForPageLoad();
		h.clickOnTasksTab();
		h.clickOnAddNewDropDown();
		h.clickOnNewTaskTab();
		w.waitForElementLoad(driver.findElement(By.xpath("//div[.='- Select Customer -' and @class='emptySelection']")));
		Thread.sleep(5000);
		h.clickOnSelectCustomerDropDown();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='- New Customer -']")).click();
		//Thread.sleep(5000);
		//w.waitForElementLoad(driver.findElement(By.xpath("//div[.='- New Customer -']")));
		//h.clickOnNewCustomerTab();
		//Thread.sleep(5000);
		
		h.setEnterCustomerNameTbx().sendKeys(f.getExcelFileData("Sheet3", 5, 0));
		h.setEnterPorjectNameTxtbox().sendKeys(f.getExcelFileData("Sheet3", 1, 1));
		h.setEnterTaskNameTxtbox().sendKeys(f.getExcelFileData("Sheet3", 1, 2));
		h.clickOnEstimateTab();
		h.clickOnDeadlineTab();
		h.clickOnsetDeadLine();
		h.clickOncheckbox();
		h.clickcreateTaskTab();
		Thread.sleep(5000);
	}
}

