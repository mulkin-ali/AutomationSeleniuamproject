package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.ChekBoxpage;

public class ChekboxTest  extends BaseLibrary{
	ChekBoxpage ob;
	@BeforeTest
	public void launchUrl()
	{
		launchUrl("https://www.astrovidhan.com/");
	 ob=new ChekBoxpage();
}
@Test(priority=1)
	
	public void clickonclosebtn() throws InterruptedException
	{
		ob.clickonclosebtn();
	}
	@Test(priority=2)
	public void clickonperctice()
	{
		ob.clickonprectice();
	}
	@Test(priority=3)
	public void clickelement()
	{
		ob.clickelements();
	}
	@Test(priority=4)
	public void clickonchekbox()
	{
		ob.clickonchekbox();
	}
	@Test(priority=5)
	public void clickonmoblie()
	{
		ob.cickonmoblie();
	}
	@Test(priority=6)
	public void clickonlaptop()
	{
		ob.clickonlaptop();
	}
	@Test(priority=7)
	public void clickondesktop()
	{
     ob.clickondesktop();
   }
}
