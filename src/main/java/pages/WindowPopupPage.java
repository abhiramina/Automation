package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.WaitUtil;
import util.WindowHandler;

public class WindowPopupPage {
    WebDriver driver;

    @FindBy(xpath = "//a[contains(text(),'Like us On Facebook')]")
    WebElement likeusonfacebook;

    // Assuming there is a title element to get text from
    @FindBy(xpath = "//form[@id='login_popup_cta_form']/div/div[@class='x1xka2u1 xqfms19']/child::span")
	public
    WebElement title;
    
    // Assuming there is a follow button element
    @FindBy(xpath = "//button[@class='follow-button']")
    WebElement followAllButton;

    public WindowPopupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void facebookBtnClick() {
        likeusonfacebook.click();
        // Assuming there is a WindowHandler class with a windowHandler method
        WindowHandler.handleWindows(driver);
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

	 
	 
	 
	 
	 
	
	


