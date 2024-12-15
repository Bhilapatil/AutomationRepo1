package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitWait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://camposcoffee.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.xpath("//button[@title='close']")).click();
    }



}
