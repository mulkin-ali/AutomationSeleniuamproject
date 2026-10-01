package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.webtablepage;

public class WebtableTest  extends BaseLibrary{
	webtablepage ob;
	@BeforeTest
	public void launchUrl()
	{
		launchUrl("https://www.astrovidhan.com/");
        ob=new webtablepage();
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
	@Test(priority = 4)
	public void clickontable()
	{
		ob.webtable();
	}
	@Test(priority=5)
	public void fillinput()
	{
		ob.filinput();
	}
	
	@Test(priority=6)
	public void updatedetails()
	{
		ob.updateDeatils();
	}


}
