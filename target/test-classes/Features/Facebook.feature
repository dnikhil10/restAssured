Feature: Facebook setup and navigation feature.



    @Regression
    Scenario: User click on the create new account button
      Given user hits the facebook url
      Then user is displayed with "Log in to Facebook" title
      Given user is displayed with "create new account" button
      Then User clicks on the button.
