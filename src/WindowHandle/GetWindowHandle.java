package WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHandle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        String windowId = driver.getWindowHandle();

        System.out.println(windowId);

        driver.findElement(By.id("openwindow")).click();

        Set<String> allwindow = driver.getWindowHandles();



        driver.quit();
    }



}
