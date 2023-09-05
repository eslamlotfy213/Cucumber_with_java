Feature: Login funtionality 

Scenario Outline:: login with valid credential
 Given I am in the applicion
 When I enter valid credentials <username> and <password>
 Then I should be taken to the Overview page


Examples:
|username | password |
|"test1234" | "password" |
|"test1234" | "password" |