Feature: Main page bottom tabs functionality
  As a user, when I click on the bottom tabs I should be able to access to these particular item pages.

Background:
    Given I am on the main page
@smoke
   Scenario:
      When I click on search tab
      Then I should be able to navigate to search page
@smoke
  Scenario:
    When I click on contact tab
    Then I should be able to navigate to contact page
@smoke
  Scenario:
    When I click on terms of service tab
    Then I should be able to navigate to terms of service page
@smoke
  Scenario:
    When I click on refund policy tab
    Then I should be able to navigate to refund policy page
@smoke
  Scenario:
    When I click on privacy policy tab
    Then I should be able to navigate to privacy policy page



