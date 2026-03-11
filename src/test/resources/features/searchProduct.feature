Feature: Search Product Functionality

Scenario: Search for a valid product
Given user launches browser
When user enters product name in search box
And user clicks search button
Then product should be displayed in search result

Scenario: Search with invalid product
Given user launches browser
When user enters invalid product name
And user clicks search button
Then no product message should be displayed