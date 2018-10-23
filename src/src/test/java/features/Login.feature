Feature: LeafTaps Automation

Background: Login
Given Launch the browser
And maximize the browser
And load the URL

@Login
Scenario: Login to leaftaps
And Enter username as DemoSalesManager
And Enter pass as crmsfa
Then click login button

@CreateLead
Scenario Outline: CreateLaed
And Enter username as <uname>
And Enter pass as <psw>
Then click login button
And click crmsfa
And click leads
And click createlead
And type firstname as <fname>
And type companyname as <Cname>
And type lastname as <lname>
When click create
Then verify created
Then close browser

Examples:
|uname|psw|fname|Cname|lname|
|DemoSalesManager|crmsfa|Bala|TL|Ji|
|DemoCSR|crmsfa|Hi|TL|All|

@EditLead
Scenario Outline: EditLead
And Enter username as <uname>
And Enter pass as <psw>
Then click login button
And click crmsfa
And click leads
And click findLeads
And typeleadname as <leadname>
And clickFind
And clickfirstid
And getConame
And clickedit
And clearandtypeCname as <Coname>
When clickupdate
Then updatedname
Then close browser

Examples:
|uname|psw|leadname|Coname|
|DemoSalesManager|crmsfa|Gopi|dsfafdsfdsf|

@MergeLead
Scenario Outline: MergeLead
And Enter username as <uname>
And Enter pass as <psw>
Then click login button
And click crmsfa
And click leads
And click mergeLeads
And click fromimg
And move to window1
And type from name as <fromname>
And clkfind
And get firstid
And clickfirstResid
And move to window0
And click toimg
And type to name as <toname>
And get secondid
And clicksecid
And click merge
And handle alert
And click findLeads
And type id
Then getResult

 

Examples:
|unmae|psw|fromname|toname|
|DemoSalesManager|crmsfa|gopi|lakshmi|







#Feature: LeafTaps Automation
#
#
#
#Background: User Browser Lanuch
#Given Lanuch the Browser
#And maximize Browser
#And Set timeOut
#And Load the url
#
#@reg
#Scenario: Login into DemoCSR11
#And Enter userName as DemoCSR11
#And Enter password as crmsfa11
#When Click Login Button
#But Verify DemoCSR11
#
#@Smoke
#Scenario Outline: Login into DemosalesManager
#And Enter userName as <userName>
#And Enter password as <password>
#When Click Login Button
#Examples:
#|userName|password|
#|DemosalesManager|crmsfa|
#|DemoCSR|crmsfa|
#
#@CucumberWithPom
#Scenario Outline: Login and Create Lead With CucumberWithPOM
#And Give userName as <Name>
#And Give password as <pass>
#When Click Button
#And Click CRMSFA Cucumber
#And Click Leads Cucumber
#And Click CreateLead Cucumber
#And Give CopmanyName Cucumber as <compyName>
#And Give FirstName Cucumber as <firstName>
#And Give LastName Cucumber as <lastName>
#And Click SubmitBtn Cucumber
#Examples:
#|Name|pass|compyName|firstName|lastName|
#|DemosalesManager|crmsfa|TestLeaf Cucumber|CucumberFirstName|CucumberLastName|
#
#@Add
#Scenario Outline: Login and Create Lead
#And Enter the UserName
#And Enter the Password
#When Click Login Button
#And Click CRMSFA
#And Click Leads
#And Click CreateLead
#And Give CopmanyName
#And Give FirstName
#And Give LastName
#And Give GmailId as <mail>
#And Click SubmitBtn
#Examples:
#|mail|
#|abc@gmail.com|
#
#@Edit
#Scenario Outline: Edit Lead
#And Enter userName as <userName>
#And Enter password as <password>
#When Click Login Button
#And Click CRMSFA
#And Click Leads
#And Click findLead
#And Click Email
#And Enter Email as <email>
#And Click FindLeadsBtn
#And Click EditRecord
#And Click EditBtn
#And Clear CompanyName
#And Edit Company Name as <editCmpyName>
#And Click SubmitBtn
#Examples:

