package Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import util.ExcelReadUtil;
import util.RetryAnalyzer;
import util.Screenshot;

//@Listeners(util.ReportUtil.class)
public class TableDataVerifyTest extends base.DriveIntiation{
	WebDriver driver;
	pages.HomePage homePage;
	pages.TablePage tablePage;
	ExtentReports extentReports;
	private ExtentTest extentTest;

	@BeforeTest
	@Parameters({ "browser" })
	public void setUp(@Optional("chrome") String browser) throws Exception {
		driver = super.driveInitialize(browser);
		driver.get(INTIAL_URL);
		//extentTest = ReportUtil.getExtentReports().createTest("Table data verify test");
	}

	@Test(dataProvider = "employeeDetails", retryAnalyzer = RetryAnalyzer.class)
	public void tableVerify(String position, String office, String age, String startDate, String salary)
			throws Exception {
		homePage = PageFactory.initElements(driver,pages.HomePage.class);
		homePage.tableClick();
		tablePage = PageFactory.initElements(driver,pages.TablePage.class);
		tablePage.tableCheck("Ashton Cox");
		try {
			Assert.assertEquals(tablePage.getPosition(),position);
			Assert.assertEquals(tablePage.getOffice(),office);
			Assert.assertEquals(tablePage.getAge(),age);
			Assert.assertEquals(tablePage.getStartDate(),startDate);
			Assert.assertEquals(tablePage.getSalary(),salary);
			// extentTest.log(Status.PASS, "Successful");
		} catch (AssertionError assertionError) {
			// extentTest.log(Status.FAIL, "Test failed");
			throw assertionError;
		}
		Screenshot.takeScreenshot("Table.png", driver);
	}

	@DataProvider(name = "employeeDetails")
	public Object[][] getEmployeeDetails() throws IOException {
		List<String[]> infoList = new ArrayList<>();
		ExcelReadUtil excelRead = new ExcelReadUtil();
		String position = excelRead.readExcel(1,1);
		String office = excelRead.readExcel(2,1);
		String age = excelRead.readExcel(3,1);
		String startDate = excelRead.readExcel(4,1);
		String salary = excelRead.readExcel(5,1);
		infoList.add(new String[] {position,office,age,startDate,salary});

		return infoList.toArray(new String[infoList.size()][]);
	}

	//@AfterTest
	//public void closeTest() {
		//driver.quit();
	//}
}