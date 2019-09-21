Feature: create a solution to automate the test cases below
	#Create an account using already registered email id test@test.com



Scenario Outline: Create an account using already registered email id test@test.com
	Given User access the Sign in form
	When User enters a Email address "<Email>"
	When User click on the create an account button
	Then the already been registered Error should be thrown

	Examples:
			| 	Email	       |
			| 	test@test.com  |



