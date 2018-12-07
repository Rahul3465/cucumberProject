$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End_to_End.feature");
formatter.feature({
  "line": 1,
  "name": "Automated End2End Tests",
  "description": "",
  "id": "automated-end2end-tests",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2593681349,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Customer place an order by purchasing an item from search",
  "description": "",
  "id": "automated-end2end-tests;customer-place-an-order-by-purchasing-an-item-from-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "moves to checkout from mini cart",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 5367364463,
  "status": "passed"
});
formatter.match({
  "location": "CartPageSteps.choose_to_buy_the_first_item()"
});
formatter.result({
  "duration": 8417548190,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageSteps.moves_to_checkout_from_mini_cart()"
});
formatter.result({
  "duration": 5134885712,
  "status": "passed"
});
formatter.after({
  "duration": 62500,
  "status": "passed"
});
});