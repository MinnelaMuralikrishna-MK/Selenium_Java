package Java_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Flipkart_Login
{
    public  static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.navigate().to("https://www.flipkart.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("8886633380");

            driver.findElement(By.xpath("//button[@name='Request OTP']")).click();

            System.out.println("Enter the Passwword");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginbutton.click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            //driver.quit();
        }
    }
}
