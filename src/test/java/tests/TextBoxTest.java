package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Textboxpage;

public class TextBoxTest extends BaseLibrary{
	Textboxpage ob;
	@BeforeTest
	public void lanchUrl()
	{
        launchUrl("https://www.astrovidhan.com/");
         ob=new Textboxpage();
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
    public void clicktextbox()
    {
		ob.clickontextbox();
    }
	@Test(priority=5)
	public void fillname()
	{
		ob.filldetailes(null);
		
	}
	@Test(priority=6)
	public void submitbtn()
	{
		ob.submitbtn();
	}
}
