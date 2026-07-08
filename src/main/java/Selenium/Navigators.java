package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigators
{
    public static void main(String[] args)throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Selenium driver started");
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        System.out.println("Selenium driver Navigated to Amazon");
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Selenium driver refreshed");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("Selenium driver back to the main page");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        System.out.println("Selenium driver forwarded to amazon page");
        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.close();
    }
}
