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
import pages.FormSubmitPage;
import pages.HomePage;
import pages.InputFormPage;
import util.Screenshot;

public class FormSubmitTest extends DriveIntiation {
	WebDriver driver;
	HomePage homePage;
	DriveIntiation driveintiation;
	InputFormPage inputform;
	FormSubmitPage formsubmit;

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
		inputform = PageFactory.initElements(driver, InputFormPage.class);
		inputform.formsubmit();
		formsubmit = PageFactory.initElements(driver, FormSubmitPage.class);
		formsubmit.Firstname("abhirami");
		formsubmit.lastname("nair");
		formsubmit.username("abhiraminair");
		formsubmit.state("kerala");
		formsubmit.city("trivandrum");
		formsubmit.zip("695543");

		formsubmit.termsandcondition();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//   
		formsubmit.submit();
		Assert.assertEquals(formsubmit.showtext1(), "Form has been submitted successfully!");

		Screenshot.takeScreenshot("form.png", driver);
	}

	// javascriptalert.OkButtonclick();

	@AfterTest
	public void closeTest() {
		driver.quit();
	}
}
