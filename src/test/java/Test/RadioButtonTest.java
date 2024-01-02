package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import base.DriveIntiation;
import pages.HomePage;
import pages.InputForm;
import pages.RadiobuttonDemo;
import util.Screenshot;

public class RadioButtonTest extends DriveIntiation {
	WebDriver driver;
	HomePage homePage;
	DriveIntiation driveintiation;
	InputForm inputform;
	RadiobuttonDemo radiobuttondemo;

	@BeforeTest
	// Parameters({"browser"})
	public void setUp(@Optional("chrome") String browser) throws Exception {
		driver = super.driveInitialize(browser);
	}

	@Test
	public void radiobutton() throws Exception {
		driver.get(INTIAL_URL);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.inputFormclick();
		inputform = PageFactory.initElements(driver, InputForm.class);
		inputform.radiobutton();
		radiobuttondemo = PageFactory.initElements(driver, RadiobuttonDemo.class);
		radiobuttondemo.malebtnclick();
		radiobuttondemo.showselectedbtnclick();
//		    	windowpopup.getTitles();

		Assert.assertEquals(radiobuttondemo.showtext(), "Radio button 'Male' is checked");

		radiobuttondemo.femalebtnclick();
		radiobuttondemo.showselectedbtnclick();
		Assert.assertEquals(radiobuttondemo.showtext(), "Radio button 'Female' is checked");
		
		Screenshot.takeScreenshot("radiobutton.png", driver);
	}

	@AfterTest
	public void closeTest() {
		driver.quit();
	}
}
