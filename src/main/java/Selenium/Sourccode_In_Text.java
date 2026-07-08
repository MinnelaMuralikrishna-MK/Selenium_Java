package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Sourccode_In_Text
{
    public  static void main(String[] args)throws InterruptedException
    {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        /*try
        {
            driver.get("https://testautomationpractice.blogspot.com/");

            String pagesource = driver.getPageSource();

            try(FileWriter writer = new FileWriter("Selenium_Test_Source.txt"))
            {
                writer.write(pagesource);
                System.out.println("Page source written to Selenium_Test_Source.txt");
            }
            catch (IOException e)
            {
                System.out.println("");
            }
        }
        finally
        {
            driver.getTitle();
            //driver.quit();
        }*/

        try {
            // Navigate to the target page
            driver.get("https://testautomationpractice.blogspot.com");

            // 1. Get the source code
            String pageSource = driver.getPageSource();

            // 2. Define the path where you want to save it
            String filePath = "D:\\Documents\\Notepad\\PageSource.txt";

            // 3. Write the content to the text file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(pageSource);
                System.out.println("Source code saved successfully at: " + filePath);
            } catch (IOException e) {
                System.out.println("An error occurred while saving the file: " + e.getMessage());
            }

        } finally {
            // Close the browser
            driver.quit();
        }

    }
}
