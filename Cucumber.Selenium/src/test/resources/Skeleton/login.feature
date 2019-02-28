Feature: Login  feature
@valid
Scenario Outline: A valid Scenario
	Given The url of the login page
	When user enters <username> 
	And user masks <password> 
	Then user is <result>
	Examples:
	|username|password|result|
	|abc@email.com|abc123|admin|
	|xyz@email.com|xyz456|power| 
@invalid
Scenario Outline: A In valid Scenario
	Given The url of the login page
	When user enters <username> 
	And user masks <password> 
	Then user is <result>
	Examples:
	|username|password|result|
	|abc@email.com|abc123|admin|
	|xyz@email.com|xyz456|power| 