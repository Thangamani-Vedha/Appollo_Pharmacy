$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri(".\\src\\test\\resources\\feature\\personalcare.feature");
formatter.feature({
  "name": "User validates the product in the Apollo pharmacy application Personal care product",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@PersonalCare"
    }
  ]
});
formatter.scenario({
  "name": "Navigate to beauty",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@PersonalCare"
    }
  ]
});
formatter.embedding("image/png", "embedded0.png");
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Apollo pharmacy Application \"https://www.apollopharmacy.in/?srsltid\u003dAfmBOoqy7LoyB7STzeABdcbQ3p8hGe1D1GMrC4-ANNi4JWhVJYVgKvE0\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BabyLotion1.launch_the_apollo_pharmacy_application(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate user is on the home page",
  "keyword": "When "
});
formatter.match({
  "location": "BabyLotion1.validate_user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User mouse over to Personal care",
  "keyword": "Then "
});
formatter.match({
  "location": "PersonalCare.user_mouse_over_to_Personal_care()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Beauty",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalCare.user_clicks_on_Beauty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the user able to see the personal care related menu",
  "keyword": "When "
});
formatter.match({
  "location": "PersonalCare.validate_the_user_able_to_see_the_personal_care_related_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User print the total item on web page",
  "keyword": "Then "
});
formatter.match({
  "location": "BabyLotion1.user_print_the_total_item_on_web_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Add button in beauty",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalCare.user_clicks_on_Add_button_in_beauty()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on View Cart in beauty",
  "keyword": "And "
});
formatter.match({
  "location": "PersonalCare.user_clicks_on_View_Cart_in_beauty()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
});