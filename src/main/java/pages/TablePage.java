package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TablePage {
    WebDriver driver;

    @FindBy(xpath = "//table[@id='dtBasicExample']/tbody/descendant::tr/child::td[1]")
    List<WebElement> tables;

    WebElement position;
    WebElement office;
    WebElement age;
    WebElement startDate;
    WebElement salary;

    public TablePage(WebDriver driver) {
        this.driver = driver;
    }

    public void tableCheck(String expectedName) {
        int currentRow = 1;
        for (WebElement eachRow : tables) {
            if (eachRow.getText().trim().equals(expectedName)) {
                position = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/descendant::tr[" + currentRow + "]/child::td[2]"));
                office = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/descendant::tr[" + currentRow + "]/child::td[3]"));
                age = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/descendant::tr[" + currentRow + "]/child::td[4]"));
                startDate = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/descendant::tr[" + currentRow + "]/child::td[5]"));
                salary = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/descendant::tr[" + currentRow + "]/child::td[6]"));
                break;
            }
            currentRow++;
        }
    }

    public String getPosition() {
        return position.getText().trim();
    }

    public String getOffice() {
        return office.getText().trim();
    }

    public String getAge() {
        return age.getText().trim();
    }

    public String getStartDate() {
        return startDate.getText().trim();
    }

    public String getSalary() {
        return salary.getText().trim();
    }
}
