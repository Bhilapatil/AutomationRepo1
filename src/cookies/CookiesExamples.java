package cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExamples {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tcs.com/");
        driver.manage().window().maximize();

        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies) {
            System.out.println(c);
        }
        driver.close();
    }
}