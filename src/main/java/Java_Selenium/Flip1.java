package Java_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Flip1
{
    public static void main(String[] args) throws InterruptedException
    {
        // Setup must run BEFORE the driver is created
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        driver.get("https://www.flipkart.com");

        // Close the login popup if it appears (Flipkart shows this on most loads)
        try
        {
            WebElement closeLoginPopup = wait.until(
                    ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'✕')]")));
            closeLoginPopup.click();
        }
        catch (Exception e)
        {
            System.out.println("No login popup appeared - continuing");
        }

        // Search
        WebElement searchBox = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/div[1]/form/div/div/input")));
        searchBox.sendKeys("Apple 17" + Keys.ENTER);
        System.out.println("Test 1: Searched Apple 17");

        // Click first search result -> opens a NEW tab
        WebElement firstResult = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/div[1]/div[2]/span[2]/span/span[1]")));
        firstResult.click();
        System.out.println("Test 2: Option 1 clicked");

        // Wait for the second window/tab to actually open
        wait.until(driverWait -> driverWait.getWindowHandles().size() > 1);

        Set<String> keys = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(keys);

        String parent = windowList.get(0);
        String child = windowList.get(1);

        // Switch to the new (child/product) tab and STAY there - do not close it
        driver.switchTo().window(child);
        System.out.println("Test 3: Switched to child window");

        // Interact with the product page in the child window
        WebElement colorOption = wait.until(ExpectedConditions.elementToBeClickable(By.id("productRating_LSTMOBHFN6YN2HXB5HER9QXGU_MOBHFN6YN2HXB5HE_")));
        colorOption.click();
        System.out.println("Test 4: Second option (Black) clicked");

        // Optional cleanup once you're done with both windows:
        // driver.close();                 // closes current (child) window
        // driver.switchTo().window(parent);
        // driver.close();                 // closes parent window too
    }
}