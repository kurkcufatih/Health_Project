
Feature: create and edit a physician

  Scenario: TC001 Create a new physician
    Given Admin goes to Medunna url
    Then Admin navigates the sign in page
    And Admin signs in
    And Admin clicks on Items&Titles button to click physician option
    And Admin clicks the physician button
    And Admin clicks on Create a new physician button
    And Admin clicks on Use Search
    And Admin enters SNN number of any physician
    And Admin clicks on Search User button
    And Admin enters the name of a physician
    And Admin enters the lastname of a physician
    And Admin enters the date of a physician
    And Admin enters the phone number of a physician
    And Admin enters the address of a physician
    And Admin can choose gender of a physician
    And Admin can choose a speciality of a physician
    And Admin can choose blood group of a physician
    And Admin can add a description
    And Admin can change a photo of a physician
    And Admin can enter examination fee of a physician
    And Admin can choose a user
    And Admin can choose a country
    And Admin can choose a state
    And Admin saves the new edit

  Scenario: TC002 Edit a physician
    Given Admin goes to Medunna url
    Then Admin navigates the sign in page
    And Admin signs in
    And Admin clicks on Items&Titles button to click physician option
    And Admin clicks the physician button
    And Admin clicks edit button to edit any of physician
    And Admin can edit the name of a physician
    And Admin can edit the lastname of a physician
    And Admin can edit the date of a physician
    And Admin can edit the phone number of a physician
    And Admin can edit the address of a physician
    And Admin can choose gender of a physician
    And Admin can choose a speciality of a physician
    And Admin can choose blood group of a physician
    And Admin can edit description
    And Admin can change a photo of a physician
    And Admin can enter examination fee of a physician
    And Admin can choose a user
    And Admin can choose a country
    And Admin can choose a state
    And Admin saves the new edit
  @US18
  Scenario: TC003 Delete a physician
    Given Admin goes to Medunna url
    Then Admin navigates the sign in page
    And Admin signs in
    And Admin clicks on Items&Titles button to click physician option
    And Admin clicks the physician button
    And Admin can delete any physician
    And confirm deletion