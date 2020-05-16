package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass1;
import com.actitime.generics.FileLib;
import com.actitime.generics.WebDriverCommonLib;
import com.actitime.pom.HomePage;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class Demo extends Baseclass1 {
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriverCommonLib w=new WebDriverCommonLib();
		w.waitForPageLoad();
		FileLib f=new FileLib();
		HomePage h=new HomePage(driver);
		h.clickOnTasksTab();
		h.clickOnAddNewDropDown();
		h.clickOnNewCustomerTab();
		Thread.sleep(5000);
		h.setEnterCustomerNameTbx().sendKeys(f.getExcelFileData("Sheet3", 3, 0));
		h.clickOnSelectCustomerDropDown();
		h.clickOnOurCompanyOption();
		h.clickOnCreateCustomerTab();
		Thread.sleep(5000);
}
}
