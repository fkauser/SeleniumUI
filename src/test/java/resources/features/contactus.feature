Feature: create a solution to automate the test cases below
	#Send a message to Customer Service in the ‘Contact us’ section



Scenario Outline: Send a message to Customer Service in the ‘Contact us’ section
	Given User access the contact us form
	When User Selects a valid Subject "<Customer Service>"
	When User enters a valid Email address "<Email>"
	And User enters a valid Order reference "<OrderNo>"
	And User attaches a file
	And User enters comments
		|Thank you, your Products are great! | I need help with my order |
	When User click on the submit button
	Then the information should successfully be submitted via the contact us form

	Examples:
		| Customer Service	| 	Email	       | OrderNo	|
		| 2 				| 	test@test.com  | Ref123AB	|


