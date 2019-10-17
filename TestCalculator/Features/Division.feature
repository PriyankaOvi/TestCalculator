@Division
Feature: Division 

@Div_TC_001
Scenario Outline: Verification of positive scenario of division function 
Given Launch the application			
And Perform the division of "<number_1>" and "<number_2>" equals to "<expected>"

Examples:
      | number_1 | number_2        | expected|
      | 100 | 20    |5|
      | 20 | 20 |1|


@Div_TC_002 
Scenario Outline: Verification of negative scenario for division function 
Given Launch the application			
And Perform the division of "<number_1>" and "<number_2>" 

Examples:
      | number_1 | number_2        |expected|
      | 1 | #     |NA|
      | *  | 2 |NA|
      |*|%|NA|



@Div_TC_003
Scenario Outline: Verification of boundary cases for division functionality                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    SD ECXDSW
 
Given Launch the application			
And Perform the division of "<number_1>" and "<number_2>" 

Examples:
      | number_1 | number_2        |expected|
      | 0 | 999999999999999999999999999999999999999999999999....     |0|
      | 99999999999999999999999999999999999.....  | 0 |99999999999999999999999999999999999.....|
      |99999999999999999999999999999999999999999.....|99999999999999999999999999999999999.....|1|
      |0|0|0|
      |-1|-1|1|

 