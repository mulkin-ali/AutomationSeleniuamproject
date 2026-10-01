package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class Interactionpage extends BaseLibrary {
	public Interactionpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[1]/button")
	private WebElement closebtn;
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
	private WebElement clickonprectice;
	@FindBy(xpath = "//button[@data-target=\"#interations\"]")
	private WebElement clickonInterection;
	@FindBy(xpath = "//a[text()=\"draggable\"]")
	private WebElement clickdraggble;
	@FindBy(xpath = "//*[@id=\"tab_29\"]/div/iframe")
	private WebElement iframe;

	@FindBy(xpath = "//p[text()=\"I am draggable!\"]")
	private WebElement iamdraggable;
	@FindBy(xpath = "//a[text()=\"droppable\"]")
	private WebElement dropable;
	@FindBy(xpath = "//*[@src=\"images/download.jpg\"]")
	private WebElement image;
	@FindBy(xpath = "//*[@ondragover=\"allowDrop(event)\"]")
	private WebElement emptyBox;
	@FindBy(xpath = "//*[@src=\"drop.html\"]")
	private WebElement frame;
	@FindBy(xpath = "//a[text()=\"selectable\"]")
	private WebElement selectableclick;
	@FindBy(xpath = "//*[text()=\"There’s no traffic after the extra mile.\"]")
	private WebElement selectlisttext;
	
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

	public void clickdraggable() {
		clickdraggble.click();
		driver.switchTo().frame(iframe);
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//p[text()=\"I am draggable!\"]"));
		act.dragAndDropBy(iamdraggable, 0, 400).perform();

	}

	public void dropable() throws InterruptedException {
		dropable.click();

		driver.switchTo().frame(frame);

		Actions act = new Actions(driver);
		act.dragAndDrop(image, emptyBox).perform();
		driver.switchTo().defaultContent();
	}

	public void selectablemethod() {
		selectableclick.click();
	}

	public void selcetlisttext() {
		try {
			Thread.sleep(1500);
			Actions act = new Actions(driver);
			act.doubleClick(selectlisttext).perform();
			String color = selectlisttext.getCssValue("background-color");
			System.out.println(color);
			Assert.assertEquals(color, "rgb(0, 0, 255,1)");

		} catch (Exception e) {

			System.out.println(e);
		}

	}

	

}
