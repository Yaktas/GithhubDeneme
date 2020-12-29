@US23_Check_All_Applicants_Info
Feature: System should allow to read all Applicants information

  Background:
    Given use the Applicants api endpoint https:"https://www.gmibank.com/api/tp-account-registrations"
    Then  Get all Applicants inforamtion  as De-Serialization

  @TC_001_AllApplicant'sData
  Scenario: TC_001 read all Appliants your created and validate them from your data set
    And verify how many Applicants are
    And read all applicants's info
    And store all Applicant's information into a file
    And verify Applicants numbers
    Then verify 5th,11th,55th,66th,77th,88th,99th  applicants id and ssn

  @TC_002_AllApplicant's_1by1
  Scenario Outline:TC_002 readl all customers you created and validate them 1by 1
    And  verify  eleven Applicant's id <id>
    And verify   eleven Applicant's ssn <ssn>
    And verify  eleven Applicant's  firstName <firstName>
    And verify  eleven Applicant's  lastName <lastName>
    And verify  eleven Applicant's address <address>
    And verify  eleven Applicant's mobilePhoneNumber <mobilePhoneNumber>
    And verify  eleven Applicant's userId  <userId>
    And verify  eleven Applicant's userName <userName>
    And verify  eleven Applicant's  email ,<email>
    And verify verify  eleven Applicant's <createDate>
    Examples:
      | id | ssn | firstName | lastName | address | mobilePhoneNumber | userId | userName | email | createDate|
      | 0  | 0   |     0     |   0      |   0     |       0           |  0     |   0      | 0    |    0       |






