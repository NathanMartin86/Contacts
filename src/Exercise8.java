import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by macbookair on 11/2/15.
 */
public class Exercise8 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(new File("people.csv"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // split line into array of columns.
            String[] columns = line.split(",");

            // add fist and last name to  "names"
            names.add(columns[1] + " "+ columns [2]);

        }

        // add fist and last name to  "names"

        String searchTerm = "ali";
        ArrayList<String> results = new ArrayList<>();
        // fill up "results" with all the names that contact searchTerm (case-sensitive).
        searchTerm =  searchTerm.toLowerCase();
        for (String name : names) {
            if (name.toLowerCase().contains(searchTerm)) {
                results.add(name);

            }
            System.out.println(results);
        }

    }
}


