package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baselibrary.BaseLibrary;

public class Loginpage extends BaseLibrary {

	
    public Loginpage() {
        PageFactory.initElements(driver, this);
    }
    public void getTitle() throws InterruptedException {
     	Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println("Testing Baba title is " + title);
    }
    @FindBy(xpath="//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
   @FindBy (xpath="//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
private WebElement clickonprectice;
   @FindBy(xpath="//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
   private WebElement clickelement;
   
    
    public void clickonclosebtn() 
    {
   
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
}