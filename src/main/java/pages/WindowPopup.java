package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.WaitUtil;
import util.WindowHandler;

public class WindowPopup {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Like us On Facebook')]")
    WebElement likeusonfacebook;

    // Assuming there is a title element to get text from
    @FindBy(xpath = "//h1[@id='login_popup_cta_form']")
	public
    WebElement title;

    // Assuming there is a follow button element
    @FindBy(xpath = "//button[@class='follow-button']")
    WebElement followAllButton;

    public WindowPopup(WebDriver driver) {
        this.driver = driver;
    }

    public void facebookBtnClick() {
        likeusonfacebook.click();
        // Assuming there is a WindowHandler class with a windowHandler method
        WindowHandler.windowHandle(driver);
    }

    public String getTitles() {
    	WaitUtil waitUtil= new WaitUtil(driver);
    	waitUtil.explicitWait(25,title);
        return title.getText();
    }

    public void followBtnClick() {
        followAllButton.click();
    }
}

	 
	 
	 
	 
	 
	
	


