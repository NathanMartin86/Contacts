import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by macbookair on 11/11/15.
 */
public class Exercise11 {
    public static void main(String[] args) {
        System.out.println(isPlaindrome("Hello"));//false
        System.out.println(isPlaindrome("racecar")); // true
        System.out.println(isPlaindrome("hannah"));
        System.out.println(isPlaindrome("sore was i ere i saw eros"));

    }
    static boolean isPlaindrome (String s){
        int n = s.length();

        for ( int i = 0; i < n/2; ++i){
            if (s.charAt(i) != s.charAt(n - i - 1)){ // this is the one I found. :) Two in a row!
                return false;
            }
        }
     return true;
    }
}
