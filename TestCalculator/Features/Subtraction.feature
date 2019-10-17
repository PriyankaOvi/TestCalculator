@Subtract
Feature: Subtraction

  @Sub_TC_001
  Scenario Outline: Verification of positive scenario of subtraction function
    Given Launch the application
    And Perform the subtraction of "<number_1>" and "<number_2>" equals to "<expected>"

    Examples: 
      | number_1 | number_2 | expected |
      |      100 |       20 |       80 |
      |       20 |       25 |       -5 |
      |       -1 |       20 |      -21 |
      |        1 |      -20 |       21 |

  @Sub_TC_002
  Scenario Outline: Verification of negative scenario for subtraction function
    Given Launch the application
    And Perform the subtraction of "<number_1>" and "<number_2>"

    Examples: 
      | number_1 | number_2 | expected |
      |        1 | #        | NA       |
      | *        |        2 | NA       |
      | *        | %        | NA       |

  @Sub_TC_003
  Scenario Outline: Verification of boundary cases for subtraction functionality                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    SD ECXDSW
    Given Launch the application
    And Perform the subtraction of "<number_1>" and "<number_2>"

    Examples: 
      | number_1                                       | number_2                                             | expected                                 |
      |                                              0 | 999999999999999999999999999999999999999999999999.... |                                        0 |
      | 99999999999999999999999999999999999.....       |                                                    0 | 99999999999999999999999999999999999..... |
      | 99999999999999999999999999999999999999999..... | 99999999999999999999999999999999999.....             |                                        0 |
      |                                              0 |                                                    0 |                                        0 |
      |                                             -1 |                                                   -1 |                                        0 |
