package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.DriveIntiation;
import pages.AlertsAndModals;
import pages.HomePage;

    public class JavascriptAlert extends DriveIntiation {
    	WebDriver driver;
    	HomePage homePage;
    	DriveIntiation driveintiation;
    	AlertsAndModals alertsandmodals;
    	JavascriptAlert javascriptalert;
	@Test
	public void alerttest() throws Exception {
		WebDriver driver = null;
		driver.findElement(By.xpath("//a[text()='Javascript Alert']")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
		Alert alert = driver.switchTo().alert();
		if (!alert.getText().equals("I am a Javascript alert box!")) {
			throw new Exception("recheck");
		}
		alert.accept();
		driver.quit();

	}

}
