package G_K.Pages.PageObjectModel;

import G_K.base.CommonToAllPage;
import org.openqa.selenium.By;

public class Employee_DashboardPage_POM extends CommonToAllPage {

    public Employee_DashboardPage_POM(){

    }

    // Page Locators
    private By newUserNameOnDashboard = By.xpath("//*[@class=\"oxd-text oxd-text--h6 --strong\"]");


    public String createdInUserName(){
        presenceOfElement(newUserNameOnDashboard);
        return getElement(newUserNameOnDashboard).getText();
    }
}
