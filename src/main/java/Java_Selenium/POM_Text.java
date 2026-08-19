package Java_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class POM_Text extends POM_Base
{
    private By firstname = By.id("firstname");
    private By secondname = By.id("lastname");
    private By Username = By.id("username");
    private By Password = By.id("password");
    private By RegisterBtn = By.xpath("//input[@value = 'Register']");
    // private By outputBox = By.id("output");

    public POM_Text(WebDriver driver)
    {
        super(driver);
    }

    public void enterfirstname(String First)
    {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(firstname));
        element.sendKeys(First);
    }

    public void entersecondname(String Second)
    {
        driver.findElement(secondname).sendKeys(Second);
    }

    public void enterUsername(String User)
    {
        driver.findElement(Username).sendKeys(User);
    }

    public void  enterPassword(String Pass)
    {
        driver.findElement(Password).sendKeys(Pass);
    }

    public void clickbutton()
    {
        wait.until(ExpectedConditions.elementToBeClickable(RegisterBtn)).click();
    }
//    public String getOutput()
//    {
//        wait.until(d -> !d.findElement(outputBox).getText().trim().isEmpty());
//        return driver.findElement(outputBox).getText().trim();
//    }

}
