package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.DatePickerpage;

public class DatepickerTestpage extends BaseLibrary {
	DatePickerpage ob;
	@BeforeTest
   public void getlaunchurl()
   {
		launchUrl("https://www.astrovidhan.com/");

	    ob=new DatePickerpage();
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
	public void clickdatepicker()
	{
		ob.clickdatepic();
	}
	@Test(priority=5)
	public void fillselctdate()
	{
		ob.selctdatemetho();
	}
	@Test(priority=6)
	public void dateandtime()
	{
		ob.dateandtimes();
	}
	
	
}
