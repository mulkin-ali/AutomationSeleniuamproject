package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Uploadownloadpage;

public class UploaddownTestpage extends BaseLibrary{
	Uploadownloadpage ob;
	@BeforeTest
	public void geturl()
	{
		launchUrl("https://www.astrovidhan.com/");
        ob=new Uploadownloadpage();
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
	public void clickonuploaddownload()
	{
		ob.clickonuploadandupadte();
	}
	@Test(priority=5)
	public void uploadfiles() throws InterruptedException
	{
		ob.uploadfile();
	}

	

}
