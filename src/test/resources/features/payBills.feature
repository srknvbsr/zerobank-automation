Feature: Pay Bills Checks

  Background:

    Given User is on the zeroBank page
    When Tap on signIn button
    When Enter valid credentials and tap on signIn button
    When Tap on back button
    When Tap on "Online Banking" section
    When Tap on "Pay Bills" menu

    @PayBillsPositiveTest
  Scenario: Positive Pay Bills Test
      Then Validate that user is on the pay bills page
      When User send "50" amount to input box
      When User send "2023-08-04" date to input box
      When User sends "Test" data to input box
      When User taps on Pay button
      Then Validate that success message is visible

  @PayBillsNegativeTest
  Scenario: Negative Pay Bills Test(empty amount)
    When User send "2023-08-04" date to input box
    When User taps on Pay button






