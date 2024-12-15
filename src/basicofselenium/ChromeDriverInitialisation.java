package basicofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverInitialisation {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","")


        WebDriver driver = new ChromeDriver();    //1- To Create Webdriver object
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  //Upcasting

        driver.manage().window().maximize();
        String title = driver.getTitle();     //Get Title of web site
        System.out.println(title);
        driver.close();

    }

}
