package UploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFilesExamples {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().window().maximize();

        WebElement uploadButton = driver.findElement(By.id("file-upload"));

        uploadButton.sendKeys("C:\\Users\\ACER\\Downloads\\Busibud Assignments.pdf");

        driver.findElement(By.id("file-submit")).click();

        WebElement uploadMassage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        if (uploadMassage.getText().equalsIgnoreCase("File Uploaded...")) {
            System.out.println("File is sucessfully uploaded...");
        }else {
            System.out.println("File isn't uploaded...");

        }

        driver.close();


    }
}
