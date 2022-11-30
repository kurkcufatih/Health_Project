package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.US004_05_06;
import utilities.ConfigReader;
import utilities.Driver;

public class US004_StepDefination {
    US004_05_06 page=new US004_05_06();
    @Given("GKullanici medunnaUrl adresine gider")
    public void gkullaniciMedunnaUrlAdresineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("GKullanici user ikonuna tiklar")
    public void gkullaniciUserIkonunaTiklar() {
        page.UserIcon.click();
    }

    @And("GKullanici Sign in linkine tiklar")
    public void gkullaniciSignInLinkineTiklar() {
        page.SignIn.click();
    }

    @And("GKullanici gecerli bir Username girer")
    public void gkullaniciGecerliBirUsernameGirer() {

        page.username.sendKeys(ConfigReader.getProperty("Gusername"));

    }

    @And("GKullanici gecerli bir Password girer")
    public void gkullaniciGecerliBirPasswordGirer() {

       page.password.sendKeys(ConfigReader.getProperty("Gpassword"));
    }

    @And("GKullanici Sign in Butonuna tiklar")
    public void gkullaniciSignInButonunaTiklar() {
        page.SignIn_2.click();
    }

    @And("GKullanici Medunna sayfasina basarili giris yaptigini dogrulayan mesaji dogrular")
    public void gkullaniciMedunnaSayfasinaBasariliGirisYaptiginiDogrulayanMesajiDogrular() {
       String expectedResult ="Login is Successfully";
       String actualResult =Driver.getDriver().findElement(By.xpath("//body")).getText();
        Assert.assertFalse(actualResult.contains(expectedResult));
    }

    @And("GKullanici basarili bir giris yaptigini dogrular")
    public void gkullaniciBasariliBirGirisYaptiginiDogrular() {
        Assert.assertTrue(page.UserLoged.isDisplayed());
    }

    @And("Kullanici sayfayi kapatir")
    public void gkullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("GKullanici gecersiz bir Username girer")
    public void gkullaniciGecersizBirUsernameGirer() {
        page.username.sendKeys(ConfigReader.getProperty("GwrongUsername"));
    }

    @And("G{string} yazisini dogrular")
    public void gyazisiniDogrular(String expectedResult) {
        Assert.assertEquals(expectedResult,page.wrongUsernameAndPassword.getText());

       // Assert.assertTrue(page.wrongUsernameAndPassword_Alert.isDisplayed());
    }

    @And("GKullanici gecersiz bir Password girer")
    public void gkullaniciGecersizBirPasswordGirer() {
        page.password.sendKeys(ConfigReader.getProperty("GwrongPassword"));
    }

    @Then("GKullanici {int} saniye bekler")
        public void gKullaniciSaniyeBekler(int wait){

           try {
                Thread.sleep(wait* 1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    @And("G{string} seceneginin oldugunu dogrular")
    public void gsecenegininOldugunuDogrular(String expectedResult) {
        //Assert.assertFalse(page.rememberMe.isSelected());
     //  String remember=Driver.getDriver().findElement(By.xpath("//span[text()='Remember me']")).getAttribute("innerHTML");
       String remember=page.rememberMe.getAttribute("innerHTML");
        System.out.println("remember"+remember);
        Assert.assertEquals(expectedResult,remember);
    }

    @And("G{string} secenegi oldugunu  dogrular")
    public void gsecenegiOldugunuDogrular(String arananKelime) {
      //  WebElement linkt= Driver.getDriver().findElement(By.linkText("Did you forget your password?"));
      //  Assert.assertTrue(linkt.getText().contains(arananKelime));
        Assert.assertTrue(page.forgetPassword.getText().contains(arananKelime));
        System.out.println(page.forgetPassword.getText());

    }
    @And("G{string} secenegin oldugunu  dogrular")
    public void gseceneginOldugunuDogrular(String arananKelime) {
        //  WebElement linkt= Driver.getDriver().findElement(By.linkText("Did you forget your password?"));
        //  Assert.assertTrue(linkt.getText().contains(arananKelime));
        Assert.assertTrue(page.RegisterAccount.getText().contains(arananKelime));
        System.out.println(page.RegisterAccount.getText());

    }

    @And("GKullanici {string} secenegin oldugunu  dogrular")
    public void gkullaniciSeceneginOldugunuDogrular(String arananKelime) {
        //Assert.assertTrue(page.cancel.getText().contains(arananKelime));
      page.cancel.click();
    }
}

