package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Relative
{
    public  static void main(String[] args) throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        System.out.println("Opening Chrome Driver");
        driver.get("file:///D://Documents//Notepad//Testpage.html");
        String Current = driver.getCurrentUrl();
        Thread.sleep(2000);
        System.out.println("Current page Title is : " + driver.getCurrentUrl());

        driver.findElement(By.id("user")).sendKeys("Test");
        System.out.println("Username is Given");
        Thread.sleep(2000);

        driver.findElement(By.id("pass")).sendKeys("123456");
        System.out.println("Password is Given");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='authSection']/button")).click();
        System.out.println("Submit button is clicked");
        Thread.sleep(2000);

        //driver.findElement(By.xpath("//*[@button='Submit' or @text='submit']")).click();
        //Element.click();
        //System.out.println("Submit button is clicked");
        //Thread.sleep(2000);


        String page = driver.getCurrentUrl();

        if(Current == page)
        {
            System.out.println("Current page Title is : " + driver.getCurrentUrl() + "and it is Error");
        }
        else
        {
            System.out.println("Current page Title is : " + driver.getCurrentUrl() + "and it is Success");
        }
        //driver.quit();
        System.out.println("quit method is called");

    }
}
