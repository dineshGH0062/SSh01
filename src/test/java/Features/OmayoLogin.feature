Feature: Login to the omayo application

Scenario Outline: User should only be able to login with valid credentials
Given I navigate to application URL
When I enter user name as "<username>" and password as "<password>" into the filed
And I click on login button
Then User should be able to login based on "<status>" login status
Examples:
|username|password|status|
|Dinesh  |kumar   |Failed|
|SeleniumByArun|Test143$|Passed|
|test    |1234    |Failed| 