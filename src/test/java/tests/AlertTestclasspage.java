package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Alertsclasspage;

public class AlertTestclasspage extends BaseLibrary {
	Alertsclasspage ob;

	@BeforeTest
	public void getlaunchurl() {
		launchUrl("https://www.astrovidhan.com/");
		ob = new Alertsclasspage();
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
	public void clickalertpage() {
		ob.clickonalertwindow();
	}
	@Test(priority = 5)
	public void clickonclickmebtn() throws InterruptedException
	{
		ob.clickme();
	}


}
