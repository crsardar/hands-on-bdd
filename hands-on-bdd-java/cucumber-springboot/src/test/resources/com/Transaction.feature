Feature: Test transactions

  Scenario Outline: Test Transaction.
    Given the <noOfTransactions>
    When called the getTransaction API
    Then it should return <expectedTransactions>

    Examples:
    |noOfTransactions |expectedTransactions|
    |5                |5                   |
    |10               |10                  |
    |11               |11                  |
