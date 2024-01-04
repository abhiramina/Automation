package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.WaitUtil;

public class AjaxFormSubmitPage {
	WebDriver driver;
	 @FindBy(xpath="//input[@id='subject']")
			 WebElement subject ;
	 @FindBy(xpath="//textarea[@id='description']")
	WebElement description ;
	 @FindBy(xpath="//input[@value='Submit']")
		WebElement submit ;
	 @FindBy(xpath="//div[@id='message-one']")
	 WebElement showtext;
	 private WaitUtil waitUtil;
	
 public AjaxFormSubmitPage (WebDriver driver) {
		this.driver=driver;
		this.waitUtil = new WaitUtil(driver);}
 

 public void description(String value) {
 waitUtil.explicitWait(10, description);
		description.sendKeys(value);
		}
		 public void subject(String value) {
			   waitUtil.explicitWait(10, description);
				subject.sendKeys(value); 
		
 }
 public void submit() {
	 submit.click();
 }
 public String showtext() {
	 waitUtil.explicitWaitVisible(10, showtext, "Form has been submitted successfully!");
		return showtext.getText();
}
	

}
