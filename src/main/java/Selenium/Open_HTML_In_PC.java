package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_HTML_In_PC
{
    public static  void main(String[] args)throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();

        System.out.println("Opening Chrome Driver and start automation");
        Thread.sleep(2000);
        System.out.println("Searching NotePad Html File");

        driver.get("file:///D://Documents//drivertest.html");
        System.out.println("Opening Notepad HTML File");
        Thread.sleep(2000);

        System.out.println("Finding Element");
        WebElement element = driver.findElement(By.tagName("a"));
        element.click();
        Thread.sleep(2000);

        driver.navigate().refresh();
        System.out.println("Page Refreshed");
        Thread.sleep(2000);

        driver.getTitle();
        System.out.println("Page Title is " + driver.getTitle());
        Thread.sleep(2000);

        driver.getPageSource();
        System.out.println("Page Source is " + driver.getPageSource());
        Thread.sleep(2000);

        driver.manage().window().maximize();
        System.out.println("Window Maximize is Autoamted");
        Thread.sleep(2000);

        driver.navigate().back();
        System.out.println("Page Back is autoamted " + driver.getTitle());
        Thread.sleep(2000);

        System.out.println("Click on Flipkart URL ");
        WebElement Ele = driver.findElement(By.id("link-flipkart"));
        Ele.click();
        Thread.sleep(2000);
        System.out.println("New Web page is " + driver.getCurrentUrl());
        Thread.sleep(2000);
        System.out.println("Page Title is " + driver.getTitle());

        driver.quit();
        System.out.println("Quit method in Chrome Driver is Automated");

    }
}
