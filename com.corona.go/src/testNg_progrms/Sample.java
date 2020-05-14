package testNg_progrms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;

public class Sample extends BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	 BaseClass b=new BaseClass();
	FileLib f=new FileLib();

	@Test
	public void testLogin() throws IOException {
		Reporter.log("Sample created",true);
		
		driver.get(f.getPropertyFileData("url"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(f.getPropertyFileData("username"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(f.getPropertyFileData("password"));
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
	}
	@BeforeClass
	public void openBrowser() {
		Reporter.log("login should happen before test");
		b.openBrowser();
		
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("logout should happen after test");
		b.closeBrowser();
	}
}
