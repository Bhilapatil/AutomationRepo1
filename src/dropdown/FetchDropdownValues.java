package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FetchDropdownValues {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement dropDown = driver.findElement(By.id("carselect"));

        Select select = new Select(dropDown);
        List<WebElement> allOpptions = select.getOptions();
        for (WebElement e : allOpptions) {
            System.out.println(e.getText());
        }
        driver.close();
    }
}