Feature: Test transaction history

  Scenario: Test daily total transaction.
    Given User as Chitta
    When Daily transactions are
      |transactions|
      |111        |
      |15.5       |
      |735        |
    Then Total transaction amount should be 861.5.

