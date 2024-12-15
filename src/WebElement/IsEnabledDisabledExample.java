package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDisabledExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        WebElement enabledBtn = driver.findElement(By.id("enabled-button"));
        WebElement disabledBtn = driver.findElement(By.id("disabled-button"));

        System.out.println(textBox.isEnabled());  //true
        disabledBtn.click();
        System.out.println(textBox.isEnabled());   //false
        enabledBtn.click();
        System.out.println(textBox.isEnabled());   //true

        driver.close();



    }

}
