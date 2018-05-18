
Feature: Amazon Cart Test

  Background: Open browser and go to the webpage
    Given navigate to amazon page

  Scenario: Amazon cart addition test
    When I go to Camera,Photo & Video 
    And Go to top rated products
    And Add to cart third product two times
    Then I remember total cost of order
    And go to cart page
    And Compare total cost of product with value in cart
