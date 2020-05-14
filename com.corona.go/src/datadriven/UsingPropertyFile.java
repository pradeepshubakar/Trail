package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPropertyFile  {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		FileInputStream f=new FileInputStream("./data/Commondata.properties.txt");
		Properties p=new Properties();
		p.load(f);
		System.out.println(p.getProperty("username"));
		
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.close();
		
	}
}
