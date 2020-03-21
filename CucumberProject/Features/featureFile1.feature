Feature: Search feature of tricentis application

  Scenario: Verify search scenario
    Given user is on homepage
    When user searches bmw
    Then new window should open with search results

  Scenario: Verify search scenario
    Given Search results are available
    When user clicks on first search result
    Then the details should display
