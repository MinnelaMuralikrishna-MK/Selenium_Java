package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Try_catch_Exception
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        try
        {
            driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/register.php");
            driver.manage().window().maximize();

            WebElement element = driver.findElement(By.id("non Exsistence Element"));
            element.sendKeys("Hello World");
        }

        catch (NoSuchElementException e)
        {
            System.out.println("Error : Element not found");
            System.out.println("Exception Details -  " + e.getMessage());
        }

        catch (Exception e)
        {
            System.out.println("An Unexpected Error and its Details is -  " + e.getMessage());
        }

        finally
        {
            System.out.println("Closing the Browser ");
            driver.close();
        }
    }
}
