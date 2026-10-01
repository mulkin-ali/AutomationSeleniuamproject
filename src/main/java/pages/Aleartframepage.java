package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Aleartframepage  extends BaseLibrary{
	public Aleartframepage()
	{
	  PageFactory.initElements(driver, this);	
	}
	 @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
		private WebElement closebtn;
		@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
		private WebElement clickonprectice;
		@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[2]")
		private WebElement clickalertframe;
		@FindBy(xpath="//a[text()=\"browser windows\"]")
		private WebElement browserwindows;
		 @FindBy(xpath="//*[@id=\"tab_11\"]/div[1]/a")
		 private WebElement clicknewtab;
		 @FindBy(xpath="//*[@id=\"tab_11\"]/div[2]/a")
		 private WebElement clicknewwindow;
		 @FindBy(xpath="//*[@id=\"tab_11\"]/div[3]/a")
		 private WebElement windowmsgclick;

		public void clickonclosebtn() throws InterruptedException {
			Thread.sleep(1000);
			closebtn.click();
		}

		public void clickonprectice() {
			clickonprectice.click();
		}
		public void clickAlert()
		{
			clickalertframe.click();
		}
		public void browserwindows()
		{
			browserwindows.click();
		}
		
		
		public void clicknewtabs() throws InterruptedException
		{
			clicknewtab.click();
			Thread.sleep(1000);
			newtab(0);
			clicknewwindow.click();
			Thread.sleep(2000);
            newwindow(0);
            windowmsgclick.click();
            Thread.sleep(1000);
            newwinmessage(0);
		}
		


}
