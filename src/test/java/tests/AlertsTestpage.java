package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Aleartframepage;

public class AlertsTestpage extends BaseLibrary{
	Aleartframepage ob;
	@BeforeTest
	public void getlaunchurl()
	{
		launchUrl("https://www.astrovidhan.com/");
       ob=new Aleartframepage();
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
      public void  clickalert()
      {
    	  ob.clickAlert();
      }
      @Test(priority=4)
      public void clickonbrowsewindows()
      {
    	  ob.browserwindows();
    	  
      }
      @Test(priority=5)
   public void clicknewtabs() throws InterruptedException
      {
      ob.browserwindows();
	  ob.clicknewtabs();

      }
   


}
