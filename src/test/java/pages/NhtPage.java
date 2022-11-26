package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NhtPage {
    public NhtPage(){ //Constructor oluşturup public yapmamız gerekir

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id='account-menu']")
    public WebElement AccountMenu;

    @FindBy(xpath = "//*[@id='login-item']")
    public WebElement SignInButton;

    @FindBy(xpath = "//*[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement AdamButton;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement UserName;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement Password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement SignInGirisButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement MyPagesButtonu;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-calendar-week fa-w-14 fa-fw ']")
    public WebElement MyAppointmentsButton;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[2]")
    public WebElement EditButton;

    @FindBy(xpath = "//*[text()='Request A Test']")
    public WebElement RequestButton;

    @FindBy(xpath = "//*[@class='btn btn-danger btn-sm']")
    public WebElement ShowTestButton;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[1]")
    public WebElement ViewResultsButton;

    @FindBy(xpath = "//*[@class='table-responsive']")
    public WebElement TestGorunurlugu;

    @FindBy(xpath = "//*[@id='1402']")
    public WebElement Urea;

    @FindBy(xpath = "//*[@id='74693']")
    public WebElement Sodium;

    @FindBy(xpath = "//*[@id='132791']")
    public WebElement Glucose;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement SaveButton;

    @FindBy(xpath = "//*[@class='btn btn-warning btn-sm']")
    public WebElement RequestInpatientButton;

    @FindBy(xpath = "//*[text()='My Inpatients']")
    public WebElement MyInpatientsButton;

    @FindBy(xpath = "//*[@class='jh-card card' ]")
    public WebElement BilgilerGorunur;

    @FindBy(xpath = "(//*[@class='d-none d-md-inline'])[2]")
    public WebElement HastaEditButton;

    @FindBy(xpath = "//*[@id='in-patient-status']")
    public WebElement StatusButton;

    @FindBy(xpath = "//*[@id='in-patient-room']")
    public WebElement RoomButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-th-list fa-w-16 ']")
    public WebElement ItemsButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user-injured fa-w-14 fa-fw ']")
    public WebElement PatientButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-plus fa-w-14 ']")
    public WebElement CreateButton;

    @FindBy(xpath = "//*[@class='col-md-8']")
    public WebElement TumBilgilerGorunur;

    @FindBy(xpath = "//*[@id='app-view-container']")
    public WebElement HastaBilgileri;

    @FindBy(xpath = "//*[@id='patient-firstName']")
    public WebElement FirstName;

    @FindBy(xpath = "//*[@id='patient-lastName']")
    public WebElement LastName;

    @FindBy(xpath = "//*[@id='patient-birthDate']")
    public WebElement BirthDate;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement Email;

    @FindBy(xpath = "//*[@id='patient-phone']")
    public WebElement Phone;

    @FindBy(xpath = "//*[@id='patient-gender']")
    public WebElement Gender;

    @FindBy(xpath = "//*[@id='patient-bloodGroup']")
    public WebElement KanGrubu;

    @FindBy(xpath = "//*[@id='patient-adress']")
    public WebElement Adress;

    @FindBy(xpath = "//*[@id='patient-description']")
    public WebElement Description;

    @FindBy(xpath = "//*[@id='patient-user']")
    public WebElement User;

    @FindBy(xpath = "//*[@id='patient-country']")
    public WebElement Country;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement SaveHastaButtonu;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement SaveYeniHastaButtonu;

    @FindBy(xpath = "//*[@class='view-routes']")
    public WebElement DoktorAtamaButtonu;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-calendar-day fa-w-14 fa-fw ']")
    public WebElement ApointmentsButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-flag fa-w-16 fa-fw ']")
    public WebElement CountryButton;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-city fa-w-20 fa-fw ']")
    public WebElement StateButton;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement CountryNewButton;

    @FindBy(xpath = "//*[@id='jh-create-entity']")
    public WebElement StateNewButton;

    @FindBy(xpath = "//*[@id='country-name']")
    public WebElement NameUlke;

    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement SaveUlke;

    @FindBy(xpath = "//*[@id='c-state-name']")
    public WebElement NameCity;

    @FindBy(xpath = "//*[@class='d-none d-md-inline']")
    public WebElement SilmeButtonu;

}
