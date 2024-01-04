package Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import base.DriveIntiation;
import pages.AlertsAndModalsPage;
import pages.HomePage;
import pages.JavaScriptAlertPage;
import pages.ProgressBarsPage;
import util.RetryAnalyzer;
import util.Screenshot;

    public class JavascriptAlert extends DriveIntiation {
    	WebDriver driver;
    	HomePage homePage;
    	DriveIntiation driveintiation;
    	AlertsAndModalsPage alertsandmodals;
    	JavaScriptAlertPage javascriptalert;
    	@BeforeTest
    	//Parameters({"browser"})
    	public void setUp(@Optional("chrome")String browser)throws Exception{
    		driver=super.driveInitialize(browser);
    	}
    	@Test(retryAnalyzer=RetryAnalyzer.class)
    	public void windowPopup()throws Exception{
    	driver.get(INTIAL_URL);
    	homePage=PageFactory.initElements(driver,HomePage.class);
    	
    	homePage.alertsAndModalsClick();
    	alertsandmodals=PageFactory.initElements(driver,AlertsAndModalsPage.class);
    	alertsandmodals.jsAlert();
    	javascriptalert=PageFactory.initElements(driver,JavaScriptAlertPage.class);
    	javascriptalert.clickmeBtnclick();
    	Alert alert = driver.switchTo().alert();
    	String alertText = alert.getText();
    	
    	WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(60));
//       
    	//javascriptalert.getTitles();
    	Assert.assertEquals(alertText,"I am a Javascript alert box!");
    	alert.accept();
    	Screenshot.takeScreenshot("alertpopup.png",driver);
    }
    	
    	//javascriptalert.OkButtonclick();
   
    	@AfterTest
    	public void closeTest() {
    		driver.quit();
    	}
    	}
