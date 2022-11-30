package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US004_05_06 {

    public US004_05_06() {       //Constructor olusturup public yapmaniz gerekir
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "[class=\"dropdown nav-item\"]")
    public WebElement UserIcon;

    @FindBy(css = "[class=\"dropdown-item\"]")
    public WebElement SignIn;

    @FindBy(css = "[id=\"username\"]")
    public WebElement username;

    @FindBy(css = "[id=\"password\"]")
    public WebElement password;

    @FindBy(css = "[class=\"btn btn-primary\"]")
    public WebElement SignIn_2;

    @FindBy(css = "[id=\"account-menu\"]")
    public WebElement UserLoged;

    /*-------------------------TC01 negatif test-----------------------------------*/
    @FindBy(css = "[class=\"alert alert-danger fade show\"]")
    public WebElement wrongUsernameAndPassword;

    @FindBy(css = "[class=\"Toastify__toast-body\"]")
    public WebElement wrongUsernameAndPassword_Alert;


    /*-------------------------TC02 -----------------------------------*/
    @FindBy(xpath = "//span[text()='Remember me']")
    public WebElement rememberMe;
    /*-------------------------TC03 -----------------------------------*/
    @FindBy(linkText = "Did you forget your password?")
    public WebElement forgetPassword;
    /*-------------------------TC04 -----------------------------------*/
    @FindBy(linkText = "Register a new account")
    public WebElement RegisterAccount;
    /*-------------------------TC05 -----------------------------------*/
    @FindBy(xpath = "//*[@class=\"modal-footer\"]")
    public WebElement cancel;

    /*-----------------------------US005------------------------------*/
    /*-------------------------TC01 -----------------------------------*/
    @FindBy(css = "[class=\"appointment-btn scrollto\"]")
    public WebElement makeAppointment;

    @FindBy(css = "[class=\"btn btn-primary\"]")
    public WebElement sendAppointmentRequestButton;

    @FindBy(css = "[class=\"invalid-feedback\"]")
    public List<WebElement> required;

    @FindBy(css = "[name=\"firstName\"]")
    public WebElement newUserFirstname;
    @FindBy(css = "[name=\"ssn\"]")
    public WebElement ssn;

    @FindBy(css = "[class=\"invalid-feedback\"]")
    public WebElement InvalidSsn;

    @FindBy(css = "[name=\"lastName\"]")
    public WebElement newUserLastname;

    @FindBy(css = "[name=\"phone\"]")
    public WebElement phone;

    @FindBy(xpath = "//*[text()='Phone number is invalid']")
    public WebElement InvalidPhone;

    @FindBy(css = "[name=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//*[text()='This field is invalid']")
    public WebElement invalidEmail;

    @FindBy(css = "[class=\"Toastify__toast-body\"]")
    public WebElement randevuBasariliResponce;

    @FindBy(css = "[id=\"account-menu\"]")
    public WebElement accountMenu;

    @FindBy(css = "[value=\"Hasta\"]")
    public WebElement firstnameValue;

    @FindBy(css = "[value=\"Gurbuz\"]")
    public WebElement lastnameValue;

    @FindBy(css = "[value=\"hastagurbuz@gmail.com\"]")
    public WebElement emailValue;

    @FindBy(css = "[href=\"/account/settings\"]")
    public WebElement settingButton;

    @FindBy(css = "[class=\"btn btn-primary\"]")
    public WebElement saveButton;

    @FindBy(css = "[class=\"Toastify__toast Toastify__toast--success toastify-toast\"]")
    public WebElement savedYazisi;

    @FindBy(xpath = "//*[@id='settings-form']//input[@id=\"firstName\"]")
    public WebElement firstnameSetting;




}

