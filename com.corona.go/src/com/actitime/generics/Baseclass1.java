package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class Baseclass1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static WebDriver driver;
	
	public FileLib f=new FileLib();
	
	
	
	
	
	//@Parameters("browser")
	@BeforeTest
	public void openBrowser() throws IOException {
		 String browser = f.getPropertyFileData("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
	}
	@BeforeMethod
	public void login() throws IOException {
		driver.get(f.getPropertyFileData("url"));
		 LoginPage l=new LoginPage(driver);
		l.getUnTbx().sendKeys(f.getPropertyFileData("username"));
		l.getPwTbx().sendKeys(f.getPropertyFileData("password"));
		l.getLoginButton().click();
		/*driver.findElement(By.xpath("//input[@id='username']")).sendKeys(f.getPropertyFileData("username"));
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(f.getPropertyFileData("password"));
		driver.findElement(By.xpath("//div[.='Login ']")).click();*/
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		 HomePage h=new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10);
		h.getLogOut().click();
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
