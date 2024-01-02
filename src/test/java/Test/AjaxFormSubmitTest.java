package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import base.DriveIntiation;
import pages.AjaxFormSubmit;
import pages.HomePage;
import pages.InputForm;
import util.Screenshot;

public class AjaxFormSubmitTest extends DriveIntiation {
	WebDriver driver;
	HomePage homePage;
	DriveIntiation driveintiation;
	InputForm inputform;
	AjaxFormSubmit ajaxformsubmit;

	@BeforeTest
	// Parameters({"browser"})
	public void setUp(@Optional("chrome") String browser) throws Exception {
		driver = super.driveInitialize(browser);
	}

	@Test
	public void ajaxformsubmit() throws Exception {
		driver.get(INTIAL_URL);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.inputFormclick();
		inputform = PageFactory.initElements(driver, InputForm.class);
		inputform.ajaxformsubmit();
		ajaxformsubmit = PageFactory.initElements(driver, AjaxFormSubmit.class);
		ajaxformsubmit.subject("abhirami");

		// Sending keys to the description field
		ajaxformsubmit.description("This is a test description.");

		ajaxformsubmit.submit();
//		    	windowpopup.getTitles();

		Assert.assertEquals(ajaxformsubmit.showtext(),"Form has been submitted successfully!");

		Screenshot.takeScreenshot("radiobutton.png", driver);
	}


@AfterTest
public void closeTest() {
	driver.quit();
}
}

