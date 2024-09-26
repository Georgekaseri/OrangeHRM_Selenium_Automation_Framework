package G_K.Pages.PageFactory;

import G_K.Pages.PageObjectModel.DashboardPage_POM;
import G_K.Utils.PropertyReader;
import G_K.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage_PF extends CommonToAllPage {
    WebDriver driver;
    public LoginPage_PF(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
    }

    //  Page Locators
    @FindBy(xpath = "//*[@name=\"username\"]")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;


    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement signButton;

    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement error_message;



    // Page Actions
    public String loginToVWOInvalidCreds() {
        enterInput(username, PropertyReader.readyKey("username"));
        enterInput(password, "admin");
        clickElement(signButton);

        return getElement(null).getText();


    }

    public void loginToVWOValidCreds() {
        enterInput(username, PropertyReader.readyKey("username"));
        enterInput(password, PropertyReader.readyKey("password"));
        clickElement(signButton);
        // Dashboard
    }

    public DashboardPage_POM afterLoginVWOValidCreds(){
        return new DashboardPage_POM();
    }


}