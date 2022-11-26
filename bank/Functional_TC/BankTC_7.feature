Feature: Change Password and Login

Scenario Outline: Enter incorrect Old Password 

Given open the url
Then enter the username
Then Enter the password
And click on loginButton
Then click on change password
And enter the "<wrong password>"
Then enter the "<new Password>" and "<confirm password>"
Then Click on submit Button
And Verify the popup "Old password is incorrect"

Examples:
|wrong password|new Password|confirm password|
|abcd456jsdfh  |Bhiki@123   |Bhiki@123       |
