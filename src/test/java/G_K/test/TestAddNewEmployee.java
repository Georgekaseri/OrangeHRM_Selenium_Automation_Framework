package G_K.test;

import G_K.Pages.PageObjectModel.DashboardPage_POM;
import G_K.Pages.PageObjectModel.LoginPage_POM;
import G_K.Utils.PropertyReader;
import G_K.baseTest.CommonToAllTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddNewEmployee extends CommonToAllTest {

    @Test(groups = {"reg"})
    public void testAddNewEmployee(){
        LoginPage_POM createNewEmployee = new LoginPage_POM();
        createNewEmployee.openVWOLoginURL();
        createNewEmployee.loginToVWOValidCreds();


    }

}
