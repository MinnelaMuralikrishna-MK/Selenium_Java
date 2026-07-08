package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximum_Quit
{
    public  static void main(String[] args)throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Chrome driver started");
        Thread.sleep(2000);
        driver.get("https://sites.google.com/view/minnelamk-qanotes/home");
        Thread.sleep(2000);
        System.out.println("Selenium driver navigate to "+driver.getTitle());
        Thread.sleep(2000);
        driver.manage().window().maximize();
        System.out.println("Selenium driver maximize window Automated");
        driver.quit();
        System.out.println("Selenium driver quit method automated");
    }
}
