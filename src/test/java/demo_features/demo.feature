Feature: Home loan login

 Scenario: Homeloan page default login
    Given User  is on homeloan login page
    When User login with following details
    
    | Rahul | abcd | rahul@abcd.com | Australia |1230569|
    Then User is on homeloan home page
    And Home loan are "false"

