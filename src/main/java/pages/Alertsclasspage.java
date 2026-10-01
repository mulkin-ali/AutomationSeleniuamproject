package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Alertsclasspage extends BaseLibrary {
	public Alertsclasspage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[2]")
	private WebElement clickalertframe;
	@FindBy(xpath = "//a[text()=\"alerts\"]")
	private WebElement clickalert;
	@FindBy(xpath = "//*[@id=\"tab_12\"]/div[1]/div[2]/button")
	private WebElement clickme;
	@FindBy(xpath = "//*[@id=\"tab_12\"]/div[2]/div[2]/button")
	private WebElement clickmesecndbtn;
	@FindBy(xpath = "//*[@id=\"tab_12\"]/div[3]/div[2]/button")
	private WebElement clickonconfirmbox;
	@FindBy(xpath = "//*[@id=\"tab_12\"]/div[4]/div[2]/button")
	private WebElement clickonpromtbox;

	public void clickonclosebtn() throws InterruptedException {
		Thread.sleep(1000);
		closebtn.click();
	}

	public void clickonprectice() {
		clickonprectice.click();
	}

	public void clickAlert() {
		clickalertframe.click();
	}

	public void clickonalertwindow() {
		clickalert.click();
	}

	public void clickme() throws InterruptedException {
		clickme.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		clickmesecndbtn.click();
		waitforalert();
		driver.switchTo().alert().accept();
		clickonconfirmbox.click();

		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		clickonpromtbox.click();
		driver.switchTo().alert().sendKeys("aligaur");
		driver.switchTo().alert().accept();

		// clickmesecndbtn.click();
	}

}
