Feature: Login Functionality

Background:
Given open the url

Scenario Outline: Valid User Name and Valid Password
 Then enter the username "<username>"
 Then Enter the password "<password>"
 And click on loginButton
 Then verify the MangersID

 
 Examples:
 |username  |password|
 |mngr454831|Bhiki@123 |
 
 Scenario Outline: set of InValid User Name and InValid Password
 Then enter the username "<username>"
 Then Enter the password "<password>"
 And click on loginButton
 Then Verify the popup
 
 Examples:
 |username  |password|
 |mngr45831 |Eqyvyre |
 |mngr454831|Eqbbyre |
 |mngr400831|E00vyre |