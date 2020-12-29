package gmiBank_team22.utilities;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadCSVFileintoArray {


    public void csvReaderMEthod1(String filePAth) {
        try {
            Scanner scanner = new Scanner(new File(filePAth));
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                System.out.println(scanner.next() + "");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void csvMethod2(String filePath) {
        try {
            String line = "";
            BufferedReader br = new BufferedReader((new FileReader(filePath)));
            while ((line = br.readLine()) != null) {
                String[] List = line.split(",");
                System.out.println("id " + List[0] + " ssn" + List[1] + " firstName " + List[2] + " lastName " + List[3] + " address" + List[4] + " mobilePhoneNumber " + List[5] + " userid " + List[6] + " userName " + List[7] + " email " + List[8] + " createdate " + List[9]);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> numList = new ArrayList<Integer>( Arrays.asList(numbers) );

        for (Integer i=0; i<=numList.size();i++) {

        }

        System.out.println(numList);

    }
}

