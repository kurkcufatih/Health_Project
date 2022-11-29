Feature: US_024_My_Appointments_by_Patient

  Background: Common steps for US_024
    Given Staff goes to Medunna url
    And   Staff navigates the sign in page
    And   User(Patient) signs in with correct credentials
    And   User(Patient) clicks the My Appointments



  Scenario: TC_008 Patient can see the test results and id, name for test, default max and min value, test
  date and description


    And   User(Patient) clicks Show Tests
    And   User(Patient) clicks View Results
    Then  User(Patient) verifies that it can see the result fields  id, name for test, default max and min value, test date and description


    Scenario: TC_009 Can view the Invoice

      And User(Patient) clicks Show Invoice Button
      Then User(Patient) verifies the SSN no on invoice belongs to him or her

