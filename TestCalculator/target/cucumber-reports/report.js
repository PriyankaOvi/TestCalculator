$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Subtraction.feature");
formatter.feature({
  "line": 2,
  "name": "Subtraction",
  "description": "",
  "id": "subtraction",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Subtract"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verification of positive scenario of subtraction function",
  "description": "",
  "id": "subtraction;verification-of-positive-scenario-of-subtraction-function",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Sub_TC_001"
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
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "subtraction;verification-of-positive-scenario-of-subtraction-function;",
  "rows": [
    {
      "cells": [
        "number_1",
        "number_2",
        "expected"
      ],
      "line": 10,
      "id": "subtraction;verification-of-positive-scenario-of-subtraction-function;;1"
    },
    {
      "cells": [
        "3",
        "2",
        "1"
      ],
      "line": 11,
      "id": "subtraction;verification-of-positive-scenario-of-subtraction-function;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 75804340630,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verification of positive scenario of subtraction function",
  "description": "",
  "id": "subtraction;verification-of-positive-scenario-of-subtraction-function;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Sub_TC_001"
    },
    {
      "line": 1,
      "name": "@Subtract"
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
  "name": "Perform the subtraction of \"3\" and \"2\" equals to \"1\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Calculator.open_the_Firefox_and_launch_the_application()"
});
formatter.result({
  "duration": 34975390676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 28
    },
    {
      "val": "2",
      "offset": 36
    },
    {
      "val": "1",
      "offset": 50
    }
  ],
  "location": "Calculator.subtraction(String,String,String)"
});
formatter.result({
  "duration": 197940481,
  "status": "passed"
});
formatter.after({
  "duration": 2212858,
  "status": "passed"
});
});