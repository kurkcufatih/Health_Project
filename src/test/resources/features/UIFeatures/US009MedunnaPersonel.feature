Feature: US_009 Personel hasta bilgilerini gorebilmeli,duzenleyebilmeli ama silememelidir

  Background:
    Given ilknur Personel "medunnaUrl" anasayfasina gider
    And ilknur Sayfadaki insan figurune tiklar
    And ilknur Personel sign in butonuna tiklar
    And ilknur Gecerli password ve username girer
    And ilknur Personel sayfaya giris yapamak icin sign in butonuna tiklar
    And ilknur My pages basligina tiklar

  Scenario: TC_001 Personel my pages sayfasindan hasta bilgilerini gorebilmeli
    And  ilknur in search basligina tiklar
    And ilknur Hasta ssn i ile arama yapar
    Then ilknur Acilan sayfada hasta bilgilerini gordugunu dogrular
    And ilknur Sayfayi kapatir

  Scenario: TC_002 Personel butun hasta bilgilerini duzenleyebilmeli
    And ilknur in search basligina tiklar
    And ilknur Hasta ssn i ile arama yapar
    And ilknur edit butonuna tiklar
    Then ilknur Create or edit sayfasina geldigini dogrular
    Then ilknur Hasta bilgilerini degistirebildigini dogrular
    And ilknur Sayfayi kapatir

  Scenario: TC_003 Kullanici ssn numarasi ile yeni bir hasta arayabilmeli ve tum bilgilerin dolduruldugunu kontrol edebilmelidir
    And ilknur in search basligina tiklar
    And  ilknur Hasta ssn i ile arama yapar
    Then ilknur Acilan sayfada hastanin bulundugunu dogrular
    And ilknur edit butonuna tiklar
    Then ilknur Create or edit sayfasina geldigini dogrular
    Then ilknur Hastanin tum bilgileri doldurdugunu test eder
    And ilknur Sayfayi kapatir

  Scenario: TC_004 Kullanici Herhangi bir hasta bilgisini silebilir
    And ilknur in search basligina tiklar
    And ilknur Hasta ssn i ile arama yapar
    Then ilknur Acilan sayfada hastanin bulundugunu dogrular
    And ilknur edit butonuna tiklar
    Then ilknur Create or edit sayfasina geldigini dogrular
    And ilknur Firstname siler
    Then ilknur This field is required yazisinin gorundugunu dogrular
    And ilknur Lastname siler
    Then ilknur This field is required.yazisinin gotundugunu dogrular
    And ilknur email i siler
    Then ilknur Your email is required.yazisinin gorundugunu dogrular
    And ilknur tel no yu siler
    Then ilknur Phone number is required.yazisinin gorundugunu dogrular
    And ilknur Sayfayi kapatir

  Scenario: TC_005 Personel hastalari silemez

    And ilknur in search basligina tiklar
    And ilknur Hasta ssn i ile arama yapar
    Then ilknur Acilan sayfada hastanin bulundugunu dogrular
    Then  ilknur Acilan sayfada  edit view ve showappointments butonlarinin oldugunu dogrular
    And ilknur delete butonunun olmadigini dogrular
    And ilknur Sayfayi kapatir







