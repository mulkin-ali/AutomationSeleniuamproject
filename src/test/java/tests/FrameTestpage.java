package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Alertsclasspage;
import pages.Framespage;

public class FrameTestpage extends BaseLibrary {
	Framespage ob;

	@BeforeTest
	public void getlaunchurl() {
		launchUrl("https://www.astrovidhan.com/");
		ob = new Framespage();
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
	public void clickalert() {
		ob.clickAlert();
	}

	@Test(priority = 4)
	public void clickFrame() {
		ob.clickframes();
	}

	@Test(priority = 5)
	public void validatetextdata() {
		ob.validateText();
	}

}
