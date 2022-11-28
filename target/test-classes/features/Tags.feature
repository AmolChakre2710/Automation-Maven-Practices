Feature: Web Portal login test

Background:
	Given Validate browser is opening
	When Browser is triggered
	Then Broweser is opened successfully 
	
  @PortalTest
  Scenario: Home page default login
    Given User  is on Netbanking login page
    When User enter his username "Test" and password "1234"
    Then User is on Netbanking home page
    And cards displayed are "true"
  
  @PortalTest
  Scenario: Home laon page default login
    Given User  is on Netbanking login page
    When User enter his username "Tester" and password "5678"
    Then User is on Netbanking home page
    And cards displayed are "false"
  
  @PortalTest
  Scenario: Home page default login
    Given User  is on Netbanking login page
    When User is signup with following details
    
    |Amol| Spinny.com|Amol@spinny.com|India|60658412|
    
    Then User is on Netbanking home page
    And cards displayed are "false"
    
   @PortalTestt
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
  
