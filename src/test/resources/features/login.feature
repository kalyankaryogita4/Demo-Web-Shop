Feature: Login functionality

Scenario: Valid login
Given user launches browser
When user clicks login link
And user enters valid email and password
And user clicks login button
Then user should login successfully

Scenario: Invalid login
Given user launches browser
When user clicks login link
And user enters invalid email and password
And user clicks login button
Then error message should be displayed