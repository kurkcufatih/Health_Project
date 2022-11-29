@US_08
Feature:   US008 Kullanici password sekmesini duzenleyebilmelidir

  Background:
    Given ilknur Hasta "medunnaUrl" anasayfasinda
    When ilknur hasta sayfadaki insan figurune tiklar
    And ilknur signin butonuna basar
    And ilknur username girer
    And ilknur password password girer.
    And ilknur sayfaya girmek icin signin e basar
    And ilknur Kullanici username ini iceren basliga tiklar
    Then ilknur Kullanici password butonuna tiklar

  @positive008
  Scenario Outline: TC001 Yeni password olusturulabilmelidir

    And ilknur Kullanici eski sifresini "<currentPassword>" currentbox kismina girer
    And ilknur Kullanici yeni sifresini"<newPassword>" newpasswordbox kismina girer
    And ilknur Kullanici yeni sifresini dogrulamak icin"<confirmationPassword>" New password confirmationbox kismina tekrar girer
    And ilknur Kullanici save button a tiklar
    Then ilknur Kullanici basari ile olusturuldugunu dogrular
    And ilknur Sayfayi kapatir
    Examples:
      | currentPassword | newPassword | confirmationPassword |
      | 1234560     | 1234560     | 1234560              |

  @positive008
  Scenario Outline:TC002 Guclu bir sifre icin kucuk harf icermeli

    And ilknur Kullanici eski sifresini "<currentPassword>" currentbox kismina girer
    And ilknur Kullanici newpassword boxunu temizler
    And ilknur Kullanici yeni passwordunu"<new password>" newwpassword box a girer
    Then ilknur Kullanici strengh barinin bir gucunde oldugunu dogrular
    And ilknur Kullanici yeni bir karakter ekler " <add character>"
    Then ilknur Kullanici strengh barinin iki ye ciktigini dogrular
    And ilknur Sayfayi kapatir

    Examples:
      | currentPassword | new password | add character |
      | 1234560         | 1234560      | a             |

  @positive008
  Scenario Outline:TC003 Guclu bir sifre icin Buyuk harf icermelidir

    And ilknur Kullanici eski sifresini "<currentPassword>" currentbox kismina girer
    And  ilknur Kullanici newpassword boxunu temizler
    And ilknur Kullanici yeni passwordunu"<new password>" newwpassword box a girer
    Then ilknur Kullanici strengh barinin iki gucunde oldugunu dogrular
    And ilknur Kullanici yeni bir karakter ekler " <add character>"
    Then ilknur Kullanici strengh barinin dorde ye ciktigini dogrular
    And ilknur Sayfayi kapatir

    Examples:
      | currentPassword | new password | add character |
      | 1234560         | 123456a      | A             |

  @positive008
  Scenario Outline:TC004 Guclu bir sifre icin bir tane rakam icermelidir

    And ilknur Kullanici eski sifresini "<currentPassword>" currentbox kismina girer
    And  ilknur Kullanici newpassword boxunu temizler
    And ilknur Kullanici yeni passwordunu"<new password>" newwpassword box a girer
    Then ilknur Kullanici strengh barinin iki gucunde oldugunu dogrular
    And ilknur Kullanici yeni bir karakter ekler " <add character>"
    Then ilknur Kullanici strengh barinin bese ye ciktigini dogrular
    And ilknur Sayfayi kapatir

    Examples:
      | currentPassword | new password | add character |
      | 1234560         | bazbdA!      | 8             |

  @positive008
  Scenario Outline:TC005 Guclu bir sifre icin birtane ozel karakter icermelidir

    And ilknur Kullanici eski sifresini "<currentPassword>" currentbox kismina girer
    And  ilknur Kullanici newpassword boxunu temizler
    And ilknur Kullanici yeni passwordunu"<new password>" newwpassword box a girer
    Then ilknur Kullanici strengh barinin iki gucunde oldugunu dogrular
    And ilknur Kullanici yeni bir karakter ekler " <add character>"
    Then ilknur Kullanici strengh barinin dorde ye ciktigini dogrular
    And ilknur Sayfayi kapatir
    Examples:
      | currentPassword | new password | add character |
      | 1234560         | 12345xy      | !             |

  @negative008
  Scenario Outline:TC006(Negative Scenario) Guclu bir sifre icin en az 7 karakter olmalidir 6 karakterle sifre test edilir

    And  ilknur Kullanici newpassword boxunu temizler
    And ilknur Kullanici yeni passwordunu"<new password>" newwpassword box a girer
    Then ilknur Kullanici strengh barinin bir gucunde oldugunu dogrular
    And ilknur Sayfayi kapatir
    Examples:
      | new password |
      | qA1!5*       |

  @positive008
  Scenario Outline:TC007(Positive Scenario)Guclu bir sifre icin en az 7 karakter olmalidir

    And ilknur Kullanici eski sifresini "<currentPassword>" currentbox kismina girer
    And  ilknur Kullanici newpassword boxunu temizler
    And ilknur Kullanici yeni passwordunu"<new password>" newwpassword box a girer
    Then ilknur Kullanici strengh barinin iki gucunde oldugunu dogrular
    And ilknur Kullanici yeni bir karakter ekler " <add character>"
    Then ilknur Kullanici strengh barinin dorde ye ciktigini dogrular
    And ilknur Sayfayi kapatir
    Examples:
      | currentPassword | new password | add character |
      | 1234560         | 12345x       | !             |

  @bug
  Scenario Outline:TC008 Eski sifre kullanilamamalidir(BUG)

    When ilknur Kullanici current password boxunu temizler
    And ilknur Kullanici newpassword boxunu temizler
    And ilknur Kullanici confirmation password box unu temizler
    And ilknur Kullanici eski sifresini "<current Password>" currentbox kismina girer
    And ilknur Kullanici yeni sifresini"<new Password>" newpasswordbox kismina girer
    And ilknur Kullanici yeni sifresini dogrulamak icin"<confirmation Password>" New password confirmationbox kismina tekrar girer
    And ilknur Kullanici save button a tiklar
    Then ilknur Kullanici basari ile olusturuldugunu dogrular
    And ilknur Sayfayi kapatir
    Examples:
      | current Password | new Password | confirmation Password |
      | 1234560          | 1234560      | 1234560               |