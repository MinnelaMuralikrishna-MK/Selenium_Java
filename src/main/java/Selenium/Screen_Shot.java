package Selenium;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;

public class Screen_Shot
{
    private WebDriver driver;

    public static void main(String[] args)
    {
        WebDriver driver;
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File Shot = ts.getScreenshotAs(OutputType.FILE);

        File Loc = new File("D:/IntelliJ/IdeaProject/Selenium_Java/Screenshots/Shot_1.png");

        //FileHandler.copy(Shot.getAbsoluteFile(),Loc.getClass());
        System.out.println("Screenshot Captured Successfully");
        driver.quit();
    }
}
