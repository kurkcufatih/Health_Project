@US021
Feature: US021_Show appointments for patients by Staff

  Scenario: TC001_Staff can only update appointments

    Given Staff goes to Medunna url
    Then Logins as Staff
    And Staff clicks my pages, search patient
    Then Staff sends a patient ssn for the search box
    Then Staff clicks show appointments button
    Then Staff clicks edit button
    And Staff asserts the visibility of appointment page
    Then Closes driver

  Scenario: TC002_Staff can make the status UNAPPROVED, PENDING or CANCELLED, but cannot make
  it COMPLETED

    Given Staff goes to Medunna url
    Then Logins as Staff
    And Staff clicks my pages, search patient
    Then Staff sends a patient ssn for the search box
    Then Staff clicks show appointments button
    Then Staff clicks edit button
    Then Staff selects unapproved as status and takes ss
    Then Staff selects pending as status and takes ss
    Then Staff selects cancelled as status and takes ss
    Then Closes driver

  Scenario: TC003_Staff does not need to provide Anamnesis, Treatment or Diagnosis as required fields
    Given Staff goes to Medunna url
    Then Logins as Staff
    And Staff clicks my pages, search patient
    Then Staff sends a patient ssn for the search box
    Then Staff clicks show appointments button
    Then Staff clicks edit button
    Then Staff clicks anamnesis box without writing anything
    Then Staff clicks treatment box without writing anything
    Then Staff clicks diagnosis box without writing anything
    Then Staff clicks save button
    Then Closes driver

  Scenario: TC004_They can select the current doctor that needs to be selected for the patient
    Given Staff goes to Medunna url
    Then Logins as Staff
    And Staff clicks my pages, search patient
    Then Staff sends a patient ssn for the search box
    Then Staff clicks show appointments button
    Then Staff clicks edit button
    Then Staff goes to physician dropdown and chooses  a doctor
    Then Staff clicks save button
    And Staff asserts that changes have been saved
    Then Closes driver

  @SmokeTest2
  Scenario: TC005_They can view the patients test results
    Given Staff goes to Medunna url
    Then Logins as Staff
    And Staff clicks my pages, search patient
    Then Staff sends a patient ssn for the search box
    Then Staff clicks show appointments button
    And Staff clicks show tests button
    Then Staff chooses a test and clicks on view results
    Then Staff asserts the visibility of test results
    Then Closes driver