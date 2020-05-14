package testNg_progrms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class Assertcls extends BaseClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	BaseClass b=new BaseClass();
	
	
	@AfterClass
	public void closeBrowser() {
		b.closeBrowser();
	}
	@Test
	public void testAssertcls() {
		
		String Etitle = "Google";
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String Atitle = driver.getTitle();
		Assert.assertEquals(Etitle, Atitle);
	
	}
	
	
}
