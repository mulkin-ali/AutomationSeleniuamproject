package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Loginpage;


public class LoginpageTest  extends BaseLibrary{
	Loginpage  ob;
	@BeforeTest 
   public void launchUrl()
	{
        launchUrl("https://www.astrovidhan.com/");
        ob=new Loginpage();

		}
	@Test(priority=1)
	public void getverifyTitle() throws InterruptedException
	{
		ob.getTitle();
		
	}
	@Test(priority=2)
	public void clickonclosebtn() throws InterruptedException
	{
		ob.clickonclosebtn();
	}
	@Test(priority=3)
	public void clickonperctice()
	{
		ob.clickonprectice();
	}
	@Test(priority=4)
	public void clickelement()
	{
		ob.clickelements();
	}
	@Test(dataProvider = "logincard")
	public void loginintoappliction(String username,String password)
	{
		System.out.println(username+""+ password);
	}
	
}
