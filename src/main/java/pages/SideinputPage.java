package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideinputPage {
	WebDriver driver;
	@FindBy (xpath="//a[text()='Simple Form Demo']")
	WebElement simpleForm;
	@FindBy(xpath="//a[text()='Checkbox Demo']")
	WebElement checkBox;
	public void SideInputPage (WebDriver driver) {
		this.driver=driver;
	}
	public void sideSimpleForm() {
		simpleForm.click();
	}
}








	

