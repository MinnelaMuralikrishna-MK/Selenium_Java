package Selenium_Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class Tes_1_Unittesting
{
    private static WebDriver driver;


    @BeforeClass
    public static void setup()
    {
        if (driver == null)
        {
            WebDriverManager.chromedriver().setup();
            //WebDriver driver = new ChromeDriver();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://testautomationpractice.blogspot.com");
        }

    }

    @Test(priority = 1)

    public void testdata()throws  InterruptedException
    {
        WebElement nameField = driver.findElement(By.xpath("//*[@id='name']"));
        Thread.sleep(2000);
        nameField.click();
        nameField.sendKeys("Minnela MK");

        WebElement emailField = driver.findElement(By.id("email"));
        Thread.sleep(2000);
        emailField.click();
        emailField.sendKeys("Minnela_MK");

        WebElement Phone  = driver.findElement(By.id("phone"));
        Thread.sleep(2000);
        Phone.click();
        Phone.sendKeys("Minnela_MK");

    }

    @org.testng.annotations.Test( priority = 2)
    public void test2()throws  InterruptedException
    {
        WebElement nameField = driver.findElement(By.xpath("//*[@id='name']"));
        Thread.sleep(2000);
        nameField.clear();
        nameField.sendKeys("MK MURALI");

        WebElement emailField = driver.findElement(By.id("email"));
        Thread.sleep(2000);
        emailField.clear();
        emailField.sendKeys("MK@Email");

        WebElement Phone  = driver.findElement(By.id("phone"));
        Thread.sleep(2000);
        Phone.clear();
        Phone.sendKeys("Phone 9999 MK");
        Assert.assertEquals(Phone.isDisplayed(),true);
    }

    @AfterClass
    public static void teardown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }

}
