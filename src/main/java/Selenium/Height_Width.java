package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Height_Width
{
    public static  void main(String[] args)throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        System.out.println("Chrome Driver Started");
        driver.get("https://www.google.com");
        System.out.println("Opening Webpage from Desktop PC ");
        Thread.sleep(2000);

        WebElement Ele = driver.findElement(By.xpath("/*[@id = 'APjFqb']"));
        int Height = Ele.getSize().getHeight();
        System.out.println("Height of the Text Field is : " + Height);
        int Width = Ele.getSize().getWidth();
        System.out.println("Width of the Text Field is : " + Width);

        driver.quit();
    }
}
