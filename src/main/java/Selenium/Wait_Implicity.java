package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Wait_Implicity
{
    public static void main(String[] args)throws Exception
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        driver.get("https://www.google.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[contains(text(),'java')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[contains(text(),'java')]")).clear();
        Thread.sleep(2000);

    }
}
