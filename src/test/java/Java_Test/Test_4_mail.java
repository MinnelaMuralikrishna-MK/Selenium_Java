package Java_Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_4_mail
{
    WebDriver driver;

    @BeforeMethod
    public void set()
    {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
    }

    @Test
    public void mail()throws InterruptedException
    {
        //driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
    }

    @AfterMethod
    public void tearDown()
    {
        //driver.quit();
    }
}
