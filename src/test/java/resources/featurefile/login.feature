Feature:user should click on JoinNow and navigate successfully
           As a user I want to create a account
  @smoke
  Scenario:User should navigate to Join now page successfully
    Given I am homepage
    When I accept the cookies
    And I click on JoinNow
    And I enter email "khilenmodi1@yahoo.com"
    And I select Title "Mr"
    And I enter firstname "Khilen"
    And I enter surname "Modi"
    And I enter Date of Birth in "18/09/1980"
    And I click on Male button
    And I click on Next Step button
    Then I should able to see the text join successfully




