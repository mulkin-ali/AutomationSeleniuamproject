package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class Accordionpage extends BaseLibrary {
	public Accordionpage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement clickwidget;
	@FindBy(xpath = "//a[text()='accordion']")
	private WebElement clickaccordianpage;
	@FindBy(xpath="//*[@id =\"collapse1\" ]")
	private WebElement accordianpragarphText;
	
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
	public void accordingmethod()
	{
		clickaccordianpage.click();	
		String prghphtext=accordianpragarphText.getText();
		System.out.println(prghphtext);
		Assert.assertTrue(prghphtext.contains("o now we can begin adding Accordion Items (shown in green) to our new Accordion. Select the \"Add new Paragraph\" button (shown in green)"));
	}

}
