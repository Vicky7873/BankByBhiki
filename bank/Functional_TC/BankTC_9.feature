Feature: Add New Customer & Account

  Scenario Outline: Verify after Adding New Customer, page redirects to details of added customer
  
    Given open the url
     Then enter the username
     Then Enter the password
      And click on loginButton
     Then click on Add customer "<Customer Name>","<Address>","<City>","<State>","<PIN>","<Mobile Number>","<E-mail>","<Password>"
     Then Add the required fields
     Then click on Submit
    Examples: 
      | Customer Name | Address | City    | State  | PIN    | Mobile Number | E-mail          | Password   | 
      | Vikram        | Jamnagr | Khordha | Odisha | 112200 | 9861644158    | vicky@gmail.com | Bhiki@1234 | 