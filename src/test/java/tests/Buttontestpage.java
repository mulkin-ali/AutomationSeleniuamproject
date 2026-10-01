package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Buttonpage;

public class Buttontestpage  extends BaseLibrary{
	Buttonpage ob;
@BeforeTest
public void launchUrl()
{
	launchUrl("https://www.astrovidhan.com/");
    ob=new Buttonpage();
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
@Test(priority=4)
public void clickOnbutton()
{
	ob.clickonbuttons();
	}
@Test(priority=5)
public void clickonallbtns() throws InterruptedException
{
	ob.clickOnDouble();
}

}
