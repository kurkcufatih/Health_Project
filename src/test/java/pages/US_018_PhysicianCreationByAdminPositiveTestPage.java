package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_018_PhysicianCreationByAdminPositiveTestPage {
    public US_018_PhysicianCreationByAdminPositiveTestPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemAndTitle;

    @FindBy(xpath = "(//*[text()='Physician'])[1]")
    public WebElement physician;
    @FindBy(xpath = "(//*[@class='btn btn-link btn-sm'])[1]")
    public WebElement firstPhysician;

    @FindBy(xpath = "//*[text()='Create a new Physician']")
    public WebElement createNewPhysician;

    @FindBy(xpath = "//*[@id='useSSNSearch']")
    public WebElement useSearch;

    @FindBy(xpath = "//*[@id='searchSSN']")
    public WebElement SSNnumber;

    @FindBy(xpath = "//*[text()='Search User']")
    public WebElement searchUserButton;

    @FindBy(xpath = "//*[@href='/physician/2051/edit?page=1&sort=id,asc']")
    public WebElement editButton;

    @FindBy(xpath = "//*[@id='physician-firstName']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='physician-lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='physician1-birthDate']")
    public WebElement birthday;

    @FindBy(xpath = "//*[@id='physician-phone']")
    public WebElement phone;

    @FindBy(xpath = "//*[@id='physician-adress']")
    public WebElement address;

    @FindBy(xpath = "//*[@id='physician-gender']")
    public WebElement gender;

    @FindBy(xpath = "//*[@id='physician-speciality']")
    public WebElement speciality;

    @FindBy(xpath = "//*[@id='physician-bloodGroup']")
    public WebElement bloodGroup;

    @FindBy(xpath = "//*[@id='physician-description']")
    public WebElement description;

    @FindBy(xpath = "//*[@id='file_image']")
    public WebElement image;

    @FindBy(xpath = "//*[@id='physician-examFee']")
    public WebElement examFee;

    @FindBy(xpath = "//*[@id='physician-user']")
    public WebElement physicianUser;

    @FindBy(xpath = "//*[@id='physician-country']")
    public WebElement country;

    @FindBy(xpath = "//*[@id='physician-cstate']")
    public WebElement state;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[1]")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[text()='Confirm delete operation']")
    public WebElement deleteConfirm;

}