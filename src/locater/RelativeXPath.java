package locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    // Basic X Path Method with ID Attribute
    /*  WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='login1']"));
        userNameTextBox.sendKeys("bhilapatil");  */

     //x path with text() function
 /*     WebElement rediffmailLink = driver.findElement(By.xpath("//a[text()='rediff.com']"));
        rediffmailLink.click(); */

     // X Path Using And
  /*      WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='login1' and @name='login']"));
        userNameTextBox.sendKeys("bhilapatil"); */

      //X Path Using OR
  /*    WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='login1' or @name='log']"));
        userNameTextBox.sendKeys("bhilapatil"); */

      //X Path with starts-with()
        WebElement createNewAccount = driver.findElement(By.xpath("//u[starts-with(text(),'Create a new account')]"));
        createNewAccount.click();
        driver.close();
    }

}
