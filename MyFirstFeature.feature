Feature: User log in creation 

Scenario: Validate first name field 

Given user is in facebook log in page 
When User enters users first name 
Then First name is reflected in the userts first name field

Scenario: Validate surname field and mobile number field 
Given user is in facebook log in page 
When User enters users first name 
And User enters surname 
Then First name is reflected in the userts first name field
And User checks users surnmae is present 
And User checks the mobile number filed is empty 