Feature: Test Feature

  Scenario Outline: Open Chrome Browser
    Given Open "Chrome" Browser and start google.com
    When I enter valid "<username>" and valid "<password>"
    Then User should be able to login successful
    
    Examples:
    	|UserName|Password|
    	|Test 1|Password 1|
    	|Test 2|Password 2|
    	|Test 3|Password 3|
    	
