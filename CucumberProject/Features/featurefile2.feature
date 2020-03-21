Feature: tricentis login feature


  Scenario Outline: Test login with multiple test data
    Given User is on login page
    When user enters <username> and <password>
    Then homepage should be displayed

    Examples: 
      | username  | password     |
      | Amey123   | passW0rd@123 |
      | Amey456   | PassWOrD!123 |
