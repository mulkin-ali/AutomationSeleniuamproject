package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Textboxpage extends BaseLibrary{
	public Textboxpage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
   @FindBy (xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
private WebElement clickonprectice;
   @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
   private WebElement clickelement;
   @FindBy(xpath="//a[text()=\"text box\"]")
   private WebElement clicktextbox;
   @FindBy(xpath="//*[@id=\"fullname1\"]")
   private WebElement fullname;
   @FindBy(xpath="//*[@id=\"fullemail1\"]")
  private  WebElement   fullemail;
   @FindBy(xpath="//*[@id=\"fulladdresh1\"]")
   private WebElement currentadress;
   @FindBy(xpath="//*[@id=\"paddresh1\"]")
   private WebElement permenetaddress;
    @FindBy(xpath="//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")
    private WebElement subitbtn;
    public void clickonclosebtn() throws InterruptedException 
    {
        Thread.sleep(1000);
  
    	  closebtn.click();
    }
    public void clickonprectice() 
    {
    	clickonprectice.click();
    }
    public void clickelements()
    {
    	 clickelement.click();
    }
    public void clickontextbox()
    {
    	clicktextbox.click();
    }
    public void filldetailes(String filename1)
    {
    	 fullname.sendKeys(readdata( 0, 1, 0));
    	 fullemail.sendKeys(readdata( 0, 1, 1));
    	 currentadress.sendKeys(readdata(0,1,2));
    	 permenetaddress.sendKeys(readdata(0, 1, 3));
    	 
    }
    public void submitbtn()
    {
   	 subitbtn.click();

    }

}
