@US004
Feature: US004 Giris sayfasi yalnizca gecerli kimlik bilgileriyle erisilebilir olmalidir.


  Background:
    Given GKullanici medunnaUrl adresine gider
    Then GKullanici user ikonuna tiklar
    And GKullanici Sign in linkine tiklar

  @TC01
  Scenario: TC01 Giris yapmak icin basarı mesajını dogrulayan, gecerli bir kullanıcı adı ve sifre olmalıdır.
    And GKullanici gecerli bir Username girer
    And GKullanici gecerli bir Password girer
    And GKullanici Medunna sayfasina basarili giris yaptigini dogrulayan mesaji dogrular
    And GKullanici basarili bir giris yaptigini dogrular

  @TC01_negatif_01
  Scenario:TC01 Giris yapmak icin basarı mesajını dogrulayan, gecerli bir kullanıcı adı ve sifre olmalıdır.(NEGATIF TEST)
    And GKullanici gecerli bir Username girer
    And GKullanici gecersiz bir Password girer
    And GKullanici Sign in Butonuna tiklar
    And G"Failed to sign in! Please check your credentials and try again." yazisini dogrular
    Then GKullanici 1 saniye bekler

  @TC01_negatif_02
  Scenario:TC01 Giris yapmak için basarı mesajını dogrulayan, gecerli bir kullanıcı adı ve sifre olmalıdır.(NEGATIF TEST)
    And GKullanici gecersiz bir Username girer
    And GKullanici gecerli bir Password girer
    And GKullanici Sign in Butonuna tiklar
    And G"Failed to sign in! Please check your credentials and try again." yazisini dogrular
    Then GKullanici 1 saniye bekler

  @US004TC02
  Scenario:TC02 Kullanıcının mevcut kimlik bilgilerini her zaman kullanabilecegi, "Remember me" secenegi olmalidir
    And GKullanici gecerli bir Username girer
    And GKullanici gecerli bir Password girer
    And G"Remember me" seceneginin oldugunu dogrular

  @TC03
  Scenario:TC03 Eger sifre unutulursa diye "Did you forget your password?" secenegi olmalidir.
    And GKullanici gecerli bir Username girer
    And GKullanici gecerli bir Password girer
    And G"Did you forget your password?" secenegi oldugunu  dogrular

  @TC04
  Scenario:TC04 "You don't have an account yet? Register a new account" secenegi olmalidir.
    And GKullanici gecerli bir Username girer
    And GKullanici gecerli bir Password girer
    And G"Register a new account" secenegin oldugunu  dogrular

  @TC05
  Scenario:TC05 "Cancel" secenegi olmalidir.
    And GKullanici gecerli bir Username girer
    And GKullanici gecerli bir Password girer
    And GKullanici "Cancel" secenegin oldugunu  dogrular
    And Kullanici sayfayi kapatir