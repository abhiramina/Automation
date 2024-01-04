package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsAndModalsPage {
	
		WebDriver driver;
		
		 @FindBy(xpath="//a[contains(text(),'Window Popup')]")
		WebElement windowpopup;
		 @FindBy(xpath="//a[contains(text(),'Bootstrap Alert')]")
			WebElement bootstrapalert;
		 @FindBy(xpath="//a[contains(text(),'Bootstrap Modal')]")
			WebElement bootstrapmodal;
		 @FindBy(xpath="//a[contains(text(),'Progress Bar Modal')]")
			WebElement progressbarmodal;
		 @FindBy(xpath="//a[contains(text(),'Javascript Alert')]")
			WebElement javascriptalert;
		 @FindBy(xpath="//a[contains(text(),'File Download')]")
			WebElement filedownload ;
		 public void Alertsandmodals (WebDriver driver) {
				this.driver=driver;}
		 
		
		 public void popupclick() {
				windowpopup.click();
		 }
		 public void jsAlert() {
			 javascriptalert.click();

}}
