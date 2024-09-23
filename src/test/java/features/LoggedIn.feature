Feature: LoggedIn User View

  Scenario: Validate User is able to view home page after login
    Given User navigate to the Login page
    When User successfully enters the log in details
    Then User should be able to view the product category page
