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
	
	
	@FindBy(xpath="//div[.='+ New Tasks']")
	private WebElement NewTaskTab;
	@FindBy(xpath="//div[.='- New Customer -']")
	private WebElement newCustomerTab;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement EnterCustomerNameTxtbox;
	@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
	private WebElement EnterPorjectNameTxtbox;
	@FindBy(xpath="(//input[@placeholder='Enter task name' ])[1]")
	private WebElement EnterTaskNameTxtbox;
	@FindBy(xpath="(//input[@placeholder='not needed' ])[1]")
	private WebElement EstimateTab;
	@FindBy(xpath="(//button[.='set deadline'])[1]")
	private WebElement DeadlineTab;
	@FindBy(xpath="//div[contains(@id,'ext-gen9')]//span[.='22']")
	private WebElement setDeadLine;
	@FindBy(xpath="(//span[@class='checkmark checkMark'])[2]")
	private WebElement checkbox;
	@FindBy(xpath="//div[.='Create Tasks']")
	private WebElement createTaskTab;
	
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

	
	
	public void clickOnNewTaskTab() {
		 NewTaskTab.click();
	}
	public void clickOnnewCustomerTab() {
		 newCustomerTab.click();
	}
	public WebElement setEnterCustomerNameTxtbox() {
		 return EnterCustomerNameTxtbox;
	}
	public WebElement setEnterPorjectNameTxtbox() {
		 return EnterPorjectNameTxtbox;
	}
	public WebElement setEnterTaskNameTxtbox() {
		 return EnterTaskNameTxtbox;
	}
	public void clickOnEstimateTab() {
		 EstimateTab.click();;
	}
	public void clickOnDeadlineTab() {
		 DeadlineTab.click();;
	}
	public void clickOnsetDeadLine() {
		 setDeadLine.click();;
	}
	
	public void clickOncheckbox() {
		checkbox.click();
	}
	public void clickcreateTaskTab() {
		createTaskTab.click();
	}
}
