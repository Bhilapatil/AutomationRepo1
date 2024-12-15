package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
        driver.manage().window().maximize();


    }
}
