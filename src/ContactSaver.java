import jdk.nashorn.internal.parser.JSONParser;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by macbookair on 10/14/15.
 */
public class ContactSaver {
    public static void main(String[] args) throws IOException {

        File f = new File("Contact.txt");

        Contact bob = new Contact();
        bob.name = "Bob";
        bob.address = "510 Mill street";
        bob.age = 25;
        bob.email = "bob@gmail.com";


        JsonSerializer serializer = new JsonSerializer();
        String contentToSave = serializer.serialize(bob);

        FileWriter fw = new FileWriter(f);
        fw.write(contentToSave);
        fw.close();

        FileReader fr = new FileReader(f);
        int fileSize = (int)f.length();
        char[] contents = new char[fileSize];
        fr.read(contents);
        String fileContents = new String (contents);

        JsonParser parser = new JsonParser();
        Contact newBob = parser.parse(fileContents, Contact.class);
        System.out.println(newBob.name);
    }
}
