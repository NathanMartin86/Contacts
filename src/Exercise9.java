import java.util.ArrayList;

/**
 * Created by macbookair on 11/4/15.
 */
public class Exercise9 {
    public static void main(String[] args) {
        String [] names = {"Charlies", "David","Alice","Bob"};
        ArrayList<String> sortedNames = new ArrayList<>();

        // use compareTo method to place them alphabetically into sortedNames

        for (String name : names){
            int index = 0;
            for (String sortedName: sortedNames){
                if (name.compareTo(sortedName)> 0){
                    index++;
                }else{
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);
    }
}
// THIS APPEARS A LOT IN INTERVIEWS!!