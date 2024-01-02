package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropUtil {
	
	    private WebDriver driver;

	    public DragAndDropUtil(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void performDragAndDrop(WebElement source, WebElement target) {
	        Actions action = new Actions(driver);
	        action.dragAndDrop(source, target).perform();
	    }
	}



