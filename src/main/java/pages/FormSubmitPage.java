package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormSubmitPage {
	WebDriver driver;

	@FindBy(xpath = "//input[@id='validationCustom01']")
	WebElement Firstname;
	@FindBy(xpath = "//input[@id='validationCustom02']")
	WebElement lastname;
	@FindBy(xpath = "//input[@id='validationCustomUsername']")
	WebElement username;
	@FindBy(xpath = "//input[@id='validationCustom04']")
	WebElement state;
	@FindBy(xpath = "//input[@id='validationCustom03']")
	WebElement city;
	@FindBy(xpath = "//input[@id='validationCustom05']")
	WebElement zip;
	@FindBy(xpath = "//button[contains(text(),'Submit form')]")
	WebElement submit;
	@FindBy(xpath = "//div[@id='message-one']")
	WebElement showtext1;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement termsandcondition;
	@FindBy(xpath = "//div[@class='form-check']//div[@class='invalid-feedback']")
	WebElement showtext2;
	

	public FormSubmitPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Firstname(String value) {
		Firstname.sendKeys(value);
	}

	public void lastname(String value) {
		lastname.sendKeys(value);
	}

	public void username(String value) {
		username.sendKeys(value);
	}

	public void state(String value) {
		state.sendKeys(value);
	}

	public void city(String value) {
		city.sendKeys(value);
	}

	public void zip(String value) {
		zip.sendKeys(value);
	}

	public void termsandcondition() {
		if (!termsandcondition.isSelected()) {
			termsandcondition.click();
		}
	}
	public void termsandconditionUnchecked() {
		if(termsandcondition.isSelected()){
termsandcondition.click();}}
	public void submit() {
		submit.click();
	}

	public String showtext1() {
		return showtext1.getText();
	}
	public String showtext2() {
		return showtext2.getText();
	}

}
