Feature: Home page of application
Scenario: Home page Test 
    Given User on login page
    When  Enter "rohit" and "admin"
    Then Home page is diaplayed "ROHIT"
    And Success "true"
    
    Scenario: Home page Test 
    Given User on login page
    When  Enter "user1ID" and "user1password"
    Then Home page is diaplayed "Other user"
    And Success "false"
