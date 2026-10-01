package applicationutility;

import org.openqa.selenium.WebElement;

public interface appilcationUtility {
public void doubleclick(WebElement ele);
public void rightclick(WebElement ele);
public void clickme(WebElement ele);
public void switchnewtab(int tabindex);
public void uploadFile(String filePath); 
public void newtab(int newindex);
public void newwindow(int newwindowindex);
public void newwinmessage(int newwmessge);
//public void drageable(WebElement src);	
	
}
