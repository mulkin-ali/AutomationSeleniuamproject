package pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.ClearElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class webtablepage extends BaseLibrary {
	public webtablepage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
	private WebElement clickelement;
	@FindBy(xpath="//*[text()=\"web tables\"]")
	private WebElement webtable;
	@FindBy(xpath="//*[text()='Name:']/following::input[@name=\"name\"]")
	private WebElement nameinput;
	@FindBy(xpath="//input[@name=\"email\"]")
	private WebElement emailinput;
	
	@FindBy(xpath="/html/body/div/form/button")
	private WebElement savebtn;
   @FindBy(xpath="//*[@id=\"tab_4\"]/div/iframe")
   private WebElement iframe;
   @FindBy (xpath="//*[text()=\"Edit\"]")
   private List<WebElement> edits;
   @FindBy(xpath="//*[@name=\"edit_name\"]")
   private WebElement namefiled;
   @FindBy(xpath="//*[@name=\"edit_email\"]")
   private WebElement emailfiled;
   @FindBy(xpath="//*[text()='Update']")
   private WebElement update;
 
   
   
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
	public void webtable()
	{
		webtable.click();
	}
	public void filinput()
	{
		driver.switchTo().frame(iframe);
		for(int i=1;i<=4;i++)
		{
			nameinput.sendKeys(readdata(1, i, 0));
			emailinput.sendKeys(readdata(1, i, 1));
			savebtn.click();
		}
		
		}
	
	public void updateDeatils()
	{
		int i =1;
		for(WebElement editData:edits)
		{
			editData.click();
			namefiled.clear();
			namefiled.sendKeys(readdata(2, i, 0));
			emailfiled.clear();
			emailfiled.sendKeys(readdata(2, i, 1));
			update.click();
			i++;
			}
	}
	

}
