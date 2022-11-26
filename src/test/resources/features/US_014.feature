@us14
Feature: Bitirme Projesi

  Background: Ortak Adimlar
    Given siteye gider

  Scenario:US_014 Tc_001 Doktor hasta bilgilerini gorur
    When  Account menuye tiklar
    Then  sign in'e tiklar
    And   username tiklar
    And    giris bilgilerini "DoktorNihat" girer
    And    Password "147758.aK" girer
    And   Sign in'e tiklarayak siteye giris yapar
    And   MYPAGES'e tiklar
    And   MyInpatients'e tiklar
    And   Acilan sayfada hastanın bilgilerini gorur

  Scenario: TC_002 "Status" doktor tarafından güncellenebilmelidir.
    And  MYPAGES'e tiklar
    And  MyInpatients'e tiklar
    And  Acilan sayfada hastayı bulur Edit'e tiklar
    And  Status' e tiklar
    And  Hastanın durumunu güncelleyemiyor

  Scenario: TC_003 Doktor rezerve edilmiş odayı güncelleyebilmelidir.
    And  MYPAGES'e tiklar
    And  MyInpatients'e tiklar
    And  Acilan sayfada hastayı bulur Edit'e tiklar
    And  oda buttonuna tiklar
    And  odanin durumunu güncelleye biliyor
    And  Sayfayi kapatir