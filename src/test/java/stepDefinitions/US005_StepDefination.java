package stepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.US004_05_06;
import utilities.ConfigReader;
import utilities.Driver;

public class US005_StepDefination {
    US004_05_06 page = new US004_05_06();
    Actions action = new Actions(Driver.getDriver());
    @And("GKullanici {string} linkine tiklar")
    public void gkullaniciLinkineTiklar(String arg0) {
        page.makeAppointment.click();
    }

    @And("GKullanici {string} bos birakarak {string} butonuna tiklar")
    public void gkullaniciBosBirakarakButonunaTiklar(String arg0, String arg1) {
        page.sendAppointmentRequestButton.click();
    }

    @And("GKullanici {string} uyarisini dogrular")
    public void gkullaniciUyarisiniDogrular(String arananKelime)  {
        for (int i = 0; i < page.required.size(); i++) {
            if (page.required.get(i).getText().equals(arananKelime)){
                Assert.assertTrue(page.required.get(i).isDisplayed());
                break;
                //Assert.assertTrue(page.required.get(i).getText().contains(arananKelime));
            }
        }
    }


    @And("GKullanici gecerli bir First Name numarasi girer")
    public void gkullaniciGecerliBirFirstNameNumarasiGirer() {
        page.newUserFirstname.sendKeys(ConfigReader.getProperty("GnewUserFirstname"));
    }

    @And("GKullanici gecerli bir SSN numarasi girer")
    public void gkullaniciGecerliBirSSNNumarasiGirer() {
        page.ssn.sendKeys(ConfigReader.getProperty("GnewSSN"));
    }

    @And("GKullanici Your SSN is invalid uyarisini dogrular")
    public void gkullaniciYourSSNIsInvalidUyarisiniDogrular() {
        page.ssn.sendKeys(ConfigReader.getProperty("GwrongSSN"));
        Assert.assertTrue(page.InvalidSsn.isDisplayed());
    }

    @And("GKullnici Last Name girer")
    public void gkullniciLastNameGirer() {
        page.newUserLastname.sendKeys(ConfigReader.getProperty("GnewUserLastname"));
    }

    @And("GKullnici Phone number girer")
    public void gkullniciPhoneNumberGirer() {
        page.phone.sendKeys(ConfigReader.getProperty("Gphone"));
    }

    @And("GKullnici gecersiz Phone number girer")
    public void gkullniciGecersizPhoneNumberGirer() {
        page.phone.sendKeys(ConfigReader.getProperty("Gwrongphone"));

    }

    @And("GKullanici Phone number is invalid uyarisini dogrular")
    public void gkullaniciPhoneNumberIsInvalidUyarisiniDogrular() {
        Assert.assertTrue(page.InvalidPhone.isDisplayed());
    }

    @And("GKullanici {string} butonuna tiklar")
    public void gkullaniciButonunaTiklar(String arg0) {
        page.sendAppointmentRequestButton.click();
    }

    @And("GKullanici gecerli bir {string} girer")
    public void gkullaniciGecerliBirGirer(String arg0) {
        page.email.sendKeys(ConfigReader.getProperty("Gnewemail"));
    }

    @And("GKullanici gecersiz bir {string} girer")
    public void gkullaniciGecersizBirGirer(String arg0) {
        page.email.sendKeys(ConfigReader.getProperty("Gwrongemail"));
    }

    @And("GKullanici {string} yazisini dogrular")
    public void gkullaniciYazisiniDogrular(String arg0) {
        Assert.assertTrue(page.invalidEmail.isDisplayed());
    }

    @And("GKullanici Appointment registration saved! yazisini dogrular")
    public void gkullaniciAppointmentRegistrationSavedYazisiniDogrular() {
        Assert.assertTrue(page.randevuBasariliResponce.isDisplayed());
    }

    @And("GKullanici Username yazili sekmeye tiklar")
    public void gkullaniciUsernameYaziliSekmeyeTiklar() {
        page.accountMenu.click();
    }

    @And("Kullanici first name dogrular")
    public void kullaniciFirstNameDogrular() {
        page.firstnameValue.isDisplayed();

    }

    @And("Kullanici last name dogrular")
    public void kullaniciLastNameDogrular() {
        page.lastnameValue.isDisplayed();
    }

    @And("Kullanici email dogrular")
    public void kullaniciEmailDogrular() {
        page.emailValue.isDisplayed();
    }

    @And("GKullanici Settings butonuna tiklar")
    public void gkullaniciSettingsButonunaTiklar() {
        page.settingButton.click();
    }

    @And("GKullanici firstname gunceller")
    public void gkullanicifirstnameGunceller(String arg0) {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(page.firstnameSetting).click(page.firstnameSetting).perform();
    //page.firstnameSetting.sendKeys("new");
    }

    @And("GKullanici save butonuna tiklar")
    public void gkullaniciSaveButonunaTiklar() {
        page.saveButton.click();
    }

    @And("Kullanici Settings saved! yazisin dogrular")
    public void kullaniciSettingsSavedYazisinDogrular() {
        page.savedYazisi.isDisplayed();
    }
}
