package gmiBank_team22.utilities;

import gmiBank_team22.pojo.Applicants;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class ReadTxt {

    public static List<Applicants> readTxtData(String filePath) throws Exception {
        List<Applicants> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            Applicants applicant = new Applicants();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                // customer.setSsn(line);
            }
            String everything = sb.toString();
            applicant.setSsn(everything);
            list.add(applicant);
        } finally {
            br.close();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> allApplicantsFromTxt = ReadTxt.readAllTxtFile("AllApplicants/AllApplicants.txt");
         System.out.print("size"+allApplicantsFromTxt);
        System.out.println("==========");
        System.out.println("0" + allApplicantsFromTxt.get(1).get("id"));


    }


    public static List<Map<String, Object>> readAllTxtFile(String filePath) {
        List<Map<String, Object>> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            // sb.append(line);
            // System.out.println("line"+line);
            while (line != null) {
                Applicants applicant =  new Applicants();
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                String[] each = line.split(",");
                applicant.setId(Integer.parseInt(each[0]));
                applicant.setSsn(each[0]);
                applicant.setFirstName(each[0]);
                applicant.setLastName(each[0]);
                applicant.setAddress(each[0]);
                applicant.setMobilePhoneNumber(each[0]);
                applicant.setUserId(Integer.parseInt(each[0]));
                applicant.setUserName(each[0]);
                applicant.setEmail(each[0]);
                applicant.setCreateDate(each[0]);

//
//                ((Applicants) applicant).setId(parseInt(line.split(",")[0]));
//                ((Applicants) applicant).setSsn(line.split(",")[1]);
//                ((Applicants) applicant).setFirstName(line.split(",")[2]);
//                ((Applicants) applicant).setLastName(line.split(",")[3]);
//                ((Applicants) applicant).setAddress(line.split(",")[4]);
//                ((Applicants) applicant).setMobilePhoneNumber(line.split(",")[5]);
//                ((Applicants) applicant).setUserId(parseInt(line.split(",")[6]));
//                ((Applicants) applicant).setUserName(line.split(",")[7]);
//                ((Applicants) applicant).setEmail(line.split(",")[8]);
//                ((Applicants) applicant).setCreateDate(line.split(",")[9]);

                System.out.println("runs"+applicant);
                sb.append(System.lineSeparator());

                String everything = sb.toString();


            all.add((Map<String, Object>) applicant);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;

    }

    public static List<String> csvMethod2(String filePath) {
        List<String> List = new ArrayList<>();
        try {
            String line = "";
            BufferedReader br = new BufferedReader((new FileReader(filePath)));
            while ((line = br.readLine()) != null) {
                List.add(line);
                     Arrays.asList(line.split(","));


              //  System.out.println(List.get(0) + List.get(1) + List.get(2) + List.get(3) + List.get(4) + List.get(5) + List.get(6) + List.get(7) + List.get(8) + List.get(9));

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List;

    }
    public static List<Applicants> returnAllStates(String filePath){
        List<Applicants>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i=0;
            while (line != null) {
                Applicants applicants=new Applicants();
                applicants.setId(parseInt(line.split(",")[0].trim()));
                applicants.setFirstName(line.split(",")[1].trim());
                applicants.setLastName(line.split(",")[1].trim());
                applicants.setAddress(line.split(",")[1].trim());
                applicants.setMobilePhoneNumber(line.split(",")[1].trim());
                applicants.setUserId(parseInt(line.split(",")[1].trim()));
                applicants.setUserName(line.split(",")[1].trim());
                applicants.setEmail(line.split(",")[1].trim());
                applicants.setCreateDate(line.split(",")[1].trim());


                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(i++);

                all.add(applicants);
            }
            String everything = sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }


    }


