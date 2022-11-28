package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.NhtPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_013_014_015StepD {
    NhtPage nht = new NhtPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Faker faker = new Faker();
    @Given("siteye gider")
    public void siteye_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("Account menuye tiklar")
    public void accountMenuyeTiklar() {
        nht.AccountMenu.click();
    }
    @When("sign in'e tiklar")
    public void sign_in_e_tiklar() {
        nht.SignInButton.click();

    }
    @Then("username tiklar")
    public void username_tiklar() {
        nht.UserName.click();
    }
    @Then("giris bilgilerini {string} girer")
    public void giris_bilgilerini_girer(String username) {
        nht.UserName.sendKeys(username);
    }
    @Then("Password {string} girer")
    public void password_girer(String password) {
        nht.Password.sendKeys(password);

    }
    @Then("Sign in'e tiklarayak siteye giris yapar")
    public void sign_in_e_tiklarayak_siteye_giris_yapar() {

        nht.SignInGirisButton.click();
    }
    @Then("MY PAGES'e tiklar")
    public void my_pages_e_tiklar() {
        nht.MyPagesButtonu.click();

    }
    @Then("My Appointments'e tiklar")
    public void my_appointments_e_tiklar() {
        nht.MyAppointmentsButton.click();

    }
    @Then("Acilan Sayfada Randevu Alan Hastanın Bilgisinin Oldugu Yerdeki Edit'e tiklar")
    public void acilan_sayfada_randevu_alan_hastanın_bilgisinin_oldugu_yerdeki_edit_e_tiklar() {
        nht.EditButton.click();
    }
    @Then("Acilan Sayfada Show Test Results e tiklar")
    public void acilan_sayfada_show_test_results_e_tiklar() throws InterruptedException {
        Thread.sleep(1500);
        actions.moveToElement(nht.ShowTestButton).perform();
        nht.ShowTestButton.click();

    }
    @And("Doctor Acilan Sayfada View Results'a tiklar")
    public void doctorAcilanSayfadaViewResultsATiklar() throws InterruptedException {
        Thread.sleep(1500);
        actions.moveToElement(nht.ViewResultsButton).perform();
        nht.ViewResultsButton.click();
    }

    @And("Acilan Sayfada Secilen Test Turlerin gorur")
    public void acilanSayfadaSecilenTestTurlerinGorur() {
        nht.TestGorunurlugu.isDisplayed();

    }

    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("MYPAGES'e tiklar")
    public void mypagesETiklar() {
        nht.MyPagesButtonu.click();

    }

    @And("MyAppointments'e tiklar")
    public void myappointmentsETiklar() {
        nht.MyAppointmentsButton.click();

    }

    @And("Acilan Sayfada Randevu Alan Hastanin Bilgisinin Oldugu Yerdeki Edit'e tiklar")
    public void acilanSayfadaRandevuAlanHastaninBilgisininOlduguYerdekiEditETiklar() {
        nht.EditButton.click();

    }

    @And("Request Inpatient'e tiklar")
    public void requestInpatientETiklar() {
        nht.RequestInpatientButton.click();
    }

    @And("Yatis islemini tamamlar")
    public void yatisIsleminiTamamlar() {

    }

    @And("MyInpatients'e tiklar")
    public void myınpatientsETiklar() {
        nht.MyInpatientsButton.click();
    }

    @And("Acilan sayfada hastanın bilgilerini gorur")
    public void acilanSayfadaHastanınBilgileriniGorur() {
        nht.HastaBilgileri.click();
    }

    @And("Acilan sayfada hastayı bulur Edit'e tiklar")
    public void acilanSayfadaHastayıBulurEditETiklar() {
       // js.executeScript("arguments[0],click()",nht.HastaEditButton);
        nht.HastaEditButton.click();
    }

    @And("Status' e tiklar")
    public void statusETiklar() {
        ReusableMethods.jsclick(nht.StatusButton);
        nht.StatusButton.sendKeys("STAYING");

    }

    @And("Hastanın durumunu güncelleyemiyor")
    public void hastanınDurumunuGüncelleyemiyor() {
        ReusableMethods.jsclick(nht.SaveButton);

    }

    @And("oda buttonuna tiklar")
    public void odaButtonunaTiklar() {
        ReusableMethods.jsclick(nht.RoomButton);
        nht.RoomButton.sendKeys("544");
    }

    @And("odanin durumunu güncelleye biliyor")
    public void odaninDurumunuGüncelleyeBiliyor() {
       // ReusableMethods.jsclick(nht.SaveButton);
       // nht.SaveButton.click();
    }

    @And("Acilan sayfada Items&Titles'e tiklar")
    public void acilanSayfadaItemsTitlesETiklar() {
        nht.ItemsButton.click();
    }

    @And("Patient'e Tiklar")
    public void patientETiklar() {
        nht.PatientButton.click();
    }

    @And("Acilan sayfada Create a new Patient\\(Yeni Hasta olustur) buttonun gorur")
    public void acilanSayfadaCreateANewPatientYeniHastaOlusturButtonunGorur() {
        nht.CreateButton.isDisplayed();
    }

    @And("Acilan sayfada Create a new Patient\\(Yeni Hasta olustur) buttonun tiklar")
    public void acilanSayfadaCreateANewPatientYeniHastaOlusturButtonunTiklar() {
        nht.CreateButton.click();
    }

    @And("Acilan sayfada bilgileri gorur")
    public void acilanSayfadaBilgileriGorur() {
        nht.HastaBilgileri.isDisplayed();
    }

    @And("Birt Date {string} girer")
    public void birtDateGirer(String tarih) {
        nht.BirthDate.sendKeys(tarih);
    }

    @And("Phone {string} girer")
    public void phoneGirer(String phone) {
        nht.Phone.sendKeys(phone);
    }

    @And("Cinsiyet {string} girer")
    public void cinsiyetGirer(String cinsiyet) {
        nht.Gender.sendKeys(cinsiyet);
    }

    @And("Kan grubu {string} girer")
    public void kanGrubuGirer(String kan) {
        nht.KanGrubu.sendKeys(kan);
    }

    @And("Adress {string} girer")
    public void adressGirer(String adress) {
        nht.Adress.sendKeys(adress);
    }

    @And("Description {string} girer")
    public void descriptionGirer(String tanim) {
        nht.Description.sendKeys(tanim);
    }

    @And("User {string} girer")
    public void userGirer(String user) {
        nht.User.sendKeys(user);
    }

    @And("Country {string} girer")
    public void countryGirer(String ulke) {
        nht.Country.sendKeys(ulke);
    }

    @And("Save buttonuna tiklar")
    public void saveButtonunaTiklar() {
        js.executeScript("arguments[0].click();",nht.SaveYeniHastaButtonu);
       // nht.SaveYeniHastaButtonu.click();
    }

    @And("Apointment'e Tiklar")
    public void apointmentETiklar() {
    }

    @And("Acilan sayfada Create a new Appointment'e\\(Yeni Hasta olustur) buttonun tiklar")
    public void acilanSayfadaCreateANewAppointmentEYeniHastaOlusturButtonunTiklar() {

        nht.ApointmentsButton.click();
    }

    @And("Sayfada Hastaya doktor atama kısmı yoktur")
    public void sayfadaHastayaDoktorAtamaKısmıYoktur() {

        nht.DoktorAtamaButtonu.isDisplayed();
    }

    @And("Country buttonuna tiklar")
    public void countryButtonunaTiklar() {

        nht.CountryButton.click();
    }

    @And("Acilan sayfada Create a new Country\\(Yeni Ulke Olustur) buttonun tiklar")
    public void acilanSayfadaCreateANewCountryYeniUlkeOlusturButtonunTiklar() {
        nht.CountryNewButton.click();
    }
    @And("Country'e {string} secer")
    public void countryESecer(String country) {

        nht.NameUlke.sendKeys(country);
    }

    @And("Kaydet buttonuna tiklar")
    public void kaydetButtonunaTiklar() {
        nht.SaveUlke.click();
    }

    @And("Items&Titles'e tiklar")
    public void ıtemsTitlesETiklar() {
        nht.ItemsButton.click();
    }

    @And("State\\/City'i buttonuna tiklar")
    public void stateCityIButtonunaTiklar() {
        nht.StateButton.click();
    }

    @And("Acilan sayfada Create a new State\\(Yeni Sehir Olustur) buttonun tiklar")
    public void acilanSayfadaCreateANewStateYeniSehirOlusturButtonunTiklar() {
        nht.StateNewButton.click();
    }

    @Given("State\\/City kısmına {string} girer")
    public void state_city_kısmına_girer(String sehir) {
        nht.NameCity.sendKeys(sehir);
    }


    @And("hasta bilgilerinin yazılı oldugu kısımda Delete tiklar ve hastayı siler")
    public void hastaBilgilerininYazılıOlduguKısımdaDeleteTiklarVeHastayıSiler() {
        nht.SilmeButtonu.isDisplayed();
    }


    @And("Firstname  girer")
    public void firstnameGirer() {
        nht.FirstName.click();
        actions.sendKeys(faker.name().firstName()).perform();
    }
    @Then("Lastname  girer")
    public void lastname_girer() {
        nht.LastName.click();
        actions.sendKeys(faker.name().lastName()).perform();
    }

    @Then("Email  girer")
    public void email_girer() {
        nht.Email.click();
        actions.sendKeys(faker.internet().emailAddress()).perform();
    }
    @And("Baslangic Tarihini {string} girer")
    public void baslangicTarihiniGirer(String baslangic) {
        nht.BaslangicTarihi.sendKeys(baslangic);
    }

    @And("Bitis Tarihini {string} girer")
    public void bitisTarihiniGirer(String bitis) {
        nht.BitisTarihi.sendKeys(bitis);
    }

    @And("{string} secer")
    public void secer(String odaIsmi) {
        nht.OdaSecim.click();
        nht.OdaSecim.sendKeys(odaIsmi);
    }
}
