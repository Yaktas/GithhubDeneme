@US23_ReadAllApplicants
Feature: System should allow to read all Applicants information

  Background:
    Given use the api endpoint https:"https://www.gmibank.com/api/tp-account-registrations"
    Then  Get all data deserialized into Java

  @TC_001_AllApplicant'sData
  Scenario: Verify to be able read all Applicant's data
    And write all Applicant's information into a file
    Then validate all Aplicant's "ssn"
    Then validate all Aplicant's "userName"

  @TC_002_AllApplicant's_1by1
  Scenario Outline:TC_002 verify Single Applicant's data
    And  verify first Applicant's id <id>
    And verify second Applicant's ssn "<ssn>"
    And verify third Applicant's firstName "<firstName>"
    And verify fourth Applicant's lastName "<lastName>"
    And verify fifth Applicant's address "<address>"
    And verify sixth Applicant's mobilePhoneNumber "<mobilePhoneNumber>"
    And verify seventh Applicant's userId  <userId>
    And verify eighth Applicant's userName "<userName>"
    And verify nineth Applicant'semail  "<email>"
    Then verify tenth Applicant's createDate "<createDate>"
    Examples:
      | id | ssn       | firstName | lastName | address | mobilePhoneNumber             | userId   | userName          | email                | createDate             |
      |1251|123-45-4343|example    |example   |USA      |123-344-3432                   |  1201    |example            |example@dsadsad.com   |2020-10-07T22:36:30.191Z|
      |1252|124-45-3422|firstuser  |firstuser |US       |345-342-3423                   |1202      |firstuser          |firstuser@dsadsad.com |2020-10-07T22:47:54.927Z|

