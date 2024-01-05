package util;


	import java.io.File;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;

	public class Screenshot {
		public static void takeScreenshot (String screenshotFile, WebDriver driver) throws Exception  {
			TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
			File file = takeScreenshot.getScreenshotAs(OutputType.FILE);
			String destinationPath = System.getProperty("user.dir") + "/test-output/Screenshotfile.png";
		}
			
		}

	