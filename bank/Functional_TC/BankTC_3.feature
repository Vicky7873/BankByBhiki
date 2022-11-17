Feature: Login Functionality

Scenario Outline:: Valid User Name and Valid Password
Given open the url
 Then enter the username "<username>"
 Then Enter the password "<password>"
 And click on loginButton
 Then Verify the popup
 
 Examples:
 |username  |password|
 |mngr454831|Eqyvyre |
 |mngr45831 |Eqyvyre |
 |mngr454831|Eqbbyre |
 |mngr400831|E00vyre |
 