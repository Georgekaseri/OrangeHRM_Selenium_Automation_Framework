package G_K.base;

import G_K.Utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static G_K.Drivers.DriverManager.getDriver;
import static java.sql.DriverManager.getDriver;

public class CommonToAllPage {
    public void CommonToAllPage(){
        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here
    }
    public void openVWOLoginURL() {
        getDriver().get(PropertyReader.readyKey("url"));
    }

    // This is common to all the Pages
    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    // This use for Page Factory
    public void clickElement(WebElement by) {
        by.click();
    }



    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);
    }

    // This use for Page Factory
    public void enterInput(WebElement element, String key) {
        element.sendKeys(key);
    }




    // Wait Explicits here

    public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }




    public WebElement visibilityOfElement(By elementLocation) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }




    public WebElement getElement(By key) {
        return getDriver().findElement(key);
    }






}