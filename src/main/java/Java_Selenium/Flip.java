package Java_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Flip
{
    public static void main(String[] args)throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();

        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
/*        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement Ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[1]/div[1]/form/div/div/input")));
        Ele.sendKeys("Apple 17" + Keys.ENTER);*/

        WebElement Ele = driver.findElement(By.xpath("//div[1]/div[1]/form/div/div/input"));
        Ele.sendKeys("Apple 17" + Keys.ENTER);

        System.out.println("Test 1 Apple 17");
        driver.findElement(By.xpath("//div[3]/div[1]/div[2]/span[2]/span/span[1]")).click();
        System.out.println("Test 2 Option 1 Clicked");

        //driver.close();

        Set<String> keys = driver.getWindowHandles();
        List<String> WindowList = new ArrayList<>(keys);

        String parent = WindowList.get(0);
        String child = WindowList.get(1);
        Thread.sleep(2000);
        driver.switchTo().window(parent);
        System.out.println("Test 3 Switch");

        driver.navigate();

        driver.navigate().refresh(); 
        System.out.println("Test 4 Ready to Click Opt 2");
        Thread.sleep(2000);

        driver.findElement(By.id("productRating_LSTMOBHFN6YN2HXB5HER9QXGU_MOBHFN6YN2HXB5HE_")).click();

        //driver.findElement(By.xpath("//*[@data-id ='MOBHFN6YN2HXB5HE']")).click();
        System.out.println("Test 5 Option 2 Clicked");
    }
}
