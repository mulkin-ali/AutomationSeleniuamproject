package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.NestedFramepage;

public class NestedFrameTestpage  extends BaseLibrary{
	NestedFramepage ob;
	@BeforeTest
	public void getlaunchurl()
	{
		launchUrl("https://www.astrovidhan.com/");
		 ob=new NestedFramepage();
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
	public void clickalertwindows()
	{
		ob.clickAlert();
	}
	@Test(priority=4)
	public void clickonnestedfrme()
	{
		ob.clickonnestedframe();
	}
	@Test(priority=5)
	public void nestedframes()
	{
		ob.nestedframe();
	}
	

}
