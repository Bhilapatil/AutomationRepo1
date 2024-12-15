package locater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocaterExample  {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //By the ID Locater

      /*  WebElement userNameTextBox = driver.findElement(By.id("login1"));
        userNameTextBox.sendKeys("bhila.patil2@gmail.com"); */

        //By the ClassName Locater
      /*  WebElement signinbtn = driver.findElement(By.className("signinbtn"));
        signinbtn.click(); */

        //By name Locater
      /*   WebElement passwordTextBox = driver.findElement(By.name("passwd"));
         passwordTextBox.sendKeys("123456"); */

        //By Linktext Locater

      /*  WebElement createNewAccountLink = driver.findElement(By.linkText("Create a new account"));
        createNewAccountLink.click(); */

        //By partial Linktext

      /*  WebElement createNewAccountLink = driver.findElement(By.partialLinkText("Create a "));
        createNewAccountLink.click(); */

        //By tag Name

      /*  List<WebElement> allTags = driver.findElements(By.tagName("input"));
        System.out.println(allTags.size()); */

        //By CSS Selector  by ID attribute
      /*  WebElement userNameTextBox = driver.findElement(By.cssSelector("input[id='login1']"));
        userNameTextBox.sendKeys("bhila.patil2@gmail.com"); */

        //By Class Attriute
      /*  WebElement signInBtn = driver.findElement(By.cssSelector("input[class='signinbtn']"));
        signInBtn.click();*/

        //By the absolute XPath
      /*  WebElement userNameTextBox = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[1]/div[2]/input"));
        userNameTextBox.sendKeys("bhilapatil");  */

        //By the Relative XPath



        Thread.sleep(2000);
        driver.close();
    }


}
