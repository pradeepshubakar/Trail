package testNg_progrms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass1;
//@Listeners(com.actitime.generics.ListenerImplementation.class)
public class One extends Baseclass1 {

	
	
	
	
	
	
	@Test
	
	public void testAutoSugg() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		//Thread.sleep(10);
		
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(.,'java')]"));
		for(WebElement a:allSugg) {
			Reporter.log(a.getText(),true);
			
		}
		
		
	}
}
