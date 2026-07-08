package Selenium_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Gmail
{
    WebDriver driver;
    WebDriverWait wait;
    //private final String User = "mail@gmail.com";
    //private final String Password = "pass";

    @BeforeMethod
    public void setUp()
    {
        //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.gmail.com");
    }

    @Test
    public void TestGmail()
    {

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("User@gmail.com");
        driver.findElement(By.id("email")).click();

        WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        Password.sendKeys("PASSWORD");
        driver.findElement(By.id("passwordNext")).click();

        WebElement Compose = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("compose")));

        Assert.assertTrue("loginFailed : Compose button not Found",Compose.isDisplayed());
    }

    @AfterMethod
    public void tearDown()
    {
        if ((driver != null))
        {
            driver.quit();
        }
    }
}
/*
minnelamktest
22@@TestMK
 */