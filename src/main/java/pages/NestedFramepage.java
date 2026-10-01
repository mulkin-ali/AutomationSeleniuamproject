package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class NestedFramepage  extends BaseLibrary{
	public NestedFramepage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath="//*[@id=\"elements-accordion\"]/div[2]")
	private WebElement clickalertframe;
	@FindBy(xpath="//a[text()=\"nested frames\"]")
	private WebElement clickNestedframe;
	@FindBy(xpath="//iframe[@src=\"target1.html\"]")
	private WebElement outerframe;
	@FindBy(xpath="//iframe[@src=\"text.html\"]")
	private WebElement parentframe;
	@FindBy(xpath="//iframe[@src=\"example.html\"]")
	private WebElement innerframe;
	@FindBy(xpath="//a[text()='Click Here']")
	private WebElement clickhere;

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
	public void clickonnestedframe()
	{
		clickNestedframe.click();
	}
	public void nestedframe()
	{
		driver.switchTo().frame(outerframe);
		driver.switchTo().frame(parentframe);
		driver.switchTo().frame(innerframe);
		clickhere.click();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
	}
	

}
