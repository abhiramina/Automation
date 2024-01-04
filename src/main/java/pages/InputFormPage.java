package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class InputFormPage {
	WebDriver driver;
	By selectInputSideMenu = By.xpath("//a[contains(text(),'Select Input')]");
	@FindBy(xpath="//a[contains(text(),'Radio Buttons Demo')]")
	WebElement radiobuttondemo;
	@FindBy(xpath="//a[contains(text(),'Ajax Form Submit')]")
	WebElement ajaxformsubmit;
	@FindBy(xpath="//a[contains(text(),'Form Submit')]")
	WebElement formsubmit;
	
	public InputFormPage(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnSideMenu() {driver.findElement(selectInputSideMenu).click();}
	public void selectDropDown(){
			 By colourDropDown = null;
			Select select = new Select(driver.findElement(colourDropDown));
			 select.selectByValue("Red");
	}
	 public void radiobutton() {
			radiobuttondemo.click();
	 }
	 public void ajaxformsubmit() {
			ajaxformsubmit.click();
	 }
	 public void formsubmit() {
			formsubmit.click();
	 }
}
 