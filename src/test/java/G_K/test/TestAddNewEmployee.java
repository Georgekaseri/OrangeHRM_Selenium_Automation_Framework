package G_K.test;

import G_K.Pages.PageObjectModel.AddNewEmployee_POM;
import G_K.Pages.PageObjectModel.DashboardPage_POM;
import G_K.Pages.PageObjectModel.Employee_DashboardPage_POM;
import G_K.Pages.PageObjectModel.LoginPage_POM;
import G_K.Utils.PropertyReader;
import G_K.baseTest.CommonToAllTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddNewEmployee extends CommonToAllTest {

    @Test(groups = {"reg"})
    public void testAddNewEmployee(){
        LoginPage_POM l1 = new LoginPage_POM();
        l1.openVWOLoginURL();
        l1.loginToVWOValidCreds();


        AddNewEmployee_POM c1 = new AddNewEmployee_POM();
        c1.addNewEmployeeValidCrest();
        Employee_DashboardPage_POM employeeDashboardPagePom = c1.newEmployeeCrasted();
        String newEmployee = employeeDashboardPagePom.createdInUserName();
//        Assert.assertEquals(newEmployee, PropertyReader.readyKey("expected"));



    }

}
