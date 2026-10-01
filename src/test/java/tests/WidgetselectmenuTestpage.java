package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Widgetselectmenupage;

public class WidgetselectmenuTestpage extends BaseLibrary {
	Widgetselectmenupage ob;
      @BeforeTest
	public void getlaunchUrl() {
		launchUrl("https://www.astrovidhan.com/");
		ob = new Widgetselectmenupage();
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
	public void selectmenubtn()
	{
		ob.selectmenus();
	}
	@Test(priority=5)
	public void selectvalues()
	{
		ob.slectvalue();
	}


	
}
