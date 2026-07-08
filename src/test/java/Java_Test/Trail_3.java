package Java_Test;

import Java_Selenium.Selenium_3;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Trail_3
{
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
    }

    @Test
    public void testSuccessfulLogin() {
        Selenium_3 loginPage = new Selenium_3(driver);
        loginPage.enterEmail("your-email@example.com");
        loginPage.enterPassword("your-password");
        loginPage.clickLogin();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
