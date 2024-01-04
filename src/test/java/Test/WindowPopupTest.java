package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import base.DriveIntiation;
import pages.AlertsAndModalsPage;
import pages.HomePage;
import pages.WindowPopupPage;
import util.Screenshot;


	    public class WindowPopupTest extends DriveIntiation {
	    	WebDriver driver;
	    	HomePage homePage;
	    	DriveIntiation driveintiation;
	    	AlertsAndModalsPage alertsandmodals;
	        WindowPopupPage windowpopup;
	    	@BeforeTest
	    	//Parameters({"browser"})
	    	public void setUp(@Optional("chrome")String browser)throws Exception{
	    		driver=super.driveInitialize(browser);
	    	}
	    	@Test 
	    	public void windowPopup()throws Exception{
	    	driver.get(INTIAL_URL);
	    	homePage=PageFactory.initElements(driver,HomePage.class);
	    	homePage.alertsAndModalsClick();
	    	alertsandmodals=PageFactory.initElements(driver,AlertsAndModalsPage.class);
	    	alertsandmodals.popupclick();
	    	windowpopup=PageFactory.initElements(driver,WindowPopupPage.class);
	    	windowpopup.facebookBtnClick();
    	    windowpopup.getTitles();
	    	
	    	Assert.assertEquals(windowpopup.getTitles(),"Connect with Obsqura Zone on Facebook");
	    	Screenshot.takeScreenshot("WindowPopup.png",driver);
	    }
	    	@AfterTest
	    	public void closeTest() {
	    		driver.quit();
	    	}
	    	}
