Feature: Account Creation in Salesforce application

Scenario: Account name verification in Salesforce application
Given Launch the browser and load the url
And Enter the username as vidyar@testleaf.com
And Enter the password as Sales@123
When Click on the Login button and It should navigate to the next page
When Click on the toggle menu
And Click on the View All
And Click on the Sales link from App launcher
And Click on the Accounts tab
And Click on the New button
And Enter your name as account name
And Select Ownership as Public
And Click the Save button
Then Verify the Account name