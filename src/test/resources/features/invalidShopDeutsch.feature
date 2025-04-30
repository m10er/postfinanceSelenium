
Feature: Add product to cart and validate checkout process

  Scenario: Add product, update quantity, verify total, and test order placement without checkbox
    Given the user navigates to homePage (deutsch)
    When the user clicks the "Add to cart" button below the product named "PAX A50s"
    And the user click add to card button
    And the user clicks on the "View cart" link
    And the user sets the product quantity to 4 on the Card
    And the user clicks the "Update cart" button
    When the user clicks the for paying "Proceed to checkout" button
    And the user fills in all required billing details
    And selects "Bank Transfer" as the payment option
    And clicks the "Place order" button
    Then a warning message should appear stating that the terms and conditions checkbox must be checked (deutsch)
