Feature: Application login
	
  @WebTest
  Scenario: Home page default login
    Given User  is on Netbanking login page
    When User enter his username "Test" and password "1234"
    Then User is on Netbanking home page
    And cards displayed are "true"
  
  @MobileTest
  Scenario: Home page default login
    Given User  is on Netbanking login page
    When User enter his username "Tester" and password "5678"
    Then User is on Netbanking home page
    And cards displayed are "false"
    
  @SmokeTest 
  Scenario: Home page default login
    Given User  is on Netbanking login page
    When User is signup with following details
    
    |Amol| Spinny.com|Amol@spinny.com|India|60658412|
    
    Then User is on Netbanking home page
    And cards displayed are "false"
    
    @RegTest
    Scenario Outline: Home page default login
    Given User  is on Netbanking login page
    When User login into application with username <Username> and password <Password>
    Then User is on Netbanking home page
    And cards displayed are "true"
    
    Examples:
    
    |Username|Password|
    |User1   | pass1  |
    |User2   | pass2  |
    |User3   | pass3  |
    |User4   | pass4  |
    |User5   | pass5  |
