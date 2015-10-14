import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by macbookair on 10/14/15.
 */
public class Exercise {
    public static void main(String[] args) {
        Contact alice = new Contact();
        alice.name = "Alice";
        alice.age = 25;

        Contact bob = new Contact();
        bob.name = "Bob";
        bob.age = 35;


        ArrayList<Contact> Contacts = new ArrayList();
        Contacts.add(alice);
        Contacts.add(bob);


        //String [] names = {"Alice", "Bob", "Charlie", "Austin"};
            for (Contact contact : Contacts){
                if (contact.name.startsWith("A")){
                    System.out.println(contact.name);
                }
        }

    }

}