Feature: Greenkart order placing

@Seltest
Scenario: Search for vegetables and validate order
Given User is on Greenkart home page
When User search for "cucumber"
Then "cucumber" details are displayed