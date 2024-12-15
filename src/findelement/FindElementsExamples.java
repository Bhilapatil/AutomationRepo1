package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        List<WebElement> allElement = driver.findElements(By.tagName("input"));
        Thread.sleep(3000);

        System.out.println(allElement.size());
        Thread.sleep(3000);
        driver.close();


    }

}
