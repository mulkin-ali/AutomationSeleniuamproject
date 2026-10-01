package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Accordionpage;

public class AccordionTestpage extends BaseLibrary {
	Accordionpage ob;
	@BeforeTest 
	public void getlaunchurl()
	{
		launchUrl("https://www.astrovidhan.com/");
		 ob=new Accordionpage();
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
	public void clickonaccordongpage()
	{
		ob.accordingmethod();
	}

}
