Feature: LoginFeature

  Scenario: Login with correct username and password



    Given I navigate to the login page
    And i enter the following Login
    | username | password |
    | admina   | adminpassword |
    And I click login button
    Then I should see the userform page



