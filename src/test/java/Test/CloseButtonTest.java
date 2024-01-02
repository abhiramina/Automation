package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import base.DriveIntiation;
import pages.HomePage;
import pages.ProgressBars;
import util.Screenshot;

public class CloseButtonTest extends DriveIntiation  {
	    	WebDriver driver;
	    	HomePage homePage;
	    	DriveIntiation driveintiation;
	    	ProgressBars progressBars;
	       
	    	@BeforeTest
	    	//Parameters({"browser"})
	    	public void setUp(@Optional("chrome")String browser)throws Exception{
	    		driver=super.driveInitialize(browser);
	    	}
	    	@Test
	    	public void windowPopup()throws Exception{
	    	driver.get(INTIAL_URL);
	    	homePage=PageFactory.initElements(driver,HomePage.class);
	    	homePage.progressBarsClick();
	    	progressBars=PageFactory.initElements(driver,ProgressBars.class);
	    	progressBars.startDownloadBtnClick();
	    	WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(60));
//	        wait.until(ExpectedConditions.elementToBeClickable(progressBars.CloseBtnClick()));
	    	
	    	progressBars.CloseBtnClick();
//	    	windowpopup.getTitles();
	    	
	    	Screenshot.takeScreenshot("WindowPopup.png",driver);
	    }
	    	@AfterTest
	    	public void closeTest() {
	    		driver.quit();
	    	}
	    	}
	


