package G_K.test;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin {
    @Test
    public void testLoginNegative() {




        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println("This is Title of the Page  : "  + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");


        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("georgekaseri22@gmail.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("Hyderabad85");

        WebElement signInButton = driver.findElement(By.id("js-login-btn"));
        signInButton.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement error_Message = driver.findElement(By.className("notification-box-description"));
        String error_msg_text = error_Message.getText();
        String error_msg_attribute = error_Message.getAttribute("data-qa");
        System.out.println(error_msg_attribute);


        Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");



        driver.quit();
    }
}
