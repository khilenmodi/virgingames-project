@regression
Feature:online slots page test
  As a user i want to navigate to  Try Our Play'n Go Slots page

  @sanity
  Scenario:Verify user should navigate to The vault page successfully
    Given I am on homepage
    When I accept cookies
    And I click on online slots link
    And I click on The Try Our Play'n Go Slots
    Then I can see text "Play'n GO Slots"