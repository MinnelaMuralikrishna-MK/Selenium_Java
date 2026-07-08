package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Print_Auto_Suggestions
{
    public static void main(String[] args)throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        System.out.println("Chrome Driver started");
        driver.get("https://www.google.com");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Java");
        Thread.sleep(2000);

        List<WebElement> Ele = driver.findElements(By.xpath("//span[contains(text(),'java')]"));

        int count = Ele.size();
        System.out.println("Found " + count + " results");
        Thread.sleep(2000);

        for (int i = 1; i <count; i++)
        {
            String T = Ele.get(i).getText();
            System.out.println(T);
        }
        Ele.get(0).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
