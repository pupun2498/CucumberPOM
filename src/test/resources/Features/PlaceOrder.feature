Feature: Place Order Function

Scenario: Search Item
Given User is on Homepage
When User search an "Apple"
Then should display search item results

Scenario: Add Item to Cart
Given should display search item results
When User add item to cart
Then Item must be available in cart  