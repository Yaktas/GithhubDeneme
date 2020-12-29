package gmiBank_team22.utilities;

import gmiBank_team22.pojo.Applicants;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

public class WriteToTxt {


    public static void saveAllApplicants(String fileName, Applicants[] applicants) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < applicants.length; i++)
                writer.append(applicants[i].getId() + "," + applicants[i].getSsn() + "," + applicants[i].getFirstName() + "," + applicants[i].
                        getLastName() + "," + applicants[i].getAddress() + "," + applicants[i].getMobilePhoneNumber() + "," +
                        applicants[i].getUserId() + "," + applicants[i].getUserName() + "," + applicants[i].getEmail() + "," +
                        applicants[i].getCreateDate() + "\n");

            writer.close();
        } catch (Exception e) {

        }

    }

    public static void saveAllApplicants2(String fileName, List<Object> applicantsMap) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < applicantsMap.size(); i++)
                writer.append(applicantsMap.get(i) + "," + applicantsMap.get(i) + "," + applicantsMap.get(i) + "," +
                        applicantsMap.get(i) + "," + applicantsMap.get(i) + "," + applicantsMap.get(i) +
                        "," + applicantsMap.get(i) + "," + applicantsMap.get(i) + "," + applicantsMap.get(i) + "," +
                        applicantsMap.get(i) + "\n");

            writer.close();
        } catch (Exception e) {

        }

    }
}

