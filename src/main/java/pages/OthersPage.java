package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OthersPage {
	WebDriver driver;
	@FindBy(xpath = "//span[text()='Draggable n°1']")
	WebElement draggable1;
	@FindBy(xpath = "//span[text()='Draggable n°2']")
	WebElement draggable2;
	@FindBy(xpath = "//span[text()='Draggable n°3']")
	WebElement draggable3;
	@FindBy(xpath = "//span[text()='Draggable n°4']")
	WebElement draggable4;
	@FindBy(xpath = "//div[@id='mydropzone']")
	WebElement dropZone;
	@FindBy(xpath = "//div[@id='mylist']")
	WebElement dropList;

	public OthersPage(WebDriver driver) {
		this.driver = driver;
	}

	public void dragAndDrop1() {
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable1, dropZone).perform();
	}

	public void dragAndDrop2() {
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable2, dropZone).perform();
	}

	public void dragAndDrop3() {
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable3, dropZone).perform();
	}

	public void dragAndDrop4() {
		Actions action = new Actions(driver);
		 action.dragAndDrop(draggable4, dropZone).perform();
		
	}
}