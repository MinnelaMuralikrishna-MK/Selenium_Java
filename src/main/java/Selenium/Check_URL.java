package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_URL
{
    public static void main(String[] args)throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();
        System.out.println("Selenium driver Start automating");
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.navigate().refresh();
        System.out.println("Selenium driver refreshed to amazon page");
        Thread.sleep(2000);

        String url = driver.getCurrentUrl();
        System.out.println("If Condition Started");
        Thread.sleep(2000);
        if (url.equals("https://www.amazon.in/"))
        {
            System.out.println("URL is Navigated Successfully and the URL is " + driver.getCurrentUrl());
        }
        else
        {
            System.out.println("URL is NOT Navigated and the Actual URL is " + driver.getCurrentUrl());
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
