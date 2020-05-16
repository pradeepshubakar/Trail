package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//a[.='Logout']")
	private WebElement LogOut;
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement TasksTab;
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewDropDown;
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerTab;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement EnterCustomerNameTbx;
	@FindBy(xpath="//div[.='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDropDown;
	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement OurCompanyOption;
	@FindBy(xpath="//div[.='Create Customer' ]")
	private WebElement createCustomerTab;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogOut() {
		return LogOut;
	}
	public void clickOnTasksTab() {
		 TasksTab.click();;
	}

	public void clickOnAddNewDropDown() {
		 AddNewDropDown.click();;
	}

	public void clickOnNewCustomerTab() {
		 NewCustomerTab.click();;
	}

	public WebElement setEnterCustomerNameTbx() {
		return EnterCustomerNameTbx;
	}

	public void clickOnSelectCustomerDropDown() {
		 selectCustomerDropDown.click();;
	}

	public void clickOnOurCompanyOption() {
		 OurCompanyOption.click();;
	}

	public void clickOnCreateCustomerTab() {
		 createCustomerTab.click();;
	}

	
	

}
