package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.WindowHandler;

public class ProgressBarsPage {
    WebDriver driver;

    @FindBy(xpath = "//button[@id='downloadButton']")
    WebElement startDownload; // Corrected variable name

    @FindBy(xpath = "//button[@type='button' and @class='ui-button ui-corner-all ui-widget']")
    WebElement closebutton; // Added missing WebElement for downloadBtn

    public ProgressBarsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void startDownloadBtnClick() {
        startDownload.click(); // Corrected method invocation
        // Assuming there is a WindowHandler class with a windowHandler method
        WindowHandler.windowHandle(driver);
    }
        public void CloseBtnClick() {
            closebutton.click();
    }
}
