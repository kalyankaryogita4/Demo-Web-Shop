Feature: User Registration

Scenario: Successful user registration
Given user launches demo web shop website
When user clicks register link
And user enters registration details
And user clicks register button
Then user should see registration successful message