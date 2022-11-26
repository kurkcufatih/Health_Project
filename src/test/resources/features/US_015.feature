@u15
Feature: Bitirme Projesi

  Background: Ortak Adimlar
    Given siteye gider
  Scenario: US_015 Tc_001 Yeni hastalar yalnızca yönetici tarafından oluşturulabilir
    When  Account menuye tiklar
    Then  sign in'e tiklar
    And   username tiklar
    And    giris bilgilerini "Team23" girer
    And    Password "Team23+" girer
    And    Sign in'e tiklarayak siteye giris yapar
    And   Acilan sayfada Items&Titles'e tiklar
    And   Patient'e Tiklar
    And   Acilan sayfada Create a new Patient(Yeni Hasta olustur) buttonun gorur

  Scenario: US_015 Tc_002 Yonetici hasta bilgilerini gorur
    And  Acilan sayfada Items&Titles'e tiklar
    And  Patient'e Tiklar
    And  Acilan sayfada Create a new Patient(Yeni Hasta olustur) buttonun tiklar
    And  Acilan sayfada bilgileri gorur

  Scenario: US_015 Tc_003 Yeni hasta bilgilerini girer
    And  Acilan sayfada Items&Titles'e tiklar
    And  Patient'e Tiklar
    And  Acilan sayfada Create a new Patient(Yeni Hasta olustur) buttonun tiklar
    And  Firstname "Ahmet" girer
    And  Lastname "CAN" girer
    And  Birt Date "20.05.1990" girer
    And  Email "sn@gmail.com" girer
    And  Phone "1234567890" girer
    And  Cinsiyet "MALE" girer
    And  Kan grubu "0-" girer
    And  Adress "ali baba" girer
    And  Description "buda gecer" girer
    And  User "jonnyjones" girer
    And  Country "France" girer
    And  Save buttonuna tiklar

  Scenario:Us_015 Tc_004 Hastaya doktoru sadece Admin atayabilir.
    And  Acilan sayfada Items&Titles'e tiklar
    And  Apointment'e Tiklar
    And  Acilan sayfada Create a new Appointment'e(Yeni Hasta olustur) buttonun tiklar
    And  Sayfada Hastaya doktor atama kısmı yoktur

  Scenario:Us_015 Tc_005 "Country", "US state" olmalı ve boş bırakılmamalı
    And Acilan sayfada Items&Titles'e tiklar
    And Country buttonuna tiklar
    And Acilan sayfada Create a new Country(Yeni Ulke Olustur) buttonun tiklar
    And Country'e "Turkiye" secer
    And Kaydet buttonuna tiklar
    And Items&Titles'e tiklar
    And State/City'i buttonuna tiklar
    And Acilan sayfada Create a new State(Yeni Sehir Olustur) buttonun tiklar
    And State/City kısmına "Alanya" girer
    And Kaydet buttonuna tiklar

  Scenario:Us_015 Tc_006 Yönetici herhangi bir hastayı silebilir
    And Acilan sayfada Items&Titles'e tiklar
    And Patient'e Tiklar
    And hasta bilgilerinin yazılı oldugu kısımda Delete tiklar ve hastayı siler
    And Sayfayi kapatir
