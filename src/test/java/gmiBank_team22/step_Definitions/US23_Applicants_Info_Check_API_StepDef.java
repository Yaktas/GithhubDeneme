package gmiBank_team22.step_Definitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.pojo.Applicants;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;

public class US23_Applicants_Info_Check_API_StepDef<applicantsMap> {

    Response response;
    ObjectMapper object;
    JsonPath jp;
    Applicants[] allapplicants;
    List<Object> applicantsMap;
    List<Object> allApplicantsFromTxt;

    @Given("use the Applicants api endpoint https:{string}")
    public void useTheApplicantsApiEndpointHttps(String URL) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigurationReader.getProperty("token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(URL)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        // response.prettyPrint();
        jp = response.jsonPath();

    }

    @Then("Get all Applicants inforamtion  as De-Serialization")
    public void get_all_Applicants_inforamtion_as_De_Serialization() {
        applicantsMap = jp.getList("$");
     //   System.out.println(applicantsMap.get(5).get("id"));
       // System.out.println("ALLApplicant's Data"+applicantsMap);


    }

    @And("verify how many Applicants are")
    public void verifyHowManyApplicantsAre() {
        int actualApplicantSize = applicantsMap.size();


        System.out.println("ApplicantMapSize :"+actualApplicantSize);


      //  System.out.println("ActualApplican Size: "+actualApplicantSize+"ExpectedApplicantSize: "+ expectedApplicantSize);

    }

    @Then("read all applicants's info")
    public void read_all_applicants_s_info() throws IOException {

        object = new ObjectMapper();
        allapplicants = object.readValue(response.asString(), Applicants[].class);

         //   System.out.println("From Response: "+ applicantsMap.get(5).get("id"));
          //    System.out.println("From Pojo : " + allapplicants[5].getId());
            //  System.out.println("Applicant's email : " + applicants[i].getEmail());

        }


    @Then("store all Applicant's information into a file")
    public void store_all_Applicant_s_information_into_a_file() {
        File file = new File("AllApplicants/AllApplicants.txt");
        if (file != null)
            file.delete();


        WriteToTxt.saveAllApplicants2("AllApplicants/AllApplicants.txt",applicantsMap);

    }

    @Then("verify Applicants numbers")
    public void verify_Applicants_numbers() throws Exception {
     //  allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
       System.out.println("Text DAta"+allApplicantsFromTxt);
        System.out.println( "AllApplicantsTXT size: "+allApplicantsFromTxt.size());
       // System.out.println("allapplicantsTX : "+ Arrays.deepToString(allApplicantsFromTxt.);

       // System.out.println("++++++++++++++++++++++");
        int expectedNumbers = allapplicants.length;
        int actualNumbers = applicantsMap.size();
      // System.out.println("mapData"+ applicantsMap);
      //  System.out.println(allApplicantsFromTxt.get(1).getSsn());
       // System.out.println(actualNumbers);
      //  System.out.println(expectedNumbers);
        //  Assert.assertEquals("Not Equal", expectedNumbers, actualNumbers);

    }


    @Then("verify 5th,11th,55th,66th,77th,88th,99th  applicants id and ssn")
    public void verify_5th_11th_55th_66th_77th_88th_99th_applicants_id_and_ssn() throws Exception {
       // allApplicantsFromTxt = ReadTxt.readTxtData("AllApplicants/AllApplicants.txt");
        // System.out.println("From Data"+  applicantsMap.get(int1));
     //   Object expectedId = allApplicantsFromTxt.get(5);

     //   System.out.println("expected "+expectedId);

     //   Object  actualId = applicantsMap.get(5).get("id");
     //   System.out.println("Actual "+actualId);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
     //   Assert.assertEquals("It is not Equal", expectedId, actualId);
//                int actualData1 = allapplicants[i].getId();


//        Integer[] numbers = {5, 11, 55, 66, 77, 88, 99};
//
//        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(numbers));
//
//        for (Integer i = 0; i <= numList.size(); i++) {
//                int expect1 = allApplicantsFromTxt.get(numList.get(i)).getId();
//                int actualData1 = allapplicants[i].getId();
//                Assert.assertEquals("hi", expect1, actualData1);
//                System.out.println("expected  " + expect1 + "  actual " + actualData1);
//            }

        }

    @Then("verify  eleven Applicant's id {int}")
    public void verify_eleven_Applicant_s_id(Integer int1) throws Exception {
     //  allApplicantsFromTxt = ReadTxt.readTxtData("AllApplicants/AllApplicants.txt");
       // System.out.println("From Data"+  applicantsMap.get(int1));
        Object expectedId = allApplicantsFromTxt.get(int1);
      //  System.out.println("expected new "+expectedId);

     //   Object  actualId = applicantsMap.get(int1).get("id");
       //    System.out.println("Actual new "+actualId);
      //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
     //   Assert.assertEquals("It is not Equal", expectedId, actualId);
    }


    @Then("verify   eleven Applicant's ssn {int}")
    public void verify_eleven_Applicant_s_ssn(Integer int1) {
      //  allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
        // System.out.println("From Data"+  applicantsMap.get(int1));
     //   Object expectedSsn = allApplicantsFromTxt.get(int1).getSsn();
     //   System.out.println("expected "+expectedSsn);

      // Object  actualSsn = applicantsMap.get(int1).get("ssn");
     //  System.out.println("Actual "+actualSsn);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
     //   Assert.assertEquals("It not Equal", expectedSsn, actualSsn);
    }

