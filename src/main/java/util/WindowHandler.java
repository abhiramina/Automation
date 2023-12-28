package util;

import org.openqa.selenium.WebDriver;
import java.util.Iterator;
import java.util.Set;

public class WindowHandler {

    static WebDriver driver;

    public static void handleWindows(WebDriver driver) {
        String parentWindow = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        
        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!parentWindow.equals(childWindow)) {
                driver.switchTo().window(childWindow);
                // You can add additional logic here if needed
                // For example, perform actions in the child window
            }
        }
    }

	public static void windowHandle(WebDriver driver2) {
		// TODO Auto-generated method stub
		
	}
}

       

  