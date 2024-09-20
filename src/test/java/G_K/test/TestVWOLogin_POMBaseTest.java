package G_K.test;

import G_K.Pages.PageObjectModel.DashboardPage_POM;
import G_K.Pages.PageObjectModel.LoginPage_POM;
import G_K.Utils.PropertyReader;
import G_K.baseTest.CommonToAllTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_POMBaseTest  extends CommonToAllTest {
    @Test(groups = {"smoke"}, priority = 1)
    public void testLoginNegative()  {

        LoginPage_POM loginPagePom = new LoginPage_POM();
        loginPagePom.openVWOLoginURL();
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds();

        // Test NG
        Assert.assertEquals(error_msg_text,PropertyReader.readyKey("error_message"));

        // Assert J
        Assertions.assertThat(error_msg_text )
                .isNotNull()
                .isNotBlank()
                .contains(PropertyReader.readyKey("error_message"));

    }

    @Test(priority = 2)
    public void testLoginPositive(){
        LoginPage_POM loginTestPositive = new LoginPage_POM();
        loginTestPositive.openVWOLoginURL();
        loginTestPositive.loginToVWOValidCreds();
        loginTestPositive.afterLoginVWOValidCreds();

        DashboardPage_POM dashboardPagePom = loginTestPositive.afterLoginVWOValidCreds();
        String expected_username = dashboardPagePom.loggedInUserName();

        // Assert NG
        Assert.assertEquals(expected_username, PropertyReader.readyKey("Actual_userName"));





    }

}
