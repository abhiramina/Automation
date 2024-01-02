package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import base.DriveIntiation;
import pages.FormSubmit;
import pages.HomePage;
import pages.InputForm;
import util.Screenshot;

public class UncheckError extends DriveIntiation {
	WebDriver driver;
	HomePage homePage;
	DriveIntiation driveintiation;
	InputForm inputform;
	FormSubmit formsubmit;

	@BeforeTest
	// Parameters({"browser"})
	public void setUp(@Optional("chrome") String browser) throws Exception {
		driver = super.driveInitialize(browser);
	}

	@Test
	public void form() throws Exception {
		driver.get(INTIAL_URL);
		homePage = PageFactory.initElements(driver, HomePage.class);

		homePage.inputFormclick();
		inputform = PageFactory.initElements(driver, InputForm.class);
		inputform.formsubmit();
		formsubmit = PageFactory.initElements(driver, FormSubmit.class);
		formsubmit.Firstname("abhirami");
		formsubmit.lastname("nair");
		formsubmit.username("abhiraminair");
		formsubmit.state("kerala");
		formsubmit.city("trivandrum");
		formsubmit.zip("695543");

		formsubmit.termsandconditionUnchecked();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//   
		formsubmit.submit();
		Assert.assertEquals(formsubmit.showtext2(), "You must agree before submitting");

		Screenshot.takeScreenshot("errorform.png", driver);
	}

	// javascriptalert.OkButtonclick();

	@AfterTest
	public void closeTest() {
		//driver.quit();
	}}

 


