import java.util.*;

/**
 * Created by macbookair on 10/29/15.
 */
public class Exercise7 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Smith", "Bob", "Brown", "Charlie", "Jones"};
        //REVERSE THE ARRAY
        List<String> newNames = Arrays.asList(names);
        Collections.reverse(newNames); // this is the solution these crazy kids came up with.

        /*
        ArrayList<String> newNames2 = new ArrayList<>();
        for (int i = names.length - 1; i >= 0; i--) {
            newNames2.add(names[1]);// this is what zach came up with.
        }
        */

        /*
        ArrayList listNames = new ArrayList();
        listNames.add(names);
        for(int i = 0; i <listNames.size(); i --);
        System.out.println(listNames.toString());//this is what I tried to do. :(
        */
        // CONVERT THE ARRAY INTO A HASHMAP.
        HashMap m = new HashMap<>();
        for (int i = 0; i < names.length; i += 2) {
            m.put(names[i], names[i + 1]);
            System.out.println(m);


            // {"Jones":"Charlie" "Brown":"Bob" "Smith":"Alice"}

        }
    }
}
