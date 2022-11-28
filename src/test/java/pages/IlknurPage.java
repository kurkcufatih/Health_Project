package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class IlknurPage {

    public IlknurPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-user fa-w-14 ']")
    public WebElement signinBasligi;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signin1;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]/span")
    public WebElement signin2;

    //US_007//
    @FindBy(xpath = "//*[text()='MY PAGES(PATIENT)']")
    public WebElement mypagesPatient;

    @FindBy(xpath = "//*[text()='Make an Appointment']")
    public WebElement makeanAppointment;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement telNumberBox;

    @FindBy(xpath = "//input[@id='appoDate']")
    public WebElement dateBox;


    @FindBy(xpath = "//*[text()='Send an Appointment Request']")
    public WebElement senAnAppointment;

    @FindBy(xpath = "//*[text()='Appointment registration saved!']")
    public WebElement randevuOlustuYazisi;

    @FindBy(xpath = "//[text()='Internal server error']")
    public WebElement internalServerError;

    @FindBy(xpath = "//*[text()='Appointment date can not be past date!']")
    public WebElement gecmisTarihUyarisi;

    @FindBy(xpath = "//*[text()='Phone number is required.']")
    public WebElement telefonKutusuBos;

    //US_008
    @FindBy(xpath = "//span[text()='hastaAbdNo2 lastname']")
    public WebElement dropdownBox;

    @FindBy(xpath = "//span[text()='Password']")
    public WebElement passwordDuzenle;

    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement currentPasswordBox;

    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement newwPasswordBox;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[text()='Save']")
    public WebElement saveButonu;

    @FindBy(xpath = "//*[contains (text(),'Password changed!')]")
    public WebElement succesMessage;

    @FindBy(xpath = "//*[@id='strengthBar']/li[1]")
    public WebElement strenghtBar1;

    @FindBy(xpath = "//*[@id='strengthBar']/li[2]")
    public WebElement strenghtBar2;

    @FindBy(xpath = "//*[@id='strengthBar']/li[3]")
    public WebElement strenghtBar3;

    @FindBy(xpath = "//*[@id='strengthBar']/li[4]")
    public WebElement strenghtBar4;

    @FindBy(xpath = "//*[@id='strengthBar']/li[5]")
    public WebElement strenghtBar5;


    //US_009

    @FindBy(xpath = "//span[text()='MY PAGES']")
    public WebElement mapagesPersonel;

    @FindBy(xpath = "//span[text()='In Patient']")
    public WebElement inpatientButonu;

    @FindBy(xpath = "//span[text()='Search Patient']")
    public WebElement searchPatientButonu;

    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement hataSSN;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editButton;

    @FindBy(xpath = "//input[@name='id']")
    public WebElement idBox;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstnameBox;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastnameBox;

    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birthdateBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement telnoBox;

    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderBox;

    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement kangrubuBox;

    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public WebElement idGorunuyormu;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public WebElement ssnGorunuyormu;

    @FindBy(xpath = "//tbody/tr/td[3]")
    public WebElement firstnamaGorunuyormu;

    @FindBy(xpath = "//tbody/tr/td[4]")
    public WebElement lastnameGorunuyormu;

    @FindBy(xpath = "//tbody/tr/td[5]")
    public WebElement birthdateGorunuyormu;

    @FindBy(xpath = "//tbody/tr/td[6]")
    public WebElement telnoGorunuyormu;

    @FindBy(xpath = "//tbody/tr/td[7]")
    public WebElement emailGorunuyormu;

    @FindBy(xpath = "//tbody/tr/td[8]")
    public WebElement genderGorunuyormu;

    @FindBy(xpath = "//tbody/tr/td[9]")
    public WebElement bloodgroupGorunuyormu;

   @FindBy(xpath = "//span[text()='Create or edit a Patient']")
    public WebElement createoreditpage;

   @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div[2]/div/form/div/div")
   public List<WebElement>hastabilgileriPersonel;

   @FindBy(xpath = "(//*[text()='This field is required.'])[1]")
    public WebElement firstnameUyariYazisi;

   @FindBy(xpath = "(//*[text()='This field is required.'])[2]")
    public WebElement lastnameUyariYazisi;

   @FindBy(xpath = "//*[text()='Your email is required.']")
    public WebElement emailUyariYazisi;

   @FindBy(xpath = "//*[text()='Edit']")
    public List<WebElement>editButtons;

   @FindBy(xpath = "//span[text()='View']")
    public WebElement viewButton;

   @FindBy(xpath = "//span[text()='Show Appointments']")
    public WebElement showAppointments;

   @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement itemsAndTitle;

   @FindBy(xpath = "//span[text()='Patient']")
    public WebElement patientAdmin;

   @FindBy(xpath = "//tbody/tr[1]/td[16]/div/a[1]/span/span")
    public WebElement viewButonuAdmin;

   @FindBy(xpath = "//h2")
    public WebElement patientSayfasi;

   @FindBy(xpath = "//span[text()='Edit']")
    public WebElement editbuttonAdmin;

   @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstnameboxAdmin;

   @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastnameBoxAdmin;

   @FindBy(xpath = "//input[@name='email']")
    public WebElement emailboxAdmin;

   @FindBy(xpath = "//span[text()='Back']")
    public WebElement back;

   @FindBy(xpath = "//dl/dd")
    public List<WebElement>adminHastabilgileri;

   @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[16]/div/a[3]/span/span")
    public WebElement deleteButonu;

   @FindBy(xpath = "//*[@id='app-view-container']/div/div/div/div[2]/div/table/tbody/tr/td[16]/div")
    public WebElement staffButonu;

   @FindBy(xpath = "//div[@id='app-view-container']")
    public WebElement adminPageTamami;



}
