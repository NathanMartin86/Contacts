/**
 * Created by macbookair on 10/8/15.
 */
public class Contact {
    public String name;
    public int age;
    public String email;
    public String address;


    public Contact(){

    }

    public Contact(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

