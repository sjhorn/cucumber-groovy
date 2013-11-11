Feature: Test some wikipedia
  
  Demonstrate a simple test case on wikipedia.org
  

  Scenario: Test Algorithms search
    Given I am on the wikipedia home page
    When I search for "algorithms"
    Then I should see the title Algorithms and the heading Algorithms

  Scenario: Test wotif search
    Given I am on the wikipedia home page
    When I search for "wotif"
    Then I should see the title Wotif.com and the heading Wotif.com
    
 
