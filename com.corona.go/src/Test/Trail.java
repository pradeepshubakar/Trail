package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Trail {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void testTrail() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Tasks']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='- Select Customer -' and @class='emptySelection']")).click();
		driver.findElement(By.xpath("//div[.='- New Customer -']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter Customer Name' and @class]")).sendKeys("hdfc003");
		driver.findElement(By.xpath("//input[@placeholder='Enter Project Name' and @class]")).sendKeys("actitime");
		driver.findElement(By.xpath("(//input[@placeholder='Enter task name' ])[1]")).sendKeys("Test");
		driver.findElement(By.xpath("(//input[@placeholder='not needed' ])[1]")).click();
		driver.findElement(By.xpath("(//button[.='set deadline' ])[1]")).click();
		driver.findElement(By.xpath("//button[contains(.,'May ') ]")).click();
		driver.findElement(By.xpath("//span[.='25']")).click();
		driver.findElement(By.xpath("(//span[@class='checkmark checkMark'])[2]")).click();
		driver.findElement(By.xpath("//div[.='Create Tasks']")).click();
		driver.close();
		
		
	}
}
