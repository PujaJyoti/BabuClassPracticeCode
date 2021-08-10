#@FlipkartAutomation
Feature: Flipkart Automation Scenario 
@Smoke1
Scenario Outline: Check Login Functionality
Given Open the browser
And Navigate to the flipkart application "<url>"
When Enter email for Filpkart "<username>"
And Enter password for Flipkart "<password>"
And Click on Flipkart SignIn

Examples:
|url|username|password|
|https://affiliate.flipkart.com/login|a1.pujajyoti@gmail.com|Patna@12|

@Smoke2
Scenario: Check Login Functionality
Given Open the browser
And Navigate to the Flipkart application url
When Click on ForgotPassword
And Enter Flipkart emailid
And Click on Flipkart Submitbutton