    @Then("verify  eleven Applicant's  firstName {int}")
    public void verify_eleven_Applicant_s_firstName(Integer int1) {
       // allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
        // System.out.println("From Data"+  applicantsMap.get(int1));
      //  Object expectedFirstName = allApplicantsFromTxt.get(int1).getFirstName();
        // System.out.println("expected "+expectedFirstName);

      //  Object  actualFirstName = applicantsMap.get(int1).get("firstName");
       //  System.out.println("Actual "+actualFirstName);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
      //    Assert.assertEquals("It not Equal", expectedFirstName, actualFirstName);


    }

    @Then("verify  eleven Applicant's  lastName {int}")
    public void verify_eleven_Applicant_s_lastName(Integer int1) {
       // allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
        // System.out.println("From Data"+  applicantsMap.get(int1));
    //    Object expectedLastName = allApplicantsFromTxt.get(int1).getLastName();
      //  System.out.println("expected "+expectedLastName);

      //  Object  actualLastName = applicantsMap.get(int1).get("lastName");
       //   System.out.println("Actual "+actualLastName);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
       //    Assert.assertEquals("It not Equal", expectedLastName, actualLastName);
    }

    @Then("verify  eleven Applicant's address {int}")
    public void verify_eleven_Applicant_s_address(Integer int1) {
     //   allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
        // System.out.println("From Data"+  applicantsMap.get(int1));
      //  Object expectedAddress = allApplicantsFromTxt.get(int1).getAddress();
       // System.out.println("expected "+expectedAddress);

      //  Object  actualAddress = applicantsMap.get(int1).get("address");
      //  System.out.println("Actual "+actualAddress);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
      //  Assert.assertEquals("It not Equal", expectedAddress, actualAddress);
    }

    @Then("verify  eleven Applicant's mobilePhoneNumber {int}")
    public void verify_eleven_Applicant_s_mobilePhoneNumber(Integer int1) {
     //   allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
    //     System.out.println("From Data"+  applicantsMap.get(int1));
      //  Object expectedmobilePhoneNumber = allApplicantsFromTxt.get(int1).getMobilePhoneNumber();
     //   System.out.println("expected "+expectedmobilePhoneNumber);

     //   Object  actualmobilePhoneNumber = applicantsMap.get(int1).get("mobilePhoneNumber");
     //   System.out.println("Actual "+actualmobilePhoneNumber);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
      //  Assert.assertEquals("It not Equal", expectedmobilePhoneNumber, actualmobilePhoneNumber);
    }

    @Then("verify  eleven Applicant's userId  {int}")
    public void verify_eleven_Applicant_s_userId(Integer int1) {
      //  allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
      //  System.out.println("From Data"+  applicantsMap.get(int1));
      //  Object expecteduserId = allApplicantsFromTxt.get(int1).getUserId();
      //  System.out.println("expected "+expecteduserId);

     //   Object  actualuserId = applicantsMap.get(int1).get("userId");
      //  System.out.println("Actual "+actualuserId);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
      //  Assert.assertEquals("It not Equal", expecteduserId, actualuserId);
    }

    @Then("verify  eleven Applicant's userName {int}")
    public void verify_eleven_Applicant_s_userName(Integer int1) {
     //   allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
     //   System.out.println("From Data"+  applicantsMap.get(int1));
     //   Object expecteduserName = allApplicantsFromTxt.get(int1).getUserName();
     //   System.out.println("expected "+expecteduserName);

     //   Object  actualuserName = applicantsMap.get(int1).get("userName");
    //    System.out.println("Actual "+actualuserName);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
     //   Assert.assertEquals("It not Equal", expecteduserName, actualuserName);
    }

    @Then("verify  eleven Applicant's  email ,{int}")
    public void verify_eleven_Applicant_s_email(Integer int1) {
        //   allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
      //  System.out.println("From Data"+  applicantsMap.get(int1));
      ///  Object expectedemail = allApplicantsFromTxt.get(int1).getEmail();
      //  System.out.println("expected "+expectedemail);

    //    Object  actualemail = applicantsMap.get(int1).get("email");
     //   System.out.println("Actual "+actualemail);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
     //   Assert.assertEquals("It not Equal", expectedemail, actualemail);
    }

    @Then("verify verify  eleven Applicant's {int}")
    public void verify_verify_eleven_Applicant_s(Integer int1) {
        //   allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
      //  System.out.println("From Data"+  applicantsMap.get(int1));
     //   Object expectedcreateDate = allApplicantsFromTxt.get(int1).getCreateDate();
     //   System.out.println("expected "+expectedcreateDate);

     //   Object  actualcreateDate = applicantsMap.get(int1).get("createDate");
      //  System.out.println("Actual "+actualcreateDate);
        //  System.out.println( "From TXT File" + allApplicantsFromTxt.get(int1));
     //   Assert.assertEquals("It not Equal", expectedcreateDate, actualcreateDate);
    }


}