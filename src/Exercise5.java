import java.util.ArrayList;


/**
 * Created by macbookair on 10/27/15.
 */
public class Exercise5 {
    public static void main(String[] args) {
        String s = "To be or not to be, that is the question";
        ArrayList<String>newWords = new ArrayList<>();

        //remove commas and periods
        String s1 = s.replace(",","");
        //make it all lower case.
        String s2 = s1.toLowerCase();
        // Split into words.
        String [] words = s2.split(" ");
        //Remove duplicate words
        for (String word : words){
            if (!newWords.contains(word)){
                newWords.add(word);
            }
        }
        //Create a new string without the duplicate words.
                String s3 = newWords.toString();
        // To be or not that is the quesiton.
                System.out.println(s3);
    }
}