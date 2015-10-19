/**
 * Created by macbookair on 10/8/15.
 */
public class Contact implements Comparable {
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

    @Override
    public int compareTo(Object o) {
        Contact c = (Contact) o;
        return name.compareTo(c.name);

    }
}

