package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertPage {
	WebDriver driver;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    WebElement clickme;
    
    public void clickmeBtnclick() {
        clickme.click();
        
        
}}
