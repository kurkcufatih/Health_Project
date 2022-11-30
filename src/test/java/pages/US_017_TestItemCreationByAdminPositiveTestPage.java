package pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_017_TestItemCreationByAdminPositiveTestPage {
    public US_017_TestItemCreationByAdminPositiveTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Admin clicks the Test Item button
    @FindBy(xpath = "(//*[text()='Test Item'])[1]")
    public WebElement testItemButton;

    //Admin clicks on Create a new test item button
    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement createNewTestItem;

    //Admin enters a name
    @FindBy(xpath = "//*[@id='c-test-item-name']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='c-test-item-description']")
    public WebElement description;

    //Admin can write Default Min. Value
    @FindBy(xpath = "//*[@id='c-test-item-defaultValMax']")
    public WebElement defaultMaxValue;

    //Admin can write Default Max. Value
    @FindBy(xpath = "//*[@id='c-test-item-defaultValMin']")
    public WebElement defaultMinValue;

    //Admin clicks the view button of any test item which is already created before, and can see test item.
    @FindBy(xpath = "//*[@class='btn btn-info btn-sm']")
    public WebElement viewButton;

    //Admin clicks Back button
    @FindBy(xpath = "//*[text()='Back']")
    public WebElement backButton;

    //Admin clicks Edit button of any test item which is already created before.
    @FindBy(xpath = "(//*[text()='Edit'])[1]")
    public WebElement editButton;

    @FindBy(css = "a[class=\"btn btn-primary\"]")
    public WebElement edit;

    @FindBy(xpath = "//*[@id='c-test-item-price']")
    public WebElement testPrice;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[@id='c-test-item-createdDate']")
    public WebElement date;

    @FindBy(xpath = "//*[@class='d-none d-md-inline']")
    public WebElement backbutton;

    @FindBy(xpath = "(//*[text()='Delete'])[1]")
    public WebElement deletebutton;

    @FindBy(xpath = "//*[text()='Confirm delete operation']")
    public WebElement confirmdelete;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement savebutton;
}