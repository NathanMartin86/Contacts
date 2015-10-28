import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by macbookair on 10/28/15.
 */
public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList(Arrays.asList("alice", "bob", "charlie", "david", "allen", "barbie", "colin", "dan"));
        // take the first 5 names.
        names = new ArrayList(names.subList(0, 5));//this method actually allows you to use [5] because it's inclusive.
        solveViaStream(names);
        solveViaTempLists(names);
        solveViaDirectModification(names);

    }

    static void solveViaDirectModification (ArrayList<String> names){
        // make every string inside upper case
        for (int i = 0; i < names.size(); i++) {
            String s = names.get(i).toUpperCase();
            names.set(i, s);
        }

        Iterator<String> it = names.iterator(); // if you ever need to remove something while looping over it...
        while (it.hasNext()) {                  // ...you must use this iterator! You can't loop over something...
            String name = it.next();            //...while changing the size of the loop.
            if (name.startsWith("A")) {
                it.remove();
            }
        }
        System.out.println(names);
    }

    static void solveViaTempLists (ArrayList<String> names){
        // Make every string inside upper case.
        ArrayList<String> tempNames = new ArrayList<>();
        for (String name : names) {
            tempNames.add(name.toUpperCase());
        }
        names = tempNames;

        // remove the ones that start with "A"
        tempNames = new ArrayList<>();
        for (String name: names){
            if (!name.startsWith("A")){
                tempNames.add(name);
            }
        }
        names = tempNames;

        System.out.println(names);
    }

    static void solveViaStream(ArrayList<String> names) {
        List<String> newNames =
                names
                .stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) -> {
                    return !name.startsWith("A");
                })
                .collect(Collectors.toList());

        System.out.println(newNames);
    }

}
