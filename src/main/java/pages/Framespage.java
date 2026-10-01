package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Framespage extends BaseLibrary {
	public Framespage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[2]")
	private WebElement clickalertframe;
	@FindBy(xpath = "//a[text()=\"frames\"]")
	private WebElement clickonframes;
	@FindBy(xpath = "//h1[text()='This is a sample page']")
	private WebElement largesampletext;
	@FindBy(xpath="//iframe[@src=\"Framelink.html\"][1]")
	private WebElement frame1;

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

	public void clickframes() {
		clickonframes.click();

	}

	public void validateText() {
		driver.switchTo().frame(frame1);
		String value = largesampletext.getText();
		System.out.println(value);
		String actual = value;
		Assert.assertEquals("This is a sample page", actual);
		driver.switchTo().defaultContent();
	}

}
