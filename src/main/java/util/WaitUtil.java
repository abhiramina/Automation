package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class WaitUtil {
    WebDriver driver;

    public WaitUtil(WebDriver driver) {
        this.driver = driver;
    }

    public void implicitWait(int implicitSeconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitSeconds));
    }

    public void explicitWait(int explicitSeconds, WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(explicitSeconds));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void explicitWaitVisible(int explicitSeconds, WebElement message, String expectedMessage) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(explicitSeconds));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(message, expectedMessage));
    }

    public void fluentWait() {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.pollingEvery(Duration.ofSeconds(2));
        fluentWait.withTimeout(Duration.ofSeconds(30));
        fluentWait.ignoring(NoSuchElementException.class);

        fluentWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver arg) {
                return arg.findElement(By.xpath(""));
            }
        });
    }
}
