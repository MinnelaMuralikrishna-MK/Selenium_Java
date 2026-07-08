package Java_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Selenium_3
{
        WebDriver driver;

        // Locators
        By emailField = By.xpath("//input[@class='_2IX_2- VJZDxU']");
        By passwordField = By.xpath("//input[@type='password']");
        By loginButton = By.xpath("//button[@type='submit']");

        public Selenium_3(WebDriver driver)
        {
            this.driver = driver;
        }


        public void enterEmail(String email)
        {

            driver.findElement(By.xpath("")).sendKeys(email);
        }


        public void enterPassword(String password)
        {
            driver.findElement(passwordField).sendKeys(password);
        }

            public void clickLogin()
        {
            driver.findElement(loginButton).click();
        }

}
