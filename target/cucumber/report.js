$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contactus.feature");
formatter.feature({
  "line": 1,
  "name": "create a solution to automate the test cases below",
  "description": "",
  "id": "create-a-solution-to-automate-the-test-cases-below",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#Send a message to Customer Service in the ‘Contact us’ section"
    }
  ],
  "line": 6,
  "name": "Send a message to Customer Service in the ‘Contact us’ section",
  "description": "",
  "id": "create-a-solution-to-automate-the-test-cases-below;send-a-message-to-customer-service-in-the-‘contact-us’-section",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User access the contact us form",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Selects a valid Subject \"\u003cCustomer Service\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters a valid Email address \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters a valid Order reference \"\u003cOrderNo\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User attaches a file",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters comments",
  "rows": [
    {
      "cells": [
        "Thank you, your Products are great!",
        "I need help with my order"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the information should successfully be submitted via the contact us form",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "create-a-solution-to-automate-the-test-cases-below;send-a-message-to-customer-service-in-the-‘contact-us’-section;",
  "rows": [
    {
      "cells": [
        "Customer Service",
        "Email",
        "OrderNo"
      ],
      "line": 18,
      "id": "create-a-solution-to-automate-the-test-cases-below;send-a-message-to-customer-service-in-the-‘contact-us’-section;;1"
    },
    {
      "cells": [
        "2",
        "test@test.com",
        "Ref123AB"
      ],
      "line": 19,
      "id": "create-a-solution-to-automate-the-test-cases-below;send-a-message-to-customer-service-in-the-‘contact-us’-section;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7254759700,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Send a message to Customer Service in the ‘Contact us’ section",
  "description": "",
  "id": "create-a-solution-to-automate-the-test-cases-below;send-a-message-to-customer-service-in-the-‘contact-us’-section;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User access the contact us form",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Selects a valid Subject \"2\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters a valid Email address \"test@test.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enters a valid Order reference \"Ref123AB\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User attaches a file",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters comments",
  "rows": [
    {
      "cells": [
        "Thank you, your Products are great!",
        "I need help with my order"
      ],
      "line": 13
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click on the submit button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the information should successfully be submitted via the contact us form",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactUsSteps.userAccessTheContactUsForm()"
});
formatter.result({
  "duration": 9169881500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 30
    }
  ],
  "location": "ContactUsSteps.userSelectsAValidSubject(String)"
});
formatter.result({
  "duration": 495368300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 35
    }
  ],
  "location": "ContactUsSteps.userEntersAValidEmailAddress(String)"
});
formatter.result({
  "duration": 467524600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ref123AB",
      "offset": 37
    }
  ],
  "location": "ContactUsSteps.userEntersAValidOrderReference(String)"
});
formatter.result({
  "duration": 412022700,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.userAttachesAFile()"
});
formatter.result({
  "duration": 95539000,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.userEntersComments(DataTable)"
});
formatter.result({
  "duration": 645649200,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.userClickOnTheSubmitButton()"
});
formatter.result({
  "duration": 1706505100,
  "status": "passed"
});
formatter.match({
  "location": "ContactUsSteps.theFormSubmitted()"
});
formatter.result({
  "duration": 128548000,
  "status": "passed"
});
formatter.after({
  "duration": 951046300,
  "status": "passed"
});
formatter.uri("signin.feature");
formatter.feature({
  "line": 1,
  "name": "create a solution to automate the test cases below",
  "description": "",
  "id": "create-a-solution-to-automate-the-test-cases-below",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#Create an account using already registered email id test@test.com"
    }
  ],
  "line": 6,
  "name": "Create an account using already registered email id test@test.com",
  "description": "",
  "id": "create-a-solution-to-automate-the-test-cases-below;create-an-account-using-already-registered-email-id-test@test.com",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User access the Sign in form",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters a Email address \"\u003cEmail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on the create an account button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the already been registered Error should be thrown",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "create-a-solution-to-automate-the-test-cases-below;create-an-account-using-already-registered-email-id-test@test.com;",
  "rows": [
    {
      "cells": [
        "Email"
      ],
      "line": 13,
      "id": "create-a-solution-to-automate-the-test-cases-below;create-an-account-using-already-registered-email-id-test@test.com;;1"
    },
    {
      "cells": [
        "test@test.com"
      ],
      "line": 14,
      "id": "create-a-solution-to-automate-the-test-cases-below;create-an-account-using-already-registered-email-id-test@test.com;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5742736800,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Create an account using already registered email id test@test.com",
  "description": "",
  "id": "create-a-solution-to-automate-the-test-cases-below;create-an-account-using-already-registered-email-id-test@test.com;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User access the Sign in form",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters a Email address \"test@test.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click on the create an account button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the already been registered Error should be thrown",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.userAccessTheSignInForm()"
});
formatter.result({
  "duration": 16031532600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@test.com",
      "offset": 29
    }
  ],
  "location": "SignInSteps.userEntersAEmailAddress(String)"
});
formatter.result({
  "duration": 449283700,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.userClickOnTheCreateAnAccountButton()"
});
formatter.result({
  "duration": 326690200,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.theAlreadyBeenRegisteredErrorShouldBeThrown()"
});
formatter.result({
  "duration": 745616800,
  "status": "passed"
});
formatter.after({
  "duration": 990999400,
  "status": "passed"
});
});