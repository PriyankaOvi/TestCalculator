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
  "name": "Check the presence of minus sign",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Perform the subtraction of \"\u003cnumber_1\u003e\" and \"\u003cnumber_2\u003e\" equals to \"\u003cexpected\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
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
      "line": 11,
      "id": "subtraction;verification-of-positive-scenario-of-subtraction-function;;1"
    },
    {
      "cells": [
        "3",
        "2",
        "1"
      ],
      "line": 12,
      "id": "subtraction;verification-of-positive-scenario-of-subtraction-function;;2"
    }
  ],
  "keyword": "Examples"
});
