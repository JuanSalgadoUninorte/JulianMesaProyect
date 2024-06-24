#author: Juan Salgado

Feature: Login
  As a business analyst,
  I want to be logged in with my credentials

  @dev
  Scenario: Successful login 5
    Given "Pepito" has a token

  @dev1
  Scenario: Failed 1
    Given "Pepito" failed 1

  @dev1
  Scenario: Failed 2
    Given "Pepito" failed 2

  @dev1
  Scenario: Compromised
    Given "Pepito" compromised