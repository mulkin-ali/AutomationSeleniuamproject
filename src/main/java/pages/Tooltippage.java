package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Tooltippage extends BaseLibrary {
	public Tooltippage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement clickwidget;
	@FindBy(xpath = "//a[text()=\"tool tips\"]")
	private WebElement tooptip;
	@FindBy(xpath="data-toggle=\"tooltip\"")
	private WebElement hovertoseeme;

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

	public void clicktooltips() {
		tooptip.click();
	}
	public void hovertoseememethod()
	{
		String title=hovertoseeme.getAttribute("title");
		System.out.println(title);
	}

}
