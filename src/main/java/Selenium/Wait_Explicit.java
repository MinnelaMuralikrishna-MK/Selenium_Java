package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Wait_Explicit
{
    public static void main(String[] args)throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
        driver.getTitle();
        System.out.println("Title of the page is : " + driver.getTitle());

        Thread.sleep(2000);

        /* Explicit Wait the Element Click Method */

        WebElement Text = new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.elementToBeClickable(By.id("headingOne")));
        Text.click();

        System.out.println("Text is clicked : " + Text.getText());

        /* Explicit Wait Element to visible */

        //By fullname = By.id("headingTwo");
        WebElement name = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(By.id("headingTwo")));
        name.click();
        System.out.println("Name is clicked : " + name.getText());

        /*Explicit Wait Element to be present in the DOM */
        WebElement Element = new WebDriverWait(driver, Duration.ofSeconds(5)).until( ExpectedConditions.presenceOfElementLocated(By.id("headingThree")));
        System.out.println("Element is Presented : " + Element.getText());

        /* Explicit Wait Text to be present in an Element */
        boolean isUpdated = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("headingFour"), "sucess"));
        System.out.println("Element is Updated : " + isUpdated);

        Thread.sleep(5000);
        driver.quit();

    }
}
