@CE
Feature: Clear data

  @CE_TC_001
  Scenario Outline: Verification of CE function
    Given Launch the application
    And Check the presence of CE sign
    And Enter any number
    And Perform the CE operation

  @CE_TC_001
  Scenario Outline: Verification of CE function
    Given Launch the application
    And Check the presence of CE sign
    And Enter any special character
    And Perform the CE operation
 
 
  @CE_TC_001
  Scenario Outline: Verification of CE function for negative scenario
    Given Launch the application
    And Check the presence of CE sign
    And Perform the CE operation
