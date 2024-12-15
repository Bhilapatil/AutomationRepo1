package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardBasedActions {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement loginElement = driver.findElement(By.name("q"));

        Actions actions = new Actions(driver);
        actions.moveToElement(loginElement)
                .pause(2000)
                .click(loginElement)
                .keyDown(Keys.SHIFT)
                .sendKeys("t-shirt")
                .pause(2000)

                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .pause(2000)
                .build()
                .perform();
        Thread.sleep(2000);
        driver.close();
    }
}
