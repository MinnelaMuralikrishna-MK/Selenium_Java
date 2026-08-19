package Java_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class POM_Select_Menu extends POM_Base
{
    private By SelectDrop = By.id("dinputGroupSelect01");

    public POM_Select_Menu(WebDriver driver)
    {
        super(driver);
    }

    public void selectoption(String option)
    {
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectDrop));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(option);
    }

}
