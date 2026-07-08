package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_HTML_Source
{
    public static void main(String[] args)throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Chrome driver has been initialized Selenium Start Automation");

        driver.manage().window().maximize();
        System.out.println("Webdriver Maximized");

        Thread.sleep(2000);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);
        String htmlcode = driver.getPageSource();
        Thread.sleep(2000);
        System.out.println("HTML Code is " + htmlcode);
        Thread.sleep(2000);
        driver.quit();
    }
}
