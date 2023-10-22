@Sce3
Feature: LoginPage for Face

  Background: 
    Given Launch the Browser
    And Enter the URL

	@Sce3
  Scenario Outline: Validate the username and password
    When Enter the user "<username>"
    And Enter the pass "<password>"
    And Enter the login
    Then Validate the Home

    Examples: 
      | username | password |
      | Aiite1   | Test1    |
      | Aiite2   | Test2    |
      | Aiite3   | Test3    |
