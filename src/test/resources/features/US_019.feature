@UImehmet
Feature: US019 - Create new Staff-Update existing Staff-View and Delete the Staff-Validate with API and DB

  @Mehmet
  Scenario Outline: TC01901 - Admin can search new Staff among registered people using their SSN
    Given Admin goes to Medunna url
    Given Click Account Menu sign and click Register button
    And Fill in all informations for a new user "<ssn>","<firstname>","<lastname>","<username>","<email>","<mbstnewpassword>","<passwordconfirm>"
    And Click  Register button and verify created
    And Click Account Menu dropbox sign and click Sign In Text after sign out
    And Click User Name textbox and enter admin user name "<adminusername>"
    And Click Password textbox and enter admin password "<adminpassword>"
    And Click Sign In button
    And Click Administration and User Management button and activate new user

    Examples:
      | adminusername | adminpassword | ssn     | firstname | lastname | username | email                | mbstnewpassword | passwordconfirm |
      | Team23          | Team23+         | 222-22-2903 | Personelabcde      | personeldef       | Personel3390 | personelmhmtclike@gmail.com | 22382238Aa1.    | 22382238Aa1.        |

  Scenario Outline: TC01902 - All their information should be populated
    Given Admin goes to Medunna url
    And Click Account Menu sign and click Signin button
    And Click User Name textbox and enter admin user name "<adminusername>"
    And Click Password textbox and enter admin password "<adminpassword>"
    And Click Sign In button
    And Admin Clicks Create  A New Staff  button and search your SSN number "<ssn>"
    Given Admin Selects Birth Date and Enter Phone number "<birthdate>", "<phone>"
    And Admin Selects Gender and Blood Group
    And Admin Enters Address and Description "<address>","<description>"
    And Admin Selects User, Country and State City
    And Admin Clicks Save button.
    Then Admin Verifies created successfully message with new ID
    And Admin Clicks Created Date from List Row
    And Admin Clicks first row and last new user and verify data
    Then Closes driver

    Examples:
      | adminusername | adminpassword | ssn     | birthdate | phone    | address              | description |
      | Team23          | Team23+         | 222-22-2903 | 01/01/1954    | 100-200-1945 | Kecioren | degisiklikileberaber   |

  @Mehmet12
  Scenario Outline: TC01903 - User (Admin) can select a user from the existing users (registered people)
    Given Admin goes to Medunna url
    And Click Account Menu sign and click Signin button
    And Click User Name textbox and enter admin user name "<adminusername>"
    And Click Password textbox and enter admin password "<adminpassword>"
    And Click Sign In button
    Given Admin  clicks on Administration button text
    And Admin Clicks on User Management button text from dropdown box
    And Admin Select any user.
    Then Admin Verifies selected users all information is visible.

    Examples:
      | adminusername | adminpassword |
      | Team23          | Team23+         |


  Scenario Outline: TC01904 - User can edit their info
    Given Admin goes to Medunna url
    And Click Account Menu sign and click Signin button
    And Click User Name textbox and enter admin user name "<adminusername>"
    And Click Password textbox and enter admin password "<adminpassword>"
    And Click Sign In button
    Given Click Items Titles button and Staff button from dropdown box
    And Find my new staff and click to Edit button
    And Change First name, Last name, Phone and Description "<firstname>","<stlastname>","<phone>","<description>"
    And Click Save button
    Then mb Verify that succesfully message is A user is updated identifier-changed item

    Examples:
      | adminusername | adminpassword | firstname       | stlastname       | phone    | description       |
      | Team23          | Team23+         | Firstname editlendi | Lastname editlendi | 123-451-6787 | Description yenilendi |

  Scenario Outline: TC01905 - User can delete their info
    Given Admin goes to Medunna url
    And Click Account Menu sign and click Signin button
    And Click User Name textbox and enter admin user name "<adminusername>"
    And Click Password textbox and enter admin password "<adminpassword>"
    And Click Sign In button
    And Click Items Titles button and Staff button from dropdown box
    And Find my new Staff and click Delete button from Staff Page
    And Click Administration and User Management button text from dropdown box
    And Find my new Staff and click Delete button from Users Page
    Then Verify user see deleted successfully message A user is deleted identifier - deleted item
    Examples:
      | adminusername | adminpassword |
      | Team23          | Team23+         |



