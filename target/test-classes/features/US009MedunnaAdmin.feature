Feature: US_009 Personel hasta bilgilerini gorebilmeli,duzenleyebilmeli ama silememelidir

  Background:
    Given ilknur Admin "medunnaUrl" anasayfasina gider
    And ilknur Sayfadaki insan figurune tiklar
    And ilknur Sign in basligina tiklar
    And ilknur Gecerli bir username ve password girer
    And ilknur Admin olarak sign in olur
    And ilknur items and title basligina tiklar
    And ilknur patient basligini secer

  Scenario:TC_006 Admin hasta bilgilerini gorebilir,silebilir

    Then ilknur Acilan sayfada hasta bilgilerini gordugunu dogrular.
    And ilknur edit butonuna tiklar.
    Then ilknur hasta bilgilerini silebildigini test eder
    And ilknur Sayfayi kapatir

  Scenario: TC_007 Hasta bilgilerini degistirebildigini test eder
    And ilknur edit butonuna tiklar.
    And ilknur Hasta bilgilerini degistirebildigini test eder
    And ilknur Sayfayi kapatir

  Scenario:TC_008 Hastayi silebildigini test eder
    And ilknur Delete butonun gorunurlugunu test eder
    And ilknur Sayfayi kapatir


  Scenario: TC_009 Admin ssn numarasi ile hasta arayamaz

    Then ilknur Acilan sayfada Patient ssn Basliginin bulunmadigini dogrular
    And ilknur Sayfayi kapatir
