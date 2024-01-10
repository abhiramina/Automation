package Test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.DriveIntiation;
import pages.HomePage;
import pages.SideinputPage;
import pages.SimpleFormPage;
import util.PropertyReader;
import util.Screenshot;

public class SimpleFormTest extends DriveIntiation {
	WebDriver driver;
	HomePage homePage;
	DriveIntiation driveintiation;
	SideinputPage simpleForm;
	SimpleFormPage singleInput;

	@Parameters({ "browser" })
	@BeforeTest
	public void setUp(@Optional("chrome") String browser) throws Exception {
		driver = super.driveInitialize(browser);
		System.out.println("browser is" + browser);
		String currentDirectory = System.getProperty("user.dir");
		String filePath = currentDirectory + File.separator + "src/test/resources/file.properties";

		// Use the dynamically loaded file path
		PropertyReader.getProperty(filePath, "username", "not found");
		System.out.println(PropertyReader.getProperty(filePath, "username", "not found"));
	}

	@Test

	public void simpleFormTest() throws Exception {
		driver.get(INTIAL_URL);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.inputFormclick();
		simpleForm = PageFactory.initElements(driver, SideinputPage.class);
		simpleForm.sideSimpleForm();
		singleInput = PageFactory.initElements(driver, SimpleFormPage.class);
		singleInput.enterMessage("Show Message!");
		singleInput.showButtonClick();
		Assert.assertEquals(singleInput.getMessage(), "Your Message : Show Message!");
		Screenshot.takeScreenshot("SimpleInput1.png", driver);

	}

	@AfterTest
	public void closeTest() {
		driver.quit();
	}
}
