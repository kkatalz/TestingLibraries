Feature: Addition

  Scenario Outline: Adding two numbers
    Given I have two numbers <num1> and <num2>
    When I add the numbers
    Then the result should be <result>

    Examples:
      | num1 | num2 | result |
      | 1    | 2    | 3      |
      | 2    | 3    | 5      |
      | 3    | 4    | 7      |
