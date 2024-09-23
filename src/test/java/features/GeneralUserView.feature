Feature: LoggedIn User View

  Scenario: Validate general user is able to view products whitout logging in
    Given User navigate to Online products page
    When User click on Formal Shoes drop down
    Then User should be able to view the Products

