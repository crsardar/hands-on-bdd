Feature: Person


  Scenario: Listener is within range
    Given Chittaranjan is located 15 metres from Shiva
    When Chittaranjan greets Shiva with "Ohm Namashiva!"
    Then Shiva replies "Tathas Tu!"
