Feature: LoggedIn User View

  Scenario: Validate new user is able to view after clicking on new Registration
    Given User navigate to the Login page
    When User click on new Registration button
    Then User should be able to view the Registration page
