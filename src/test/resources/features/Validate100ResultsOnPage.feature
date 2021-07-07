Feature: 100 Results on Page
  As a user
  I can scroll and see 100 results in a page
  So that I can scan through the instruments


  @Navigation
  Scenario: Validate 100 Results Displayed on a Page
    Given I navigate to the "live" app
    When I browse "Cryptocurrencies"
    Then I can see "100" results on the page