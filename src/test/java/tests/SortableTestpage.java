package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Sortableinterection;

public class SortableTestpage extends BaseLibrary {
	Sortableinterection ob;

	@BeforeTest
	public void getlaunchurl() {
		launchUrl("https://www.astrovidhan.com/");
		ob = new Sortableinterection();
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
	public void clickInterection()
	{
		ob.clickonIntrection();
	}
	@Test(priority=4)
	public void clicksortable()
	{
	ob.sortaable();
	}
	@Test(priority=5)
  public void alltext() throws InterruptedException
  {
		ob.alltextsort();
  }
}
