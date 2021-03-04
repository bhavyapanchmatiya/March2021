$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/FeatureFile/Registration.feature");
formatter.feature({
  "line": 2,
  "name": "As a User, I want to Register so I can use all the facilities www.NopCommerce.com.",
  "description": "",
  "id": "as-a-user,-i-want-to-register-so-i-can-use-all-the-facilities-www.nopcommerce.com.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NopCommerce"
    },
    {
      "line": 1,
      "name": "@test3"
    }
  ]
});
formatter.before({
  "duration": 8367361500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User Should be able to go on Register page and enter mandatory details and see the registration successful message.",
  "description": "",
  "id": "as-a-user,-i-want-to-register-so-i-can-use-all-the-facilities-www.nopcommerce.com.;user-should-be-able-to-go-on-register-page-and-enter-mandatory-details-and-see-the-registration-successful-message.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Homepage and click register.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter Registration Details and click Register",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should see the message “Your Registration Completed.”",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userIsOnHomepageAndClickRegister()"
});
formatter.result({
  "duration": 1942930900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.enterRegistrationDetailsAndClickRegister()"
});
formatter.result({
  "duration": 6964629500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldSeeTheMessageYourRegistrationCompleted()"
});
formatter.result({
  "duration": 12779000,
  "status": "passed"
});
formatter.after({
  "duration": 161800,
  "status": "passed"
});
});