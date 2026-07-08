package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.http2.impl.nio.ClientH2StreamMultiplexer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Print_All_Links
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        System.out.println("Opening Chrome Driver");
        driver.get("https://www.amazon.com");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        Thread.sleep(2000);

        List< WebElement> alllinks = driver.findElements(By.xpath("//a"));

        int Count = alllinks.size();
        System.out.println("Number of Links Found: " + Count);
        System.out.println(Count);

        for (int i = 0; i < Count; i++)
        {
            String text = alllinks.get(i).getText();
            System.out.println(text);
        }
        driver.quit();
    }
}
