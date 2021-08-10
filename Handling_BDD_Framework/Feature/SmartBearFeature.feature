#@SmartBearAutomation
Feature: SmartBear Automation Scenario 
Background: Common Script
Given Open the browser
@Smoke1
Scenario Outline: Check Login Functionality
When Navigate to the application "<url>"
When Enter username "<username>"
And Enter password "<password>"
And Click on SignIn
Then Check the SignIn Successfull
Examples:
|url|username|password|
|http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx|Tester|test|

@Smoke2
Scenario Outline: Check Order Functionality
Given Navigate to the application "<url>"
When Enter username "<username>"
And Enter password "<password>"
And Click on SignIn
Then Check the SignIn Successfull
When Click on Order
And Enter Product 
And Enter Quantity "<quantity>"
And Enter CustomerName "<customerName>"
And Enter Street "<street>"
And Enter City "<city>"
And Enter State "<state>"
And Enter Zip "<zip>"
And Enter Card "<card>"
And Enter CardNumber "<cardNumber>"
And Click on Process
Then Check Order Created
Examples:
|url|username|password|quantity|customerName|street|city|state|zip|card|cardNumber|
|http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx|Tester|test|1|Nayantara|JQPRoad|JQcITY|JQ|1203|1234|1234|

@Regression
Scenario Outline: Check Logout Functionality
When Navigate to the application "<url>"
When Enter username "<username>"
And Enter password "<password>"
And Click on SignIn
And Click on Logout
Examples:
|url|username|password|
|http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx|Tester|test|

@Regression
Scenario Outline: Check View All Products  Functionality
When Navigate to the application "<url>"
When Enter username "<username>"
And Enter password "<password>"
And Click on SignIn
And Click on View all products
Examples:
|url|username|password|
|http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx|Tester|test|

@Regression
Scenario Outline: Check View All Orders Functionality
When Navigate to the application "<url>"
When Enter username "<username>"
And Enter password "<password>"
And Click on SignIn
And Click on View all orders
Examples:
|url|username|password|
|http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx|Tester|test|


@DatatableScenario
Scenario: Check Multipledata 
When Navigate to the application url
|http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx|
When Enter username
|Roy|Puja|
|Toy|Tester|
And Enter password
|test|
And Click on SignIn

@OptimizedwayScenario
Scenario: Check for Optimation
When Navigate to the application url
|http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx|
Then verify Login is successful
|Tester|test|
When click on order
When submit the order
|1|Nayantara|JQPRoad|JQcITY|JQ|1203|1234|1234|
Then verify order is submited successfully