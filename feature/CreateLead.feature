Feature: CreateLead Functionality of Leaftaps application

Scenario: CreateLead with muliple data
Given Launch the browser
And Load the url
And Enter the username as 'DemoCSR'
And Enter the password as crmsfa
When Click on the Login button
Then It should navigate to the next page
When Click on the CRMSFA link
And Click on the Leads link
And Click on the CreateLead link
And Enter the companyname as TestLeaf
And Enter the Firstname as Vineeth
And Enter the lastname as Rajendran
And Click on the CreateLead button