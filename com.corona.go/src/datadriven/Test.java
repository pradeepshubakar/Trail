package datadriven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
	
	List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(.,'java')]"));
	for(WebElement a:allSugg) {
		String txt = a.getText();
		System.out.println(txt);
	}
	for (int i = 0; i < allSugg.size(); i++) {
		String string = allSugg.get(i).getText();
		System.out.println(string);
		
	}
	driver.close();
}
}
