package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.radioButtonPage;

public class radiobuttontest extends BaseLibrary {
	radioButtonPage ob;

	@BeforeTest
	public void launchUrl() {
		launchUrl("https://www.astrovidhan.com/");

		ob = new radioButtonPage();
	}

	@Test(priority = 1)

	public void clickonclosebtn() throws InterruptedException {
		ob.clickonclosebtn();
	}

	@Test(priority = 2)
	public void clickonperctice() {
		ob.clickonprectice();
	}

	@Test(priority = 3)
	public void clickelement() {
		ob.clickelements();
	}

	@Test(priority = 3)
	public void clickradiobutton() {
		ob.clickradiobutton();
	}

	@Test(priority = 4)
	public void clickyesbutton() {
		ob.clickyesbtton();
	}

	@Test(priority = 5)
	public void clickimpersivebtn() {
		ob.impressivebutton();
	}

	@Test(priority = 6)
	public void clickNobttn() {
		ob.clickOnNobutton();
	}

}
