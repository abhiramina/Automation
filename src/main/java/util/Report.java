package util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report implements ITestListener {
	static ExtentReports extentreports;
	static ExtentTest extenttest;
	static {
		String reportPath = System.getProperty("user.dir")+("C:\\Users\\testresults.html");
				ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportPath);
		htmlReporter.config().setDocumentTitle("Automation reports");
		htmlReporter.config().setReportName("Automation results");
		htmlReporter.config().setTheme(Theme.STANDARD);
		extentreports=new ExtentReports();
		extentreports.attachReporter(htmlReporter);
		
		
	}
	
	

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Suite Started: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Case Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Case Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Case Skipped: " + result.getName());
    }
    @Override
    public void onFinish(ITestContext context) {
        extentreports.flush();
    }
public static ExtentReports getExtentReports() {
	return extentreports;}
}
   





