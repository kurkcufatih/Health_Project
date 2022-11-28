@US_007

Feature: Medunna.com

  Background:
    Given ilknur Hasta "medunnaUrl" anasayfasinda
    When ilknur hasta sayfadaki insan figurune tiklar
    And ilknur signin butonuna basar
    And ilknur username girer
    And ilknur password password girer.
    And ilknur sayfaya girmek icin signin e basar
    And ilknur Mypages basligina tiklar
    And ilknur Make an appointment basligina tiklar

  @positive007
  Scenario: TC_001 Randevu tarihi gun ay yil seklinde belirlenmelidir
    And ilknur Telefon numarasi girer
    And ilknur Randevu tarihini "gun" "Ay" "yil" olarak belirler
    And ilknur Send an appointment butonuna tiklar
    Then ilknur Olusturuldugunu dogrular
    And ilknur Sayfayi kapatir

  @pozitive007
  Scenario: TC002 Kullanici gelecek bir tarih icin randevu alabilmelidir

    And ilknur Telefon numarasi girer
    And ilknur Gelecek tarihli bir randevu olusturur
    And ilknur Send an appointment butonuna tiklar
    Then ilknur Olusturuldugunu dogrular
    And ilknur Sayfayi kapatir
  @pozitive007
  Scenario: TC003 Kullanici guncel tarih icin randevu alabilmelidir

    And ilknur Telefon numarasi girer
    And ilknur Kullanici guncel tarihi GunAyYil olarak girer
    And ilknur Send an appointment butonuna tiklar
    Then ilknur Olusturuldugunu dogrular
    And ilknur Sayfayi kapatir

  @bug
  Scenario: TC004 Kullanici gecmis bir tarih girerek Randevu almaya calisir(BUG)

    And ilknur Telefon numarasi girer
    And ilknur Kullanici gecmis tarih girerek randevu almaya calisir
    And  ilknur kullanici gecmis tarih uyarisini gorur
    And ilknur Send an appointment butonuna tiklar
    Then ilknur Olusturuldugunu dogrular
    And ilknur Sayfayi kapatir
  #@negative007
 # Scenario: TC005 kullanici tarih kutusunu bos birakarak randevu olusturmayi dener

   # And Telefon numarasi girer
   # And Tarih kutusunu temizler
   # And Send an appointment butonuna tiklar
   # Then olusturulamadi yazisinin ciktigini dogrular
   # And Sayfayi kapatir

  @negative007
  Scenario: TC006 Telefon numarasi girmeden randevu olusturmaya calisir(negatif test)

    And ilknur Randevu tarihini "Ay" "gun" "Yil" olarak belirler
    And ilknur Send an appointment butonuna tiklar
    Then ilknur Phone number is required.yazisinin gorundugunu dogrular
    And ilknur Sayfayi kapatir








