Feature: Scroll
  Scenario: Ensure user can scroll
    Given user in Home page
    When  user click swipe
    And user scroll down
    Then user see robot image