# TestCalculator

TestCalculator is BDD cucumber driven framework and it is build with POM pattern.Features of this framework are as below :
  - Framework is having different feature file for each function to be test
  - Cucumber html reporting
  - Logger implementation with diffrent logger levels
  - Driver manager class for driver initialisation as per browser
  - Actions class to incorporate all the required selenium actions
  - Data driven approach followed with scenario outline.
  

# How to build or run ?

  1. Runner File - Run.java
    User need to enter tag of testcase to be executed in runner file.Tags should be unique for each test case . If same tag is given to all or multiple test cases then all the matching testcases will get executed.
    Run run.java file as junit.
  2. Using feature file .
    Click on any test scenario and execute it as cucumber test.

# TestCalculator