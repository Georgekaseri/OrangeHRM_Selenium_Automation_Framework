package G_K.baseTest;

import G_K.Drivers.DriverManager;
//import G_K.Drivers.DriverManagerTL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTest {
    // To call the Start the Webdriver
    // Down the WebDriver
    // Start Webdirver start


    // Start Webdirver start
    @BeforeMethod
    public void setUp(){
        DriverManager.init();
    }


    // Who will close the Webdriver
    @AfterMethod
    public void shutDown(){
        DriverManager.down();
    }
}
