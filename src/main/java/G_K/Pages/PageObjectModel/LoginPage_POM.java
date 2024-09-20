package G_K.Pages.PageObjectModel;

import G_K.Utils.PropertyReader;
import G_K.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM extends CommonToAllPage {
    WebDriver driver;
    public LoginPage_POM(){
        super();
    }

    //  Page Locators
    private By username = (By.xpath("//*[@name=\"username\"]"));
    private By password = By.xpath("//input[@placeholder='Password']");
    private By signButton = By.xpath("//button[normalize-space()='Login']");
    private By error_message = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");


    // Page Actions
    public String loginToVWOInvalidCreds() {
        visibilityOfElement(username);
        enterInput(username, PropertyReader.readyKey("username"));
        enterInput(password, "admin");
        clickElement(signButton);
        presenceOfElement(error_message);
        visibilityOfElement(error_message);
        return getElement(error_message).getText();


    }

    public void loginToVWOValidCreds() {
        visibilityOfElement(username);
        enterInput(username, PropertyReader.readyKey("username"));
        enterInput(password, PropertyReader.readyKey("password"));
        clickElement(signButton);
        // Dashboard
    }

    public DashboardPage_POM afterLoginVWOValidCreds(){
        return new DashboardPage_POM();
    }


}