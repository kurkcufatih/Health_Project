Feature: US_022_Staff_Edits_Patient_Tests

  Background: Common Steps for US_022

    Given Staff goes to Medunna url
    And   Staff navigates the sign in page
    And   Staff signs in with valid credentials
    And   Staff navigates My Pages
    And   Staff clicks Search Patient
    When  Staff enters a valid SSN id of a patient into Patient SSN input

  Scenario: TC_001 User(Staff) can search about patient by SSN id

    Then  Staff verifies the patient with relevant SSN is found
    Then  user logs out

  Scenario: TC_002 Staff should navigate to Show appointments, edit patient tests clicking on Show test


    And   Staff clicks the Show Appointments
    And   Staff clicks the Show Tests then clicks View Results
    Then  Staff confirms that each test result provides a number
    Then  user logs out


  Scenario: TC_003 Staff Staff will view or update the result info such as ID, Date, Result, description, Created date etc..

    And   Staff clicks the Show Appointments
    And   Staff clicks the Show Tests then clicks View Results
    And   Staff  verifies he can update each result in Test Results section





