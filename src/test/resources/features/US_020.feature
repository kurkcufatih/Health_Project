@US020
Feature: US20_User management Activate a new user and provide necessary roles ONLY for Doctors and Staff by Admin


  @SmokeTest2
  Scenario: TC001_Admin can view registered people info as firstname, lastname, email etc..
    Given Admin goes to Medunna url
    Then Logins as Admin
    And Admin  clicks on Administration button text
    Then Admin Clicks on User Management button text from dropdown box
    Then Clicks view button for a registered person
    And Asserts the visibility of info page
    Then Closes driver

  Scenario: TC002_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN
    Given Admin goes to Medunna url
    Then Logins as Admin
    And Admin  clicks on Administration button text
    Then Admin Clicks on User Management button text from dropdown box
    Then Clicks edit  button for a registered person
    Then Clicks activate checkbox to activate the person
    And Gives the person admin role from the profiles
    Then Saves the changes
    Then Closes driver


  Scenario: TC003_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN
    Given Admin goes to Medunna url
    Then Logins as Admin
    And Admin  clicks on Administration button text
    Then Admin Clicks on User Management button text from dropdown box
    Then Clicks edit  button for a registered person
    And Gives the person user role from the profiles
    Then Saves the changes
    Then Closes driver

  Scenario: TC004_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN

    Given Admin goes to Medunna url
    Then Logins as Admin
    And Admin  clicks on Administration button text
    Then Admin Clicks on User Management button text from dropdown box
    Then Clicks edit  button for a registered person
    And Gives the person patient role from the profiles
    Then Saves the changes
    Then Closes driver

  Scenario: TC005_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN
    Given Admin goes to Medunna url
    Then Logins as Admin
    And Admin  clicks on Administration button text
    Then Admin Clicks on User Management button text from dropdown box
    Then Clicks edit  button for a registered person
    And Gives the person staff role from the profiles
    Then Saves the changes
    Then Closes driver

  Scenario: TC006_Admin can edit existing user info such as activated user, giving them roles as ADMIN, USER
  PATIENT, STAFF and PHYSICIAN

    Given Admin goes to Medunna url
    Then Logins as Admin
    And Admin  clicks on Administration button text
    Then Admin Clicks on User Management button text from dropdown box
    Then Clicks edit  button for a registered person
    And Gives the person physician role from the profiles
    Then Saves the changes
    Then Closes driver


  Scenario: TC007_Admin cannot delete users
    Given Admin goes to Medunna url
    Then Logins as Admin
    And Admin  clicks on Administration button text
    Then Admin Clicks on User Management button text from dropdown box
    Then Clicks delete button for a registered person
    And Confirms the delete operation
    Then Asserts that he cannot delete the user
    Then Closes driver

