package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AjaxFormSubmit {
	WebDriver driver;
	 @FindBy(xpath="//input[@id='subject']")
			 WebElement subject ;
	 @FindBy(xpath="//textarea[@id='description']")
	WebElement description ;
	 @FindBy(xpath="//input[@value='Submit']")
		WebElement submit ;
	 @FindBy(xpath="//div[@id='message-one']")
	 WebElement showtext;
	
 public AjaxFormSubmit (WebDriver driver) {
		this.driver=driver;}
 

 public void description(String value) {
		description.sendKeys(value);
		}
		 public void subject(String value) {
				subject.sendKeys(value); 
		
 }
 public void submit() {
	 submit.click();
 }
 public String showtext() {
		return showtext.getText();
}
	

}
