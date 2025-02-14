package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement textBox = driver.findElement(By.id("displayed-text"));
        WebElement showBtn = driver.findElement(By.id("show-textbox"));
        WebElement hideBtn = driver.findElement(By.id("hide-textbox"));

        System.out.println(textBox.isDisplayed());  //true
        hideBtn.click();
        System.out.println(textBox.isDisplayed());   //false
        showBtn.click();
        System.out.println(textBox.isDisplayed());  //true

        driver.close();



    }

}
