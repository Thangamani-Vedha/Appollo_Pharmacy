@Babylotion

Feature: User validates the product in the Apollo pharmacy application Baby care product

Background: Navigate to baby lotion
Given Launch the Apollo pharmacy Application "https://www.apollopharmacy.in/?srsltid=AfmBOoqy7LoyB7STzeABdcbQ3p8hGe1D1GMrC4-ANNi4JWhVJYVgKvE0"
When Validate user is on the home page
Then User mouse over to Baby care
And User clicks on Baby lotions
When Validate the user able to see the baby care related menu
Then User print the total item on web page
And User clicks on Brand



#Scenario Outline: User validate the protect 
#And User clicks on sorted brand "<sort>"
#And User clicks on Add button 
#And User clicks on View Cart

#Examples:
#|sort							|
#|johnson & johnson|
#|mamaearth				|
#|aveeno						|


