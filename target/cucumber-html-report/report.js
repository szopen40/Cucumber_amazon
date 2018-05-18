$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("steps.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon Cart Test",
  "description": "",
  "id": "amazon-cart-test",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "Open browser and go to the webpage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "navigate to amazon page",
  "keyword": "Given "
});
formatter.match({
  "location": "Temporary.navigate_to_amazon_page()"
});
formatter.result({
  "duration": 8496536676,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Amazon cart addition test",
  "description": "",
  "id": "amazon-cart-test;amazon-cart-addition-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I go to Camera,Photo \u0026 Video",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Go to top rated products",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Add to cart third product five times",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I remember total cost of order",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "go to cart page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Compare total cost of product with value in cart",
  "keyword": "And "
});
formatter.match({
  "location": "Temporary.i_go_to_Camera_Photo_Video()"
});
formatter.result({
  "duration": 4808175515,
  "status": "passed"
});
formatter.match({
  "location": "Temporary.go_to_top_rated_products()"
});
formatter.result({
  "duration": 2486046531,
  "status": "passed"
});
formatter.match({
  "location": "Temporary.add_to_cart_third_product_five_times()"
});
formatter.result({
  "duration": 4543971820,
  "status": "passed"
});
formatter.match({
  "location": "Temporary.i_remember_total_cost_of_order()"
});
formatter.result({
  "duration": 2788549600,
  "status": "passed"
});
formatter.match({
  "location": "Temporary.go_to_cart_page()"
});
formatter.result({
  "duration": 39988341,
  "status": "passed"
});
formatter.match({
  "location": "Temporary.compare_total_cost_of_product_with_value_in_cart()"
});
formatter.result({
  "duration": 1053653200,
  "status": "passed"
});
});