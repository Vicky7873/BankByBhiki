Feature: Change Password and Login

Scenario Outline: Enter incorrect Old Password 

Given open the url
Then enter the username
Then Enter the password
And click on loginButton
Then click on change password
And enter the Correct password
Then enter the "<new Password>" and "<confirm password>"
Then Click on submit Button
And Verify the popup "Password is changed"
Then user navigate to the Loginpage

Examples:
|new Password|confirm password|
|Bhiki@1234  |Bhiki@1234      |
