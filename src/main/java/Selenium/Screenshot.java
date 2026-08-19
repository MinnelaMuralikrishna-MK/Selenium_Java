package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;

public class Screenshot
{
    public static void takeScreenshot(WebDriver driver, String name)
    {
        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "Screenshots/" + name + ".png";
        try
        {
            new File("Screenshots").mkdirs();
            FileHandler.copy(source, new File(path));
            System.out.println("✅ Screenshot: " + path);
        }
        catch (Exception e)
        {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        takeScreenshot(driver, "Google");
        
        driver.quit();
    }
}