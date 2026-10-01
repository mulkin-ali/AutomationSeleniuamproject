package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Linkpage extends BaseLibrary{
	public Linkpage()
	{
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
		private WebElement closebtn;
		@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
		private WebElement clickonprectice;
		@FindBy(xpath = "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")
		private WebElement clickelement;
		@FindBy(xpath="//a[text()=\"links\"]")
		private WebElement clickLINK;
		@FindBy(xpath="//*[@id=\"tab_6\"]/p[1]/a")
		private WebElement demopage;
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
		public void clickLinks()
		{
			clickLINK.click();
		}
		public void clickdemopage() throws InterruptedException
		{
			demopage.click();
			switchnewtab(1);
			Thread.sleep(1000);
			closebtn.click();
			switchnewtab(0);
			
		}

}
