package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InputForm {
	WebDriver driver;
	By selectInputSideMenu = By.xpath("");
	public InputForm(WebDriver driver) {
		this.driver = driver;
	}
	public void clickOnSideMenu() {driver.findElement(selectInputSideMenu).click();}
	public void selectDropDown(){
			 By colourDropDown = null;
			Select select = new Select(driver.findElement(colourDropDown));
			 select.selectByValue("Red");
	}

}
 