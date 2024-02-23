Feature: BookCart Application tests
Scenario: Login should be success
Given User navigates to the Bookcart Application
And User Clicks on the Login Button
And User enters username as mukuljha302
And enters password as Pass1234
When User Clicks on the login button
Then Login should be success

Scenario: 
Login should not be success
Given User navigates to the Bookcart Application
And User Clicks on the Login Button
And User enters username as mukuljha30
And enters password as Pass123
When User Clicks on the login button
But Login should fail


