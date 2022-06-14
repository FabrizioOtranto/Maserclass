Login valid credentials
Narrative:
In order to use al the functionalities on the webpage
As a user
I want to be able to log in

Scenario: login Scenario
Meta:
Given the user is on the login page
When the user enters valid username 'qs123@gmail.com' and password 'qs123'
Then the user is redirected to home page
