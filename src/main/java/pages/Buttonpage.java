package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;

public class Buttonpage  extends BaseLibrary{
  public Buttonpage()
  {
	  PageFactory.initElements(driver,this);
  }
  @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickelement;
	@FindBy(xpath="//a[text()=\"buttons\"]")
	private WebElement buttons;
	@FindBy(xpath="//*[@id=\"tab_5\"]/div[1]/button")
	private WebElement doublleClick;
	@FindBy(xpath="//*[@id=\"double-content\"]")
	private WebElement doubleclicktext;
	@FindBy(xpath="//*[@id=\"noContextMenu\"]")
     private WebElement rightclick;	
	@FindBy(xpath="//*[@id=\"tab_5\"]/div[3]/button")
	private WebElement clickme;
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
	public void clickonbuttons()
	{
		buttons.click();
	}
	public void clickOnDouble() throws InterruptedException
	{
		SoftAssert sf=new SoftAssert();
		
		doubleclick(doublleClick);
		sf.assertEquals("you have done a double click",doubleclicktext.getText());
		sf.assertAll();
		Thread.sleep(1000);
		rightclick(rightclick);
		Thread.sleep(1000);
		clickme.click();
	}
	
	
}
