package com.actitime.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;
	//public FileLib f=new FileLib();
	/**
	 * Pradeep
	 * to open the browser
	 */
	@BeforeClass
	public void openBrowser() {
		
			driver=new ChromeDriver();
		}
	
	/**
	 * Pradeep
	 * to close the browser
	 */
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
	
}
