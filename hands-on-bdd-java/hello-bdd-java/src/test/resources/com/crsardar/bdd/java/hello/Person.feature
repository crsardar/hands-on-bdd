Feature: Person


  Scenario: Listener is within range.
    // IntelliJ Plugin will NOT give correct example
    //step definitions for Custom Parameter types.

    Given Chittaranjan is located 15 metres from Shiva
    When Chittaranjan greets Shiva with "Ohm Namashiva!"
    Then Shiva replies "Tathas Tu!"
