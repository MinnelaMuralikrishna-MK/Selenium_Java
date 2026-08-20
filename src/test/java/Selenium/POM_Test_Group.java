package Selenium;

import Java_Selenium.POM_Text;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class POM_Test_Group
{
    WebDriver driver;
    POM_Text textBoxPage;

    @BeforeMethod
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
        textBoxPage = new POM_Text(driver);
    }

    @Test(groups = {"smoke","regression"})
    public void testForm()
    {
        textBoxPage.enterfirstname("Minnela");
        textBoxPage.entersecondname("Muralikrishna");
        textBoxPage.enterUsername("MinnelaMK");
        textBoxPage.enterPassword("06129899");
        textBoxPage.clickbutton();
    }

    @AfterMethod
    public void tearDown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }
}
