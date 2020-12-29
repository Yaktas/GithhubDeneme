$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/US23-Applicants_Info_Check.feature");
formatter.feature({
  "name": "System should allow to read all Applicants information",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US23_Check_All_Applicants_Info"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "use the Applicants api endpoint https:\"https://www.gmibank.com/api/tp-account-registrations\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.useTheApplicantsApiEndpointHttps(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get all Applicants inforamtion  as De-Serialization",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.get_all_Applicants_inforamtion_as_De_Serialization()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_001 read all Appliants your created and validate them from your data set",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US23_Check_All_Applicants_Info"
    },
    {
      "name": "@TC_001_AllApplicant\u0027sData"
    }
  ]
});
formatter.step({
  "name": "verify how many Applicants are",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verifyHowManyApplicantsAre()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "read all applicants\u0027s info",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.read_all_applicants_s_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "store all Applicant\u0027s information into a file",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.store_all_Applicant_s_information_into_a_file()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Applicants numbers",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_Applicants_numbers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify 5th,11th,55th,66th,77th,88th,99th  applicants id and ssn",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_5th_11th_55th_66th_77th_88th_99th_applicants_id_and_ssn()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC_002 readl all customers you created and validate them 1by 1",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TC_002_AllApplicant\u0027s_1by1"
    }
  ]
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s id \u003cid\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify   eleven Applicant\u0027s ssn \u003cssn\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s  firstName \u003cfirstName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s  lastName \u003clastName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s address \u003caddress\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s mobilePhoneNumber \u003cmobilePhoneNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s userId  \u003cuserId\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s userName \u003cuserName\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s  email ,\u003cemail\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "verify verify  eleven Applicant\u0027s \u003ccreateDate\u003e",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "id",
        "ssn",
        "firstName",
        "lastName",
        "address",
        "mobilePhoneNumber",
        "userId",
        "userName",
        "email",
        "createDate"
      ]
    },
    {
      "cells": [
        "1",
        "1",
        "1",
        "1",
        "1",
        "1",
        "1",
        "1",
        "1",
        "1"
      ]
    },
    {
      "cells": [
        "2",
        "2",
        "2",
        "2",
        "2",
        "2",
        "2",
        "2",
        "2",
        "2"
      ]
    },
    {
      "cells": [
        "3",
        "3",
        "3",
        "3",
        "3",
        "3",
        "3",
        "3",
        "3",
        "3"
      ]
    },
    {
      "cells": [
        "4",
        "4",
        "4",
        "4",
        "4",
        "4",
        "4",
        "4",
        "4",
        "4"
      ]
    },
    {
      "cells": [
        "5",
        "5",
        "5",
        "5",
        "5",
        "5",
        "5",
        "5",
        "5",
        "5"
      ]
    },
    {
      "cells": [
        "6",
        "6",
        "6",
        "6",
        "6",
        "6",
        "6",
        "6",
        "6",
        "6"
      ]
    },
    {
      "cells": [
        "7",
        "7",
        "7",
        "7",
        "7",
        "7",
        "7",
        "7",
        "7",
        "7"
      ]
    },
    {
      "cells": [
        "8",
        "8",
        "8",
        "8",
        "8",
        "8",
        "8",
        "8",
        "8",
        "8"
      ]
    },
    {
      "cells": [
        "9",
        "9",
        "9",
        "9",
        "9",
        "9",
        "9",
        "9",
        "9",
        "9"
      ]
    },
    {
      "cells": [
        "10",
        "10",
        "10",
        "10",
        "10",
        "10",
        "10",
        "10",
        "10",
        "10"
      ]
    },
    {
      "cells": [
        "11",
        "11",
        "11",
        "11",
        "11",
        "11",
        "11",
        "11",
        "11",
        "11"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "use the Applicants api endpoint https:\"https://www.gmibank.com/api/tp-account-registrations\"",
  "keyword": "Given "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.useTheApplicantsApiEndpointHttps(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get all Applicants inforamtion  as De-Serialization",
  "keyword": "Then "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.get_all_Applicants_inforamtion_as_De_Serialization()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_002 readl all customers you created and validate them 1by 1",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@US23_Check_All_Applicants_Info"
    },
    {
      "name": "@TC_002_AllApplicant\u0027s_1by1"
    }
  ]
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s id 1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_id(java.lang.Integer)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: It is not Equal expected:\u003c1252\u003e but was:\u003cnull\u003e\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\n\tat org.junit.Assert.assertEquals(Assert.java:118)\n\tat gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_id(US23_Applicants_Info_Check_API_StepDef.java:137)\n\tat ✽.verify  eleven Applicant\u0027s id 1(file:///Users/tasom/Documents/GMI_Project/GMI2_Project/GMI_NEW_/src/test/resources/features/US23-Applicants_Info_Check.feature:18)\n",
  "status": "failed"
});
formatter.step({
  "name": "verify   eleven Applicant\u0027s ssn 1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_ssn(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s  firstName 1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_firstName(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s  lastName 1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_lastName(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s address 1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_address(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s mobilePhoneNumber 1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_mobilePhoneNumber(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s userId  1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_userId(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s userName 1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_userName(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify  eleven Applicant\u0027s  email ,1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_eleven_Applicant_s_email(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify verify  eleven Applicant\u0027s 1",
  "keyword": "And "
});
formatter.match({
  "location": "gmiBank_team22.step_Definitions.US23_Applicants_Info_Check_API_StepDef.verify_verify_eleven_Applicant_s(java.lang.Integer)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshots");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
