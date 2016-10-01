Feature: Turnstile Finite State Machine
  Implementing Uncle Bob's Turnstile Kata using State Pattern

  Scenario: A passenger inserts a coin to the turnstile
    Given the turnstile is locked
    When a passenger inserts a coin
    Then the passenger should be able to pass through

  Scenario: A passenger inserts another coin as a tip
    Given the turnstile is unlocked
    When a passenger inserts a coin
    Then the passenger should be able to pass through
    And a thank you prompt is displayed

  Scenario: A passenger tries to pass through the turnstile without inserting a coin
    Given the turnstile is locked
    When a passenger passes through
    Then the turnstile is locked
    And sound the alarm

  Scenario: A passenger passes through an unlocked turnstile
    Given the turnstile is unlocked
    When a passenger passes through
    Then the turnstile is locked

