package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;

public class ChekBoxpage extends BaseLibrary {
	public ChekBoxpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickelement;
	@FindBy(xpath = "//a[text()=\"check box\"]")
	private WebElement clickonchekbox;
	@FindBy(xpath = "//*[@id=\"tab_2\"]/div/iframe")
	private WebElement clickiframe;
	@FindBy(xpath = "//*[@id=\"myCheck\"]")
	private WebElement clickmobile;
	@FindBy(xpath = "//*[@id=\"text\"]")
	private WebElement mobiletext;
	@FindBy(xpath = "//*[@id=\"mylaptop\"]")
	private WebElement clickonlaptop;
	@FindBy(xpath = "//*[@id=\"text1\"]")
	private WebElement laptoptext;
	@FindBy(xpath = "//*[@id=\"mydesktop\"]")
	private WebElement clickondesktop;
	@FindBy(xpath = "//*[@id=\"text2\"]")
	private WebElement desktoptext;

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

	public void clickonchekbox() {
		clickonchekbox.click();
	}

	public void cickonmoblie() {
		driver.switchTo().frame(clickiframe);
		clickmobile.click();
		String mobilevalue = mobiletext.getText();
		System.out.println(mobilevalue);
		String expected = (readdata(0, 1, 0));
		String actual = (mobilevalue);
		Assert.assertEquals(mobilevalue, "You are selected Mobile");
		Assert.assertEquals(expected, actual);
	}

	public void clickonlaptop() {
		clickonlaptop.click();

		SoftAssert sf = new SoftAssert();
		String laptopvalue = laptoptext.getText();
		String expected = (readdata(0, 1, 1));
		String actual = (laptopvalue);
		sf.assertEquals(actual, expected);
             sf.assertAll();
	}

	public void clickondesktop() {
		clickondesktop.click();

		SoftAssert sf = new SoftAssert();

		String desktopvalue = desktoptext.getText();
		String expected = (readdata(0, 1, 2));
		String actual = (desktopvalue);
		sf.assertEquals(actual, expected);
		sf.assertAll();

	}

}
