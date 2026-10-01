package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import baselibrary.BaseLibrary;

public class Widgetselectmenupage extends BaseLibrary {
	public Widgetselectmenupage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement clickwidget;
	@FindBy(xpath = "//a[text()='select menu']")
	private WebElement selectmenu;
	@FindBy(xpath="//label[text()='Select Value']/../descendant::select")
	private WebElement slectvaluedropdwon;

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

	public void selectmenus() {
		selectmenu.click();
		
	}
	public void slectvalue()
	{
		Select sel=new Select(slectvaluedropdwon);
	sel.selectByVisibleText("Group 1, Option 1");
//		sel.selectByIndex(1);
//		sel.selectByValue("Group 1, Option 1");
		
	}

}
