package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;

public class radioButtonPage extends BaseLibrary {
	public radioButtonPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickelement;
	@FindBy(xpath="//a[text()=\"radio buttons\"]")
	private WebElement radiobutton;
	@FindBy(xpath="//*[@id=\"yes\"]")
	private WebElement  yesbutton;
	@FindBy(xpath="//p[@id=\"radio-content\"]")
	private WebElement yesText;
	@FindBy(xpath="//*[@id=\"tab_3\"]/div[2]/label")
	private WebElement impressive;
	@FindBy(xpath="//p[text()='You have selected impressive']")
	private WebElement impressiveText;
	@FindBy(xpath="//input[@id=\"no\"]")
	private WebElement no;
	@FindBy(xpath="//p[text()='You have selected no']")
	private WebElement noText;
	
	
	
	
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
	public void clickradiobutton()
	{
		radiobutton.click();
	
	}
	public void clickyesbtton()
	{
		yesbutton.click();
		String actual=yesText.getText();
		String expected=getreadData("yes");
		System.out.println(actual);
		System.out.println(expected);
		if(expected.equals(actual))
		{
			System.out.println("validation completed");
			
		}else
		{
			System.out.println("not completed");
		}
		
	}
	public void impressivebutton()
	{
		
		impressive.click();
		String actual=impressiveText.getText();
		String expected=getreadData("impressive");
		Assert.assertEquals(actual, expected);
	}
	public void clickOnNobutton()
	{
		no.click();
		SoftAssert sf=new SoftAssert();
         String actual=noText.getText();
         
         String expected=getreadData("No");
         sf.assertEquals(actual, expected);
         sf.assertAll();
	}
	

}
