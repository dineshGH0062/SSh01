Feature: Search for the various category should be possible along with product search
@hero
Scenario: User should be able to search for the product under the book category
Given I visit to the website as a guest user
When I select the book option from the search dropdown
And I click on search icon option
Then I should see the page having best book is getting displayed
But I should not see the other category


Scenario: User should be able to search for the product under the baby category
Given I visit the website as a guset user
When I select the baby option under the search dropdown
And I click on search option
Then I should see the baby products
 