$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Subtraction.feature");
formatter.feature({
  "line": 2,
  "name": "Reset functionality on login page of Application",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verification of positive scenario of subtraction function",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-positive-scenario-of-subtraction-function",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC_001_Sub"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Perform the subtraction of \"\u003cnumber_1\u003e\" and \"\u003cnumber_2\u003e\" equals to \"\u003cexpected\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-positive-scenario-of-subtraction-function;",
  "rows": [
    {
      "cells": [
        "number_1",
        "number_2",
        "expected"
      ],
      "line": 10,
      "id": "reset-functionality-on-login-page-of-application;verification-of-positive-scenario-of-subtraction-function;;1"
    },
    {
      "cells": [
        "100",
        "20",
        "80"
      ],
      "line": 11,
      "id": "reset-functionality-on-login-page-of-application;verification-of-positive-scenario-of-subtraction-function;;2"
    },
    {
      "cells": [
        "20",
        "25",
        "-5"
      ],
      "line": 12,
      "id": "reset-functionality-on-login-page-of-application;verification-of-positive-scenario-of-subtraction-function;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Verification of positive scenario of subtraction function",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-positive-scenario-of-subtraction-function;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC_001_Sub"
    },
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Perform the subtraction of \"100\" and \"20\" equals to \"80\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Calculator.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 31025311824,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 28
    },
    {
      "val": "20",
      "offset": 38
    },
    {
      "val": "80",
      "offset": 53
    }
  ],
  "location": "Calculator.subtraction(String,String,String)"
});
formatter.result({
  "duration": 6085861,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verification of positive scenario of subtraction function",
  "description": "",
  "id": "reset-functionality-on-login-page-of-application;verification-of-positive-scenario-of-subtraction-function;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@TC_001_Sub"
    },
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Perform the subtraction of \"20\" and \"25\" equals to \"-5\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Calculator.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 13486274097,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 28
    },
    {
      "val": "25",
      "offset": 37
    },
    {
      "val": "-5",
      "offset": 52
    }
  ],
  "location": "Calculator.subtraction(String,String,String)"
});
formatter.result({
  "duration": 391560,
  "status": "passed"
});
});