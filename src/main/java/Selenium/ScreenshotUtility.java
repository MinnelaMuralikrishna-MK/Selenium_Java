package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtility
{
    private WebDriver driver;
    private String screenshotPath = "D:/IntelliJ/IdeaProject/Selenium_Java/Screenshots/";

    // Constructor
    public ScreenshotUtility(WebDriver driver)
    {
        this.driver = driver;
    }

    // ✅ Method 1: Basic Screenshot (Full Page)
    public String takeScreenshot(String screenshotName)
    {
        try
        {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String filePath = screenshotPath + screenshotName + ".png";
            File destination = new File(filePath);
            FileHandler.copy(source, destination);
            System.out.println("✅ Screenshot Captured: " + filePath);
            return filePath;
        }
        catch (IOException e)
        {
            System.out.println("❌ Failed to capture screenshot: " + e.getMessage());
            return null;
        }
    }

    // ✅ Method 2: Screenshot with Timestamp
    public String takeScreenshotWithTimestamp(String screenshotName)
    {
        try
        {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String filePath = screenshotPath + screenshotName + "_" + timestamp + ".png";
            File destination = new File(filePath);
            FileHandler.copy(source, destination);
            System.out.println("✅ Screenshot Captured: " + filePath);
            return filePath;
        }
        catch (IOException e)
        {
            System.out.println("❌ Failed to capture screenshot: " + e.getMessage());
            return null;
        }
    }

    // ✅ Method 3: Screenshot of Specific Element
    public String takeElementScreenshot(WebElement element, String screenshotName)
    {
        try
        {
            File source = element.getScreenshotAs(OutputType.FILE);
            String filePath = screenshotPath + "Element_" + screenshotName + ".png";
            File destination = new File(filePath);
            FileHandler.copy(source, destination);
            System.out.println("✅ Element Screenshot Captured: " + filePath);
            return filePath;
        }
        catch (IOException e)
        {
            System.out.println("❌ Failed to capture element screenshot: " + e.getMessage());
            return null;
        }
    }

    // ✅ Method 4: Screenshot as Base64
    public String takeScreenshotAsBase64()
    {
        try
        {
            TakesScreenshot ts = (TakesScreenshot) driver;
            String base64 = ts.getScreenshotAs(OutputType.BASE64);
            System.out.println("✅ Screenshot captured as Base64");
            return base64;
        }
        catch (Exception e)
        {
            System.out.println("❌ Failed to capture screenshot as Base64: " + e.getMessage());
            return null;
        }
    }

    // ✅ Method 5: Screenshot on Test Failure
    public String takeScreenshotOnFailure(String testName)
    {
        return takeScreenshotWithTimestamp("FAILURE_" + testName);
    }

    // ✅ Setter for custom screenshot path
    public void setScreenshotPath(String path)
    {
        this.screenshotPath = path;
        File dir = new File(path);
        if (!dir.exists())
        {
            dir.mkdirs();
            System.out.println("✅ Screenshot directory created: " + path);
        }
    }

    // ============ MAIN METHOD FOR TESTING ============
    public static void main(String[] args) throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        ScreenshotUtility screenshot = new ScreenshotUtility(driver);

        try
        {
            // Test 1: Navigate to Google
            driver.get("https://www.google.com");
            Thread.sleep(2000);

            // Take basic screenshot
            screenshot.takeScreenshot("Google_Homepage");

            // Take screenshot with timestamp
            screenshot.takeScreenshotWithTimestamp("Google_Timestamp");

            // Take screenshot as Base64
            String base64 = screenshot.takeScreenshotAsBase64();
            System.out.println("Base64 Preview: " + base64.substring(0, 50) + "...");

            // Take element screenshot
            WebElement googleLogo = driver.findElement(By.xpath("//img[@alt='Google']"));
            screenshot.takeElementScreenshot(googleLogo, "Google_Logo");

            // Simulate failure and take screenshot
            screenshot.takeScreenshotOnFailure("TestCase_Google");

            System.out.println("\n✅ All screenshot tests completed successfully!");
        }
        catch (Exception e)
        {
            System.out.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
        finally
        {
            driver.quit();
        }
    }
}
