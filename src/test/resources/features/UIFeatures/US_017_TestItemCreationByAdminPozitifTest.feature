@US17
Feature: Medunna
  Scenario: US017_TC001 Admin creates test item
    Given Admin goes to Medunna url
    Then Admin navigates the sign in page
    And Admin signs in
    And Admin clicks on Items&Titles button to click room option
    And Admin clicks the Test Item button
    And Admin clicks on Create a new test item button
    And Admin enters a name
    And Description part can be filled
    And Price must be entered
    And Admin can write Default Min. Value
    And Admin can write Default Max. Value
    And Admin saves the new item
    And Take a screenshot of the test result

  Scenario: US017_TC002 Admin edits a test item
    Given Admin clicks on Items&Titles button to click room option
    Then Admin clicks the Test Item button
    And Admin clicks edit button of the first test item for edit
    And Admin enters a name
    And Description part can be filled
    And Price must be filled
    And Admin can write Default Min. Value
    And Admin can write Default Max. Value
    And Admin clicks the savebutton
    And Take a screenshot of the test result

  Scenario: US017_TC003 Admin deletes a test item
    Given Admin clicks on Items&Titles button to click room option
    Then Admin clicks the Test Item button
    And admin clicks delete button
    And admin confirm delete
    And get screen shot
    And page is closed