package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadiobuttonDemoPage {
	WebDriver driver;
	 @FindBy(xpath="//input[@id='inlineRadio1']")
		WebElement malebtn ;
	 @FindBy(xpath="//input[@id='inlineRadio2']")
		WebElement femalebtn ;
	 @FindBy(xpath="//button[@id='button-one']")
		WebElement showselectedbtn ;
	 @FindBy(xpath="//div[@id='message-one']")
	 WebElement showtext;
	 
	 
	 public void Radiobutton(WebDriver driver) {
			this.driver=driver;}
	 public void malebtnclick() {
			malebtn.click();
	 }
	 public void femalebtnclick() {
			femalebtn.click();
	 }
	 public void showselectedbtnclick() {
			showselectedbtn.click();
	 }
	 public String showtext() {
			return showtext.getText();
	 }
	 
	

}
