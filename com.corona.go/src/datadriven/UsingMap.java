package datadriven;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingMap {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	HashMap<String, String> map=new HashMap<String, String>();
	
	map.put("url", "https://demo.actitime.com/");
	map.put("username", "admin");
	map.put("password", "manager");
	
	
	String un = map.get("username");
	System.out.println(un);
	
	String ur= map.get("url");
	System.out.println(ur);
	String pw = map.get("password");
	System.out.println(pw);
	WebDriver driver=new ChromeDriver();
	driver.get(ur);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pw);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	driver.close();
}
}
