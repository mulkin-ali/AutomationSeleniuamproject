package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Interactionpage;

public class IntrectionTestpage extends BaseLibrary {
	Interactionpage ob;

	@BeforeTest

	public void getlaunchurl() {
		launchUrl("https://www.astrovidhan.com/");
		ob = new Interactionpage();
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
	@Test(priority=4,enabled = false)
	public void clickdragablebtn()
	{
		ob.clickdraggable();
	}
	@Test(priority=5)
	public void clickondrapabl() throws InterruptedException
	{
		ob.dropable();
	}
	@Test(priority=6)
	public void clickslectable()
	{
		ob.selectablemethod();
	}
	@Test(priority=7)
	public void clickslecttext()
	{
		ob.selcetlisttext();
	}
	@Test(priority=8)
	public void cliconsortable()
	{
		ob.sortaable();
	}

	



     

}
