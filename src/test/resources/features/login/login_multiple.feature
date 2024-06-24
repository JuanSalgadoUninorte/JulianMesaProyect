#author: Juan Salgado

Feature: Login
  As a business analyst,
  I want to be logged in with my credentials

  @suite1
  Scenario: Successful login
    Given "the user" gets to the login page
    When the correct credentials are written
    Then must be seen the home page

  @suite2
    Scenario: Successful login
      Given "the user" gets to the login page
      When the correct credentials are written
      Then must be seen the home page

  @suite3
    Scenario: Successful login
      Given "the user" gets to the login page
      When the correct credentials are written
      Then must be seen the home page

  @suite4
    Scenario: Successful login
      Given "the user" gets to the login page
      When the correct credentials are written
      Then must be seen the home page