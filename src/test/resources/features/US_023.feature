Feature: US_023 Payment Invoice by Staff

  Background: Common methods for US_023
    Given Staff goes to Medunna url
    And   Staff navigates the sign in page
    And   Staff signs in with valid credentials
    And   Staff navigates My Pages
    And   Staff clicks Search Patient
    And   Staff enters a valid SSN id of a patient into Patient SSN input
    And   Staff clicks the Show Appointments


  Scenario: TC_004 User (Staff) can create a Payment Invoice

    And   Staff clicks Payment Invoice Process


  Scenario:  TC_005 At this portal, The patient should have a status of completed or Cancelled for staff to create an invoice

    And Staff verifies there is Payment Invoice process button


  Scenario: TC_006 User(Staff)  can view all invoice like Exam fee, test item prices and can create a new invoice for the patient

    And user logs out
    Given Staff goes to Medunna url
    And   Staff navigates the sign in page
    And   Staff signs in with valid credentials
    And   Staff navigates My Pages
    And   Staff clicks Search Patient
    And   Staff enters a SSN id of patient with invoice
    And   Staff clicks the Show Appointments of Invoiced patient
    And   Staff clicks Payment Invoice Process
    And   Staff verifies there is a button named Create Invoice


  Scenario: TC_007 User(Staff) then can view the invoice sent to patient

    And user logs out
    Given Staff goes to Medunna url
    And   Staff navigates the sign in page
    And   Staff signs in with valid credentials
    And   Staff navigates My Pages
    And   Staff clicks Search Patient
    And   Staff enters a SSN id of patient with invoice
    And   Staff clicks the Show Appointments of Invoiced patient
    And Staff clicks Payment Invoice Process

    Then Staff verifies the SSN number belgons to the relevant patient



