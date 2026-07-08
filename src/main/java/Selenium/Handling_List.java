package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Handling_List
{
    public static void main(String[] args)throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        System.out.println("Chrome driver stating Automation");

        driver.get("https://www.facebook.com");
        //driver.manage().window().maximize();
        System.out.println("Page Title is : " + driver.getCurrentUrl() + "and it is Success");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div/div[1]/div/div[5]/div/a/div/div[1]/div/span/span")).click();
        System.out.println("Current page Title is : " + driver.getCurrentUrl() + "and it is Success");
        Thread.sleep(2000);

        WebElement man = driver.findElement(By.id("_r_9_"));
        //man.click();
        System.out.println("Month Clicked ");

        Select S = new Select(man);

        List<WebElement> allOptions = S.getOptions();
        int count = allOptions.size();
        System.out.println("Count of options : " + count);

        for (int i = 0; i < count; i++)
        {
            String option = allOptions.get(i).getText();
            System.out.println(option);
        }
        Thread.sleep(2000);
        //System.out.println(man.getText());
        driver.quit();

    }
}
