#author: Juan Salgado

Feature: Login
  As a business analyst,
  I want to be logged in with my credentials

  @SuccessfulLogin
  Scenario: Successful login
    Given "the user" gets to the login page
    When the correct credentials are written
    Then must be seen the home page

  @SegmentedFeature
  Scenario: Remember something
    Given "Pepito" wants to remember something
    When he tries to remember "Foo"
    Then he should get Foo

  @foo
  Scenario: Remember things 2
    Given "Pepito" wants to remember something