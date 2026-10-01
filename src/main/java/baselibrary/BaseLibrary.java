package baselibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import applicationutility.appilcationUtility;
import excelutility.excelUtility;
import propertyutility.propertyUtility;
import screenshotutility.ScreenShotutility;
import waitutility.WaitUtility;

public class BaseLibrary implements excelUtility, propertyUtility, appilcationUtility, WaitUtility, ScreenShotutility {
	public static WebDriver driver;

	public void launchUrl(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automationjavaframework\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();

	}

	@Override
	public String readdata(int sheetno, int rowno, int colno) {

//		String filename1="C:\\Automationjavaframework\\data\\Book1.xlsx";
		String filename1 = "C:\\Automationjavaframework\\data\\readdataexcel.xlsx";

		String value = "";
		try {
			FileInputStream fis = new FileInputStream(filename1);
			XSSFWorkbook workb = new XSSFWorkbook(fis);
			XSSFSheet sheet = workb.getSheetAt(sheetno);
			value = sheet.getRow(rowno).getCell(colno).getStringCellValue();

		} catch (Exception e) {
			System.out.println(e);
		}
		return value;

	}

	@Override
	public String getreadData(String key) {
		String path = "C:\\Automationjavaframework\\data\\config.properties";
		String value = "";

		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);

		} catch (Exception e) {
			System.out.println("issue in get read data " + e);
		}
		return value;

	}

	@Override
	public void doubleclick(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.doubleClick(ele).perform();
	}

	@Override
	public void rightclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();

	}

	@Override
	public void clickme(WebElement ele) {
		// TODO Auto-generated method stub

	}
//	@Override
//	public void drageable(WebElement src) {
//		Actions act=new Actions(driver);
//		act.dragAndDropBy(src, 200, 0).perform();		
//	}

	@Override
	public void switchnewtab(int tabindex) {
		Set<String> tabhndles = driver.getWindowHandles();
		List<String> tabs = new ArrayList<String>(tabhndles);
		driver.switchTo().window(tabs.get(tabindex));
	}

	@Override
	public void newtab(int newindex) {
		Set<String> newtabhndle = driver.getWindowHandles();
		List<String> newtabbrowser = new ArrayList<String>(newtabhndle);
		driver.switchTo().window(newtabbrowser.get(newindex));
	}

	@Override
	public void newwindow(int newwindowindex) {
		Set<String> newwindow = driver.getWindowHandles();
		List<String> newwindowstable = new ArrayList<String>(newwindow);
		driver.switchTo().window(newwindowstable.get(newwindowindex));
	}

	@Override
	public void newwinmessage(int newwmessge) {
		Set<String> newwindowmsghndle = driver.getWindowHandles();
		List<String> newwindowmsg = new ArrayList<String>(newwindowmsghndle);
		driver.switchTo().window(newwindowmsg.get(newwmessge));
	}

	@Override
	public void uploadFile(String filePath) {
		try {
			StringSelection sel = new StringSelection(filePath);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(sel, null);

			Robot rob = new Robot();
			rob.delay(500);

			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.keyRelease(KeyEvent.VK_V);

			rob.keyPress(KeyEvent.VK_ENTER);
			rob.delay(500);
			rob.keyRelease(KeyEvent.VK_ENTER);
		}

		catch (Exception e) {
			System.out.println("essu in getreaddata" + e);
		}

	}

	@Override
	public void waitforalert() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());

	}

	@Override
	public void getscrenshot(String foldername, String filename) {
		String path = System.getProperty("user.dir");
		String finalpaths = path + "//ScreenShots//" + foldername + "//" + filename + ".png";
		try {
			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File src = efw.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File(finalpaths));
		} catch (Exception e) {
			System.out.println("essu is get" + e);
		}
	}

	@AfterMethod
	public void getresultAnalysis(ITestResult result) {
		String path = System.getProperty("user.dir");
		String filename;
		filename = result.getMethod().getMethodName();

		try {
			if (result.getStatus() == ITestResult.SUCCESS) {
				getscrenshot("pass", filename);
			} else if (result.getStatus() == ITestResult.FAILURE) {
				getscrenshot("fail", filename);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@DataProvider(name="logincard")
	public Object[][] loginDateSet()
	{
		return new Object[][]{
			{"username1","password1"},
			{"username2","password2"},
			{"username3","password3"},
			{"username4","password4"},
         };
				

				
	}

}
