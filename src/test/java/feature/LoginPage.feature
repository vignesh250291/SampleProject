Feature: LoginPage for Facebook

  Background: 

  #Given Launch the Browser
  #And Enter the URL
  @Sce1
  Scenario: Enter the valid username and password
    When Enter the username "Aiite"
    And Enter the password "A45AA"
    And Enter the loginbutton
    Then Validate the HomePage

  @Sce2
  Scenario: Enter the invalid username and password
    When Enter the username "Aiite3456"
    And Enter the password "A45AA345566"
    And Enter the loginbutton
    Then Validate the HomePage

  #aslist()
  @Sce4
  Scenario: Enter the invalid username and password
    When Enter the userdata
      | Aiite1 |
      | Aiite2 |
    And Enter the passdata
      | Pass1 |
      | pass2 |
    And Enter the loginbutton
    Then Validate the HomePage

  #aslists()
  @Sce5
  Scenario: Enter the invalid username and password
    When Enter the userdata for lists
      | aiite0 | yuvaraj0 |
      | tech2  | sekar2   |
      | tech1  | sekarl1  |
    #And Enter the passdata
    And Enter the loginbutton
    Then Validate the HomePage

  #asMap()
  @Sce6
  Scenario: Enter the invalid username and password
    When Enter the userdata for Map
      | FirstName | Yuvaraj        |
      | LastName  | Sekar          |
      | Email     | test_One@gamil |
    #And Enter the passdata
    And Enter the loginbutton
    Then Validate the HomePage
