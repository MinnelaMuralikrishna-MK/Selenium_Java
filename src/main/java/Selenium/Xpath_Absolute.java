package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Absolute
{
    public  static void main(String[] args)throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        System.out.println("Chrome Driver Started");
        driver.get("file:///D://Documents//Notepad//Testpage.html");
        driver.getTitle();
        System.out.println("Current page Title is : " + driver.getCurrentUrl());
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[1]/button")).click();
        Thread.sleep(2000);
        System.out.println("Current page Title is : " + driver.getCurrentUrl());
        Thread.sleep(2000);

    }
}
