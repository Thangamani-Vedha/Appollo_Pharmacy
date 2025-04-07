@PersonalCare

Feature: User validates the product in the Apollo pharmacy application Personal care product

Scenario: Navigate to beauty
Given Launch the Apollo pharmacy Application "https://www.apollopharmacy.in/?srsltid=AfmBOoqy7LoyB7STzeABdcbQ3p8hGe1D1GMrC4-ANNi4JWhVJYVgKvE0"
When Validate user is on the home page
Then User mouse over to Personal care
And User clicks on Beauty
When Validate the user able to see the personal care related menu
Then User print the total item on web page
And User clicks on Add button in beauty
And User clicks on View Cart in beauty