package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //Sendkeys() Method
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='login1']"));
        userNameTextBox.sendKeys("bhila.patil2@gmail.com");
        Thread.sleep(3000);

        //clear()
        userNameTextBox.clear();

        //Submit ()
        WebElement signInBtn = driver.findElement(By.className("signinbtn"));
        signInBtn.submit();


        // GetTagName Method
        System.out.println(userNameTextBox.getTagName());
        System.out.println(userNameTextBox.getAttribute("id"));
        Thread.sleep(3000);
        driver.close();


    }

}
