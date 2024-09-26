package G_K.Pages.PageObjectModel;

import G_K.Utils.PropertyReader;
import G_K.base.CommonToAllPage;
import org.openqa.selenium.By;

public class AddNewEmployee_POM extends CommonToAllPage {

    public AddNewEmployee_POM(){

    }
    private By clickBtn = (By.xpath("//*[@class=\"oxd-main-menu\"]/li[2]"));
    private By addBtn = (By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
    private By firstName = (By.xpath("//*[@placeholder=\"First Name\"]"));
    private By middleName = (By.xpath("//*[@placeholder=\"Middle Name\"]"));
    private By lastName = (By.xpath("//*[@placeholder=\"Last Name\"]"));
    private By employeeID = (By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
    private By saveBtn = (By.xpath("//*[@type=\"submit\"]"));
    private By personalDash = (By.xpath("//*[@class=\"oxd-text oxd-text--h6 --strong\"]"));




    public String addNewEmployeeValidCrest() {
        presenceOfElement(clickBtn);
        clickElement(clickBtn);
        visibilityOfElement(addBtn);
        clickElement(addBtn);
        visibilityOfElement(firstName);
        enterInput(firstName, PropertyReader.readyKey("firstName"));
        enterInput(middleName, PropertyReader.readyKey("middleName"));
        enterInput(lastName, PropertyReader.readyKey("lastName"));
        enterInput(employeeID, PropertyReader.readyKey("employeeID"));
        clickElement(saveBtn);
        presenceOfElement(personalDash);
        visibilityOfElement(personalDash);
        return getElement(personalDash).getText();

    }
    public Employee_DashboardPage_POM newEmployeeCrasted(){

        return new Employee_DashboardPage_POM();
    }


}

