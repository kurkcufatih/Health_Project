@us13
Feature: Bitirme Projesi

 Background: Ortak Adimlar
  Given  siteye gider
  Scenario: US_013 Tc_001 Test sonuclarini gore bilmeli

   When   Account menuye tiklar
   Then   sign in'e tiklar
   And    username tiklar
   And    giris bilgilerini "DoktorNihat" girer
   And    Password "147758.aK" girer
   And    Sign in'e tiklarayak siteye giris yapar
   And    MY PAGES'e tiklar
   And    My Appointments'e tiklar
   And    Acilan Sayfada Randevu Alan Hastanın Bilgisinin Oldugu Yerdeki Edit'e tiklar
   And    Acilan Sayfada Show Test Results e tiklar
   And    Doctor Acilan Sayfada View Results'a tiklar
   And    Acilan Sayfada Secilen Test Turlerin gorur


 Scenario: US_013 Tc_002 Doktor "Request Impatient" (hastanın yatılı tedavi görmesi) isteğinde bulunabilmelidi

   And     MYPAGES'e tiklar
   And     MyAppointments'e tiklar
   And     Acilan Sayfada Randevu Alan Hastanin Bilgisinin Oldugu Yerdeki Edit'e tiklar
   And     Request Inpatient'e tiklar
   And     Yatis islemini tamamlar
   And     Sayfayi kapatir