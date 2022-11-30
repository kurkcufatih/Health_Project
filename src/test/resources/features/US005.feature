@US005
Feature: US005 Hastalar (patients), hastahaneden randevu (Appointment) olusturabilmelidir.

  Background:
    Given GKullanici medunnaUrl adresine gider
    When GKullanici "Make an Appointment" linkine tiklar
    And GKullanici 2 saniye bekler

  @TC01
  Scenario:TC01 Kullanıcının herhangi bir karakter içeren "First Name" yazması gerekir ve boş bırakılamaz.

    Then GKullanici "First Name" bos birakarak "Send an Appointment Request" butonuna tiklar
    And GKullanici "Your First Name is required." uyarisini dogrular
    And GKullanici gecerli bir First Name numarasi girer
    And GKullanici 2 saniye bekler

  @TC02
  Scenario:TC02 Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.
    Then GKullanici "SSN" bos birakarak "Send an Appointment Request" butonuna tiklar
    And GKullanici "Your SSN is required." uyarisini dogrular
    And GKullanici gecerli bir SSN numarasi girer
    And GKullanici 2 saniye bekler

  @US005_TC02_negatif
  Scenario:TC02 Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.
    Then GKullanici "SSN" bos birakarak "Send an Appointment Request" butonuna tiklar
    And GKullanici Your SSN is invalid uyarisini dogrular
    And GKullanici 2 saniye bekler

  @TC03
  Scenario:TC03 Kullanici, herhangi bir karakter içeren "Last Name" yazması gerekir, boş bırakılamaz.
    Then GKullanici "Last Name" bos birakarak "Send an Appointment Request" butonuna tiklar
    And GKullanici "Your Last Name is required." uyarisini dogrular
    And GKullnici Last Name girer
    And GKullanici 2 saniye bekler

  @TC04
  Scenario:TC04 Kullanici, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını gireli, boş bırakılamaz
    Then GKullanici "Phone" bos birakarak "Send an Appointment Request" butonuna tiklar
    And GKullanici "Phone number is required." uyarisini dogrular
    And GKullnici Phone number girer
    And GKullanici 2 saniye bekler

  @TC04_negatif
  Scenario:TC04 Kullanici, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını gireli, boş bırakılamaz
    Then GKullnici gecersiz Phone number girer
    And GKullanici "Send an Appointment Request" butonuna tiklar
    And GKullanici Phone number is invalid uyarisini dogrular
    And GKullanici 2 saniye bekler

  @US005_TC05
  Scenario:TC05 Kullanıcı, Gecerli bir "Email" yazması gerekir, boş bırakılamaz.
    Then GKullanici "Email" bos birakarak "Send an Appointment Request" butonuna tiklar
    And GKullanici "Your email is required." uyarisini dogrular
    And GKullanici gecerli bir "Email" girer
    And GKullanici 2 saniye bekler

  @US005_TC05_negatif
  Scenario:TC05 Kullanıcı, Gecerli bir "Email" yazması gerekir, boş bırakılamaz.
    Then GKullanici gecersiz bir "Email" girer
    And GKullanici "Send an Appointment Request" butonuna tiklar
    And GKullanici "This field is invalid" yazisini dogrular
    And GKullanici 2 saniye bekler

    @US005_TC06
    Scenario:TC06 Kullanici randevu alip kaydoldugunda, profillerini gorebilir ve uygulamada oturum acabilir.
    Then GKullanici gecerli bir First Name numarasi girer
      And GKullanici gecerli bir SSN numarasi girer
      And GKullnici Last Name girer
      And GKullnici Phone number girer
      And GKullanici gecerli bir "Email" girer
      And GKullanici "Send an Appointment Request" butonuna tiklar
      And GKullanici 1 saniye bekler
      And GKullanici Appointment registration saved! yazisini dogrular