package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Pop_Up_File_Upload
{
    public  static void main(String[] args) throws InterruptedException,IOException,AWTException
    {
        WebDriver driver;
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement Element = driver.findElement(By.xpath("//input[@id='singleFileInput']"));
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.dragAndDrop(Element,Element).perform();


        Thread.sleep(2000);
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(2000);
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        driver.quit();
    }
}

/*String filePath = "D:\\Documents\\Notepad\\Testpage.html";
        Element.sendKeys(filePath);*/
//Element.sendKeys("D:\\Documents\\Notepad\\Testpage.html");
//FileInputStream f = new FileInputStream("D:\\Documents\\Notepad\\Testpage.html");

//driver.findElement(By.id("singleFileInput")).sendKeys(f);