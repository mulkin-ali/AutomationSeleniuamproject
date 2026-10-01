package pages;

import java.security.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class DatePickerpage extends BaseLibrary {
	public DatePickerpage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement clickwidget;
	@FindBy(xpath="//a[text()='date picker']")
	private  WebElement datepiclick;
	@FindBy(xpath="//*[@id=\"datePickerContainer\"]/div[1]/div[2]/input")
	private WebElement selectdate;
	@FindBy(xpath="//*[@id=\"datePickerContainer\"]/div[2]/div[2]/input")
	private WebElement datetime;
	public void clickonclosebtn() throws InterruptedException {
		Thread.sleep(1000);
		closebtn.click();
	}

	public void clickonprectice() {
		clickonprectice.click();
	}

	public void clickwidge() {
		clickwidget.click();

	}
	public void clickdatepic()
	{
		datepiclick.click();
	}
	public void selctdatemetho()
	{
		selectdate.sendKeys("9-23-2026");
		getscrenshot("pass", "fillsendkes");

	}
	public void dateandtimes()
	{
	  datetime.sendKeys("9-23-2026");
	  datetime.sendKeys(Keys.TAB);
	  datetime.sendKeys("2:49");

	}
	

}
