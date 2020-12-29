package gmiBank_team22.step_Definitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmiBank_team22.pojo.Applicants;
import gmiBank_team22.utilities.ConfigurationReader;
import gmiBank_team22.utilities.ReadTxt;
import gmiBank_team22.utilities.WriteToTxt;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.io.File;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class US23_Applicant_NEW_StepDef {

    Response response;
    ObjectMapper objectMapper;
    List<Map<String,Object>> allApplicantData;
    JsonPath jsonPath;
    ObjectMapper obj;
    String filePath="AllApplicants/AllApplicants.txt";
    Applicants[] applicants;
    List<Applicants> fromtx;


    @Given("use the api endpoint https:{string}")
    public void useTheApiEndpointHttps(String URL) {

        response= given().
                accept(ContentType.JSON).
                auth().
                oauth2(ConfigurationReader.getProperty("token")).
                when().get(URL);
       // response.prettyPrint();

        jsonPath=response.jsonPath();
    }

    @Then("Get all data deserialized into Java")
    public void getAllDataDeserializedIntoJava() {

        allApplicantData= jsonPath.getList("$");
       // System.out.println("ALLApplicant's"+ allApplicantData);
        System.out.println(allApplicantData.get(0).get("firstName"));
    }

    @And("write all Applicant's information into a file")
    public void writeAllApplicantSInformationIntoAFile() throws Exception {

        obj=new ObjectMapper();
        applicants=obj.readValue(response.asString(),Applicants[].class);

        File file =new File(filePath);
        if (file!=null)
        WriteToTxt.saveAllApplicants(filePath,applicants);


        int applicantDataSize=allApplicantData.size();
        System.out.println("How many applicant in application"+applicantDataSize);



        fromtx = ReadTxt.returnAllStates("AllApplicants/AllApplicants.txt");
        System.out.println("fromtx"+fromtx);
        System.out.println("state" + fromtx.get(5).getId());
        }



    @Then("validate all Aplicant's {string}")
    public void validateAllAplicantS(String arg0)  {
     allApplicantData.get(5).get("id");



    }

    @Then("verify first Applicant's id {int}")
    public void verify_first_Applicant_s_id(Integer int1) {

    }

    @And("verify second Applicant's ssn {string}")
    public void verifySecondApplicantSSsn(String arg0) {
    }

    @And("verify third Applicant's firstName {string}")
    public void verifyThirdApplicantSFirstName(String arg0) {
    }

    @And("verify fourth Applicant's lastName {string}")
    public void verifyFourthApplicantSLastName(String arg0) {
    }

    @And("verify fifth Applicant's address {string}")
    public void verifyFifthApplicantSAddress(String arg0) {
    }

    @And("verify sixth Applicant's mobilePhoneNumber {string}")
    public void verifySixthApplicantSMobilePhoneNumber(String arg0) {
    }

    @Then("verify seventh Applicant's userId  {int}")
    public void verify_seventh_Applicant_s_userId(Integer int1){
    }

    @And("verify eighth Applicant's userName {string}")
    public void verifyEighthApplicantSUserName(String arg0) {
    }

    @And("verify nineth Applicant'semail  {string}")
    public void verifyNinethApplicantSemail(String arg0) {
    }

    @Then("verify tenth Applicant's createDate {string}")
    public void verifyTenthApplicantSCreateDate(String arg0) {
    }

}
