package gmiBank_team22.utilities;

import gmiBank_team22.pojo.Applicants;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class csvREader {

    public static void main(String... args) {
        List<Applicants[]> books = readBooksFromCSV("AllRegistrants/Registrant.info.csv"); // let's print all the person read from CSV file
         for (Applicants[] b : books)
         {
             System.out.println(b);
         }
    }



    private static List<Applicants[]> readBooksFromCSV(String fileName) {
    List<Applicants[]> books = new ArrayList<>();
    Path pathToFile = Paths.get(fileName); // create an instance of BufferedReader // using try with resource, Java 7 feature to close resources
         try (BufferedReader br = Files.newBufferedReader(pathToFile,
                 StandardCharsets.US_ASCII)) { // read the first line from the text file
              String line = br.readLine(); // loop until all lines are read
              while (line != null) { // use string.split to load a string array with the values from // each line of // the file, using a comma as the delimiter
                   String[] attributes = line.split(",");
                   Applicants[] book = createBook(attributes); // adding book into ArrayList
                   books.addAll(Collections.singleton(book)); // read next line before looping // if end of file reached, line would be null
                   line = br.readLine();
              }
         } catch (IOException ioe) {
             ioe.printStackTrace();
         } return books;
}
    private static Applicants[] createBook(String[] metadata) {
        int id =Integer.parseInt(metadata[0]);
        String ssn = metadata[1];
        String firstName = metadata[2]; // create and return book of this metadata
        String lastName = metadata[3];
        String address = metadata[4];
        String mobilePhoneNumber = metadata[5];
        int userId = Integer.parseInt(metadata[6]);
        String userName = metadata[7];
        String email = metadata[8];
        String createDate = metadata[9];


        Applicants[] books = new Applicants[0];
        return books;
}

}


