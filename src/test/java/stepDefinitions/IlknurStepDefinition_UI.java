package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.IlknurPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IlknurStepDefinition_UI {
    IlknurPage ilknurPage = new IlknurPage();
    LocalDate date = LocalDate.now();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("ilknur Hasta {string} anasayfasinda")
    public void ilknurkullanici_anasayfasinda(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @When("ilknur hasta sayfadaki insan figurune tiklar")
    public void ilknurhastaSayfadakiInsanFiguruneTiklar() {
        ilknurPage.signinBasligi.click();
    }

    @And("ilknur signin butonuna basar")
    public void ilknursigninButonunaBasar() {
        ilknurPage.signin1.click();
    }

    @And("ilknur username girer")
    public void ilknurgirer() {
        ilknurPage.userNameBox.sendKeys(ConfigReader.getProperty("userName"));
        ReusableMethods.waitFor(2);
    }

    @And("ilknur password password girer.")
    public void ilknurpasswordGirer() {
        ilknurPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(2);
    }


    @And("ilknur sayfaya girmek icin signin e basar")
    public void ilknursayfayaGirmekIcinSigninEBasar() {
        ilknurPage.signin2.click();
    }

    @And("ilknur Mypages basligina tiklar")
    public void ilknurmypagesBasliginaTiklar() {
        ilknurPage.mypagesPatient.click();
    }

    @And("ilknur Make an appointment basligina tiklar")
    public void ilknurmakeAnAppointmentBasliginaTiklar() {
        ilknurPage.makeanAppointment.click();
    }


    @And("ilknur Telefon numarasi girer")
    public void ilknurtelefonNumarasiGirer() {
        ilknurPage.telNumberBox.sendKeys(ConfigReader.getProperty("hastaTelNo"));
    }

    @And("ilknur Randevu tarihini {string} {string} {string} olarak belirler")
    public void ilknurrandevuTarihiniOlarakBelirler(String gun, String ay, String yil) {
        actions.click(ilknurPage.dateBox).sendKeys(ay).
                sendKeys(Keys.TAB).sendKeys(gun)
                .sendKeys(Keys.TAB).sendKeys(yil).build().perform();


    }


    @And("ilknur Send an appointment butonuna tiklar")
    public void ilknursendAnAppointmentButonunaTiklar() {
        ilknurPage.senAnAppointment.click();
    }

    @Then("ilknur Olusturuldugunu dogrular")
    public void ilknurolusturuldugunuDogrular() {

        ReusableMethods.waitForVisibility(ilknurPage.randevuOlustuYazisi, 10);
        Assert.assertTrue(ilknurPage.randevuOlustuYazisi.isDisplayed());
    }

    @And("ilknur Sayfayi kapatir")
    public void ilknursayfayiKapatir() {
        Driver.closeDriver();
    }


    @And("ilknur Gelecek tarihli bir randevu olusturur")
    public void ilknurgelecekTarihliBirRandevuOlusturur() {
        ilknurPage.dateBox.sendKeys("01012030");

    }


    @And("ilknur Kullanici guncel tarihi GunAyYil olarak girer")
    public void ilknurkullaniciGuncelTarihiGunAyYilOlarakGirer() {
        ilknurPage.dateBox.sendKeys(Keys.ENTER);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String text = (String) js.executeScript("return document.getElementById('appoDate').value");
        System.out.println(text);
    }

    @And("ilknur Kullanici gecmis tarih girerek randevu almaya calisir")
    public void ilknurkullaniciGecmisTarihGirerekRandevuAlmayaCalisir() {

        ilknurPage.dateBox.sendKeys("01012021");
        ReusableMethods.waitFor(2);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String text = (String) js.executeScript("return document.getElementById('appoDate').value");
        System.out.println(text);

    }

    @And("ilknur Tarih kutusunu temizler")
    public void ilknurtarihKutusunuTemizler() {

        ReusableMethods.waitFor(2);
        ilknurPage.dateBox.clear();
        ReusableMethods.waitFor(2);
        ilknurPage.dateBox.sendKeys(Keys.ENTER);

    }

    @Then("ilknur olusturulamadi yazisinin ciktigini dogrular")
    public void ilknurolusturulamadiYazisininCiktiginiDogrular() {
        Assert.assertTrue(ilknurPage.internalServerError.isDisplayed());
    }

    @And("ilknur kullanici gecmis tarih uyarisini gorur")
    public void ilknurkullaniciGecmisTarihUyarisiniGorur() {
        Assert.assertTrue(ilknurPage.gecmisTarihUyarisi.isDisplayed());
    }

    @Then("ilknur Phone number is required.yazisinin gorundugunu dogrular")
    public void ilknurphoneNumberIsRequiredYazisininGorundugunuDogrular() {
        Assert.assertTrue(ilknurPage.telefonKutusuBos.isDisplayed());
        ReusableMethods.waitFor(2);
    }

    //US_008
    @And("ilknur Kullanici username ini iceren basliga tiklar")
    public void ilknurkullaniciUsernameIniIcerenBasligaTiklar() {
        ilknurPage.dropdownBox.click();
    }

    @Then("ilknur Kullanici password butonuna tiklar")
    public void ilknurkullaniciPasswordButonunaTiklar() {
        ilknurPage.passwordDuzenle.click();
    }

    @And("ilknur Kullanici eski sifresini {string} currentbox kismina girer")
    public void ilknurkullaniciEskiSifresiniCurrentboxKisminaGirer(String currentPassword) {
        ilknurPage.currentPasswordBox.sendKeys(currentPassword);
        ReusableMethods.waitFor(2);
    }

    @And("ilknur Kullanici yeni sifresini{string} newpasswordbox kismina girer")
    public void ilknurkullaniciYeniSifresiniNewpasswordboxKisminaGirer(String newPassword) {
        ilknurPage.newwPasswordBox.sendKeys(newPassword);
        ReusableMethods.waitFor(2);
    }

    @And("ilknur Kullanici yeni sifresini dogrulamak icin{string} New password confirmationbox kismina tekrar girer")
    public void ilknurkullaniciYeniSifresiniDogrulamakIcinNewPasswordConfirmationboxKisminaTekrarGirer(String confirmationPassword) {
        ilknurPage.confirmPassword.sendKeys(confirmationPassword);
        ReusableMethods.waitFor(2);
    }

    @And("ilknur Kullanici save button a tiklar")
    public void ilknurkullaniciSaveButtonATiklar() {
        ilknurPage.saveButonu.click();
        ReusableMethods.waitFor(2);
    }

    @Then("ilknur Kullanici basari ile olusturuldugunu dogrular")
    public void ilknurkullaniciBasariIleOlusturuldugunuDogrular() {
        String expectedResult = "Password changed!";
        String actualResult = ilknurPage.succesMessage.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("ilknur Kullanici newpassword boxunu temizler")
    public void ilknurkullaniciNewpasswordBoxunuTemizler() {
        ilknurPage.newwPasswordBox.clear();
    }

    @And("ilknur Kullanici yeni passwordunu{string} newwpassword box a girer")
    public void ilknurkullaniciYeniPasswordunuNewwpasswordBoxAGirer(String newpassword) {
        ilknurPage.newwPasswordBox.sendKeys(newpassword);
        ReusableMethods.waitFor(3);
    }

    @Then("ilknur Kullanici strengh barinin bir gucunde oldugunu dogrular")
    public void ilknurkullaniciStrenghBarininBirGucundeOldugunuDogrular() {
        Assert.assertTrue(ilknurPage.strenghtBar1.isDisplayed());
    }

    @And("ilknur Kullanici yeni bir karakter ekler {string}")
    public void ilknurkullaniciYeniBirKarakterEkler(String addcharacter) {
        ilknurPage.newwPasswordBox.sendKeys(addcharacter);
        ReusableMethods.waitFor(2);
    }

    @Then("ilknur Kullanici strengh barinin iki ye ciktigini dogrular")
    public void ilknurkullaniciStrenghBarininIkiYeCiktiginiDogrular() {
        Assert.assertTrue(ilknurPage.strenghtBar2.isDisplayed());
    }

    @Then("ilknur Kullanici strengh barinin iki gucunde oldugunu dogrular")
    public void ilknurkullaniciStrenghBarininIkiGucundeOldugunuDogrular() {
        Assert.assertTrue(ilknurPage.strenghtBar2.isDisplayed());
    }

    @Then("ilknur Kullanici strengh barinin dorde ye ciktigini dogrular")
    public void ilknurkullaniciStrenghBarininDordeYeCiktiginiDogrular() {
        Assert.assertTrue(ilknurPage.strenghtBar4.isDisplayed());
    }

    @Then("ilknur Kullanici strengh barinin bese ye ciktigini dogrular")
    public void ilknurkullaniciStrenghBarininBeseYeCiktiginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(ilknurPage.strenghtBar5.isDisplayed());
    }

    @When("ilknur Kullanici current password boxunu temizler")
    public void ilknurkullaniciCurrentPasswordBoxunuTemizler() {
        ilknurPage.currentPasswordBox.clear();
    }

    @And("ilknur Kullanici confirmation password box unu temizler")
    public void ilknurkullaniciConfirmationPasswordBoxUnuTemizler() {
        ilknurPage.confirmPassword.clear();
    }

    // US_009

    @Given("ilknur Personel {string} anasayfasina gider")
    public void ilknurpersonelAnasayfasinaGider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("ilknur Sayfadaki insan figurune tiklar")
    public void ilknursayfadakiInsanFiguruneTiklar() {
        ilknurPage.signinBasligi.click();
    }

    @And("ilknur Personel sign in butonuna tiklar")
    public void ilknurpersonelSignInButonunaTiklar() {
        ilknurPage.signin1.click();
    }

    @And("ilknur Gecerli password ve username girer")
    public void ilknurgecerliPasswordVeUsernameGirer() {
        ilknurPage.userNameBox.sendKeys(ConfigReader.getProperty("personelUsername"));
        ReusableMethods.waitFor(2);
        ilknurPage.passwordBox.sendKeys(ConfigReader.getProperty("personelPassword"));
        ReusableMethods.waitFor(2);

    }

    @And("ilknur Personel sayfaya giris yapamak icin sign in butonuna tiklar")
    public void ilknurpersonelSayfayaGirisYapamakIcinSignInButonunaTiklar() {
        ilknurPage.signin2.click();
    }

    @And("ilknur My pages basligina tiklar")
    public void ilknurmyPagesBasliginaTiklar() {
        ilknurPage.mapagesPersonel.click();

    }

    @And("ilknur in search basligina tiklar")
    public void ilknurinSearchBasliginaTiklar() {
        ilknurPage.searchPatientButonu.click();
    }

    @And("ilknur Hasta ssn i ile arama yapar")
    public void ilknurhastaSsnIIleAramaYapar() {
        ilknurPage.hataSSN.click();
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("1");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("0");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("1");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("-");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("2");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("3");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("-");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("0");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("9");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("6");
        ReusableMethods.waitFor(1);
        ilknurPage.hataSSN.sendKeys("0");
        ReusableMethods.waitFor(1);
    }

    @And("ilknur edit butonuna tiklar")
    public void ilknureditButonunaTiklar() {
        ilknurPage.editButton.click();
    }

    @Then("ilknur Acilan sayfada hasta bilgilerini gordugunu dogrular")
    public void ilknuracilanSayfadaHastaBilgileriniGordugunuDogrular() {

        List<String> hastaBilgileri = new ArrayList<>();
        for (WebElement w : ilknurPage.hastabilgileriPersonel) {
            hastaBilgileri.add(w.getAttribute("value"));
            Assert.assertTrue(w.isDisplayed());

        }
        String id= ilknurPage.idGorunuyormu.getAttribute("value");
        System.out.println(id);



        Assert.assertTrue(ilknurPage.ssnGorunuyormu.isDisplayed());
        Assert.assertTrue(ilknurPage.firstnamaGorunuyormu.isDisplayed());
        Assert.assertTrue(ilknurPage.lastnameGorunuyormu.isDisplayed());
        Assert.assertTrue(ilknurPage.birthdateGorunuyormu.isDisplayed());
        Assert.assertTrue(ilknurPage.emailGorunuyormu.isDisplayed());
        Assert.assertTrue(ilknurPage.genderGorunuyormu.isDisplayed());
        Assert.assertTrue(ilknurPage.bloodgroupGorunuyormu.isDisplayed());


    }

    @Then("ilknur Hasta bilgilerini degistirebildigini dogrular")
    public void ilknurhastaBilgileriniDegistirebildiginiDogrular() {
        ilknurPage.firstnameBox.clear();
        ilknurPage.firstnameBox.sendKeys("ABCD");
        String expectedFirstName = "ABCD";
        String actualFirstname = ilknurPage.firstnameBox.getAttribute("value");
        System.out.println(actualFirstname);
        Assert.assertEquals(expectedFirstName, actualFirstname);


        ilknurPage.lastnameBox.clear();
        ilknurPage.lastnameBox.sendKeys("abcd");
        ReusableMethods.waitFor(2);
        String expectedLastName = "abcd";
        String actualLastname = ilknurPage.lastnameBox.getAttribute("value");
        Assert.assertEquals(expectedLastName, actualLastname);
        ReusableMethods.waitFor(2);

        ((JavascriptExecutor) Driver.getDriver()).executeScript("javascript:window.scrollBy(0,800)");
        ilknurPage.emailBox.clear();
        ilknurPage.emailBox.sendKeys("abcd@gmail.com");
        ReusableMethods.waitFor(2);
        String expectedEmail = "abcd@gmail.com";
        String actualEmail = ilknurPage.emailBox.getAttribute("value");
        Assert.assertEquals(expectedEmail, actualEmail);

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ilknurPage.telnoBox.clear();
        ilknurPage.telnoBox.sendKeys("0000000000");
        ReusableMethods.waitFor(2);
        String expectedTelno = "0000000000";
        String actualTelno = ilknurPage.telnoBox.getAttribute("value");
        Assert.assertEquals(expectedTelno, actualTelno);

        Select select = new Select(ilknurPage.genderBox);
        select.selectByVisibleText("MALE");
        ReusableMethods.waitFor(2);
        String expectedGender = "MALE";
        String actualGender = ilknurPage.genderBox.getAttribute("value");
        Assert.assertEquals(expectedGender, actualGender);
    }

    @Then("ilknur Create or edit sayfasina geldigini dogrular")
    public void ilknurcreateOrEditSayfasinaGeldiginiDogrular() {
        Assert.assertTrue(ilknurPage.createoreditpage.isDisplayed());
    }

    @Then("ilknur Acilan sayfada hastanin bulundugunu dogrular")
    public void ilknuracilanSayfadaHastaninBulundugunuDogrular() {
        String expectedSSN = "101-23-0960";
        String actualSsn = ilknurPage.ssnGorunuyormu.getText();
        System.out.println(actualSsn);
        Assert.assertEquals(expectedSSN, actualSsn);
    }

    @Then("ilknur Hastanin tum bilgileri doldurdugunu test eder")
    public void ilknurhastaninTumBilgileriDoldurdugunuTestEder() {

        ilknurPage.idBox.click();
        ReusableMethods.waitFor(2);
        String expectedid = "302419";
        String actualId = ilknurPage.idBox.getAttribute("value");
        System.out.println(actualId.isEmpty());
        Assert.assertEquals(expectedid,actualId);


        String expectedFirstName = "Hasta";
        String actualFirstname = ilknurPage.firstnameBox.getAttribute("value");
        Assert.assertEquals(expectedFirstName,actualFirstname);
        System.out.println(actualFirstname.isEmpty());

        String expectedLastname = "Ilknur";
        String actualLastname = ilknurPage.lastnameBox.getAttribute("value");
        Assert.assertEquals(expectedLastname, actualLastname);
        System.out.println(actualLastname.isEmpty());


        String expectedemail = "hastailknur@gmail.com";
        String actualEmail = ilknurPage.emailBox.getAttribute("value");
        Assert.assertEquals(expectedemail,actualEmail);
        System.out.println(actualEmail.isEmpty());


        String expectedtelNo = "0555777888";
        String actualTelno = ilknurPage.telnoBox.getAttribute("value");
        Assert.assertEquals(expectedtelNo,actualTelno);
        System.out.println(actualTelno.isEmpty());

    }

    @And("ilknur Firstname siler")
    public void ilknurfirstnameSiler() {
        ilknurPage.firstnameBox.clear();
        ilknurPage.firstnameBox.sendKeys(Keys.ENTER);
    }

    @Then("ilknur This field is required yazisinin gorundugunu dogrular")
    public void ilknurthisFieldIsRequiredYazisininGorundugunuDogrular() {
        Assert.assertTrue(ilknurPage.firstnameUyariYazisi.isDisplayed());
    }

    @And("ilknur Lastname siler")
    public void ilknurlastnameSiler() {
        ilknurPage.lastnameBox.clear();
        ilknurPage.lastnameBox.sendKeys(Keys.ENTER);
    }

    @Then("ilknur This field is required.yazisinin gotundugunu dogrular")
    public void ilknurthisFieldIsRequiredYazisininGotundugunuDogrular() {
        Assert.assertTrue(ilknurPage.lastnameUyariYazisi.isDisplayed());

    }

    @And("ilknur email i siler")
    public void ilknuremailISiler() {
        ilknurPage.emailBox.clear();
        ilknurPage.emailBox.sendKeys(Keys.ENTER);
    }

    @Then("ilknur Your email is required.yazisinin gorundugunu dogrular")
    public void ilknuryourEmailIsRequiredYazisininGorundugunuDogrular() {
        Assert.assertTrue(ilknurPage.emailUyariYazisi.isDisplayed());
    }

    @And("ilknur tel no yu siler")
    public void ilknurtelNoYuSiler() {
        ilknurPage.telnoBox.clear();
        ilknurPage.telnoBox.sendKeys(Keys.ENTER);

    }

    @And("ilknur in patient basligina tiklar")
    public void ilknurinPatientBasliginaTiklar() {
        ilknurPage.inpatientButonu.click();
    }

    @Then("ilknur Acilan sayfada  edit view ve showappointments butonlarinin oldugunu dogrular")
    public void ilknuracilanSayfadaEditViewVeShowappointmentsButonlarininOldugunuDogrular() {
        Assert.assertTrue(ilknurPage.editButton.isDisplayed());
        Assert.assertTrue(ilknurPage.viewButton.isDisplayed());
        Assert.assertTrue(ilknurPage.showAppointments.isDisplayed());

    }


    @Given("ilknur Admin {string} anasayfasina gider")
    public void ilknuradminAnasayfasinaGider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("ilknur Sign in basligina tiklar")
    public void ilknursignInBasliginaTiklar() {
        ilknurPage.signin1.click();
    }

    @And("ilknur Gecerli bir username ve password girer")
    public void ilknurgecerliBirUsernameVePasswordGirer() {
        ilknurPage.userNameBox.sendKeys(ConfigReader.getProperty("adminUsername"));
        ReusableMethods.waitFor(2);
        ilknurPage.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        ReusableMethods.waitFor(2);
    }

    @And("ilknur Admin olarak sign in olur")
    public void ilknuradminOlarakSignInOlur() {
        ilknurPage.signin2.click();
    }

    @And("ilknur items and title basligina tiklar")
    public void ilknuritemsAndTitleBasliginaTiklar() {
        ilknurPage.itemsAndTitle.click();
        ReusableMethods.waitFor(2);
    }

    @And("ilknur patient basligini secer")
    public void ilknurpatientBasliginiSecer() {
        ilknurPage.patientAdmin.click();
        ReusableMethods.waitFor(2);
    }

    @Then("ilknur Acilan sayfada hasta bilgilerini gordugunu dogrular.")
    public void ilknuracilanSayfadaHastaBilgileriniDogrular() {
        ilknurPage.viewButonuAdmin.click();
      /*  List<String> hastaBilgileri = new ArrayList<>();
        for (WebElement w : medunnaPage.adminHastabilgileri) {
            hastaBilgileri.add(w.getText());
       Assert.assertTrue(w.isDisplayed());
        }
        hastaBilgileri.stream().forEach(t -> System.out.println(t));*/


    }

    @And("ilknur edit butonuna tiklar.")
    public void ilknureditButonaTiklar() {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("javascript:window.scrollBy(0,800)");
        ReusableMethods.waitForClickablility(ilknurPage.editbuttonAdmin, 3);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", ilknurPage.editbuttonAdmin);
        //medunnaPage.editbuttonAdmin.click();
    }

    @And("ilknur hasta bilgilerini silebildigini test eder")
    public void ilknurhastaBilgileriniSilebildiginiTestEder() {
        ilknurPage.firstnameboxAdmin.clear();
        ReusableMethods.waitFor(2);
        ilknurPage.firstnameboxAdmin.sendKeys(Keys.ENTER);
        Assert.assertTrue(ilknurPage.firstnameUyariYazisi.isDisplayed());
        ilknurPage.lastnameBoxAdmin.clear();
        ReusableMethods.waitFor(2);
        ilknurPage.lastnameBoxAdmin.sendKeys(Keys.ENTER);
        Assert.assertTrue(ilknurPage.lastnameUyariYazisi.isDisplayed());
        ilknurPage.emailboxAdmin.clear();
        ReusableMethods.waitFor(2);
        ilknurPage.emailboxAdmin.sendKeys(Keys.ENTER);
        Assert.assertTrue(ilknurPage.emailUyariYazisi.isDisplayed());
        ReusableMethods.waitFor(2);


    }

    @And("ilknur Hasta bilgilerini degistirebildigini test eder")
    public void ilknurhastaBilgileriniDegistirebildiginiTestEder() {
        ilknurPage.firstnameboxAdmin.clear();
        ilknurPage.firstnameboxAdmin.sendKeys("aaaa");
        String expectedFirstname="aaaa";
        String actualFirstname= ilknurPage.firstnameboxAdmin.getAttribute("value");
        Assert.assertEquals(expectedFirstname,actualFirstname);

        ilknurPage.lastnameBoxAdmin.clear();
        ilknurPage.lastnameBoxAdmin.sendKeys("bbbb");
        String expectedLname="aaaa";
        String actualLname= ilknurPage.firstnameboxAdmin.getAttribute("value");
        Assert.assertEquals(expectedLname,actualLname);




    }

    @And("ilknur Patients sayfasina geri doner")
    public void ilknurpatientsSayfasinaGeriDoner() {
        ReusableMethods.waitForClickablility(ilknurPage.back, 3);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("arguments[0].click();", ilknurPage.back);

    }

    @And("ilknur Delete butonun gorunurlugunu test eder")
    public void ilknurdeleteButonunGorunurlugunuTestEder() {
        Assert.assertTrue(ilknurPage.deleteButonu.isDisplayed());
    }

    @Then("ilknur Acilan sayfada Patient ssn Basliginin bulunmadigini dogrular")
    public void ilknuracilanSayfadaPatientSsnBasligininBulunmadiginiDogrular() {
        Assert.assertFalse(ilknurPage.adminPageTamami.getText().contains("Patient SSN"));
    }

    @And("ilknur delete butonunun olmadigini dogrular")
    public void ilknurdeleteButonununOlmadiginiDogrular() {
        Assert.assertFalse(ilknurPage.staffButonu.getText().contains("delete"));
    }
}
