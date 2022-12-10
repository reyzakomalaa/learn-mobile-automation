Feature: Scroll
  @Scroll
  Scenario: Ensure user can scroll
    Given user in Home page
    When  user click swipe
    And user scroll down
    Then user see robot image

  @Swipe
  Scenario: Ensure user can swipe
    Given user in Home page
    When  user click swipe
    And user swipe to JS Foundation
    Then user see JS Foundation