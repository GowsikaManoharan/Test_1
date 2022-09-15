Feature: Testing

Scenario Outline: Scenarios Testing 
Given Set configuration "<us>"
When open Chrome Browser
Then Launch Google
And validate title
Examples:
|us|
|UA|

