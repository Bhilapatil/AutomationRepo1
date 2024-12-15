package findelement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindElementExamples {
    public static void main(String[] args)  throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.linkText("Create a new account"));
        element.click();
        driver.close();
    }
}
