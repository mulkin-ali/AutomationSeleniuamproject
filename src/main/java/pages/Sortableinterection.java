package pages;

import java.sql.Driver;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class Sortableinterection extends BaseLibrary {
	public Sortableinterection() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//button[@data-target=\"#interations\"]")
	private WebElement clickonInterection;
	@FindBy(xpath = "//a[text()=\"sortable\"]")
	private WebElement sortable;
	@FindBy(xpath = "//table[@id='myTable']//td[1]")
	private List<WebElement> alltext;
  @FindBy(xpath="//*[@id=\"tab_25\"]/p[2]/button")
  private WebElement shortbtn;
  @FindBy(xpath="//table[@id=\"myTable\"]//td[1]")
  private List<WebElement> aftershort;
	public void clickonclosebtn() throws InterruptedException {
		Thread.sleep(1000);
		closebtn.click();
	}

	public void clickonprectice() {
		clickonprectice.click();
	}

	public void clickonIntrection() {
		clickonInterection.click();

	}

	public void sortaable() {
		sortable.click();

	}

	public void alltextsort() throws InterruptedException {
		TreeSet<String> alldata = new TreeSet<String>();
		for (WebElement ele : alltext) {
			alldata.add(ele.getText());
		}
		System.out.println(alldata);
		Thread.sleep(1500);
		shortbtn.click();
		for(  WebElement ele:aftershort )
		{
			
			Assert.assertEquals(ele.getText(), alldata.pollFirst());
		}
	}
//
//	public void clickonsortbtn() {
//		
//		
//	}
//	public void aftershortmethod()
//	{
//		for(  WebElement ele:aftershort )
//		{
//			Object alldata;
//			Assert.assertEquals(ele.getText(), alldata.);
//		}
//	}

}
