package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Menudropdownpage extends BaseLibrary {
	public Menudropdownpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement clickwidget;
	@FindBy(xpath="//a[text()=\"menu\"]")
	private WebElement clickmenu;
	@FindBy(xpath="//a[text()='Home']")
	private WebElement hoverhome;
	@FindBy(xpath="//*[@id=\"navbar\"]/ul/li[3]")
	private WebElement services;
	@FindBy(xpath="//a[text()='Web Development']")
	private WebElement Webdevlpment;

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
	public void clickonmenu()
	
	{
		clickmenu.click();
	}
	public void hoveronhomebtn()
	{
		
		Actions ac=new Actions(driver);
		ac.moveToElement(hoverhome).build().perform();
	}
	public void clickservices() throws InterruptedException
	{
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.moveToElement(services).build().perform();
//		services.click();
		Webdevlpment.click();
	}
}
