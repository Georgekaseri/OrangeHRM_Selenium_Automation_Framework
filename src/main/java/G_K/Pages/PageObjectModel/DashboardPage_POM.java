package G_K.Pages.PageObjectModel;

import G_K.base.CommonToAllPage;
import org.openqa.selenium.By;

public class DashboardPage_POM extends CommonToAllPage {

    public DashboardPage_POM(){

    }

    // Page Locators
    private By userNameOnDashboard = By.xpath("//*[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");


    public String loggedInUserName(){
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }
}
