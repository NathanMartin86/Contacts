import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by macbookair on 10/15/15.
 */
public class Exercise2 {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //sayHello(scanner);

        HashMap<String, ArrayList<String>> groups = new HashMap();
        String[] words = {"Alice", "Bob", "Charlie", "Austin", "Albert", "Connor"};
        for (String name : words) {
            String firstLetter = String.valueOf(name.charAt(0));
            ArrayList<String> list = groups.get(firstLetter);
            if (list == null) {
                list = new ArrayList();
                list.add(name);
                groups.put(firstLetter, list);

            } else {
                list.add(name);
            }
        }
        System.out.println(groups);


    }
}




    /*static void sayHello(Scanner scanner) {
        while (true) {
            System.out.println("Hey can you do me a favor and just type the word hello for me?");
            String answer = scanner.nextLine();
            if (answer.equals("hello")) {
                System.out.println("Ok thanks. Shutting the program down now");
                System.exit(0);
            } else {
                System.out.println("Ok. Let's try this one more time");


            }
        }
    }
    */

}


