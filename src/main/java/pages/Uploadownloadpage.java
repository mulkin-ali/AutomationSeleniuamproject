package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Uploadownloadpage extends BaseLibrary {
	public Uploadownloadpage() {
		PageFactory.initElements(driver, this);
	}

	String filePath = "C:\\Automationjavaframework\\data\\Screenshot 2026-09-11 000259.png";
    @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickelement;
	@FindBy(xpath = "//a[text()=\"upload and download\"]")
	private WebElement uploaddownload;
	@FindBy(xpath = "//label[text()='Select a file']")
	private WebElement chosefile;
	
	public void clickonclosebtn() throws InterruptedException {
		Thread.sleep(1000);
		closebtn.click();
	}

	public void clickonprectice() {
		clickonprectice.click();
	}

	public void clickelements() {
		clickelement.click();
	}

	public void clickonuploadandupadte() {
		uploaddownload.click();
	}

	public void uploadfile() throws InterruptedException {
		Thread.sleep(1000);
		chosefile.click();
        uploadFile(filePath);
	}

}
