package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Menudropdownpage;

public class Menudropdownservicetest extends BaseLibrary{
	Menudropdownpage ob;
	@BeforeTest
	public void getlaunchurl()
	{
		launchUrl("https://www.astrovidhan.com/");
		 ob=new Menudropdownpage();
	}

	@Test(priority = 1)

	public void clickonclosebtn() throws InterruptedException {
		ob.clickonclosebtn();
	}

	@Test(priority = 2)
	public void clickonperctice() {
		ob.clickonprectice();
	}
	@Test(priority=3)
	public void clickwidge()
	{
		ob.clickwidge();
	}
	@Test(priority=4)
	public void  clickMenu()
	{
		ob.clickonmenu();
	}
	@Test(priority=5)
	public void hoverhomes()
	{
		ob.hoveronhomebtn();
	}
	@Test(priority=6)
	public void clickservice() throws InterruptedException
	{
		ob.clickservices();
	}

}
