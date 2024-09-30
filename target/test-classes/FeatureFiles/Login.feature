Feature: Sorting and Checkout functionality on the All Items page

  Background:
    Given user on login page
    When user enter the valid "standard_user" and "secret_sauce"
    And click on login button
    Then user on Home Page
@sortingtheItem
Scenario Outline: Verify sorting order displayed for Z-A on the All Items page
    When user selects the "Name (Z to A)" sorting option
    Then the items should be displayed in descending alphabetical order
    @verifyPrice
    Scenario: Verify price sorting from high to low
    When I sort the products by Price "Price (high to low)"
    Then I should see products sorted by descending price
  
@addtocart
  Scenario: Add multiple items to cart and complete checkout
    When I add multiple products to the cart
    And I proceed to checkout
    Then I should complete the checkout journey successfully
    
Examples:
  | username      | password     |
  | standard_user | secret_sauce |
  
  


     
