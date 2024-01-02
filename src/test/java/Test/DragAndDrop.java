package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import base.DriveIntiation;
import pages.HomePage;
import pages.Others;
import util.Screenshot;

//@Listeners(util.Report.class)

   public class DragAndDrop extends DriveIntiation {
	WebDriver driver;
	HomePage homepage;
	Others others;
	ExtentReports extentreport;
	private ExtentReports extenttest;

	@BeforeTest
	 //@Parameters({"browser"})
	public void setUp(@Optional("chrome") String browser) throws Exception {
		driver = super.driveInitialize(browser);
		driver.get(INTIAL_URL);
	}

	@Test
	public void dragAndDrop() throws Exception{
		driver.get(INTIAL_URL);
		
		homepage = PageFactory.initElements(driver, HomePage.class);

		homepage.othersClick();
		others = PageFactory.initElements(driver,Others.class);
		others.dragAndDrop3();
		Screenshot.takeScreenshot("draganddrop.png", driver);
	}
	@AfterTest
	public void closeTest() {
		driver.quit();}
		
	}
	
	 
	
	
	
	
	
	


