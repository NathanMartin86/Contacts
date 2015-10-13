/**
 * Created by macbookair on 10/8/15.
 */
public class Email {
    public String subject;
    public String body;
    public String destination;
    public int timestamp;

    public Email(){
        System.out.println("Creating Email...");
        subject = "Subject";
        body = "";
        destination = "";
        timestamp = 0;

    }

    public Email(String subject, String body, String destination, int timestamp) {
        this.subject = subject;
        this.body = body;
        this.destination = destination;
        this.timestamp = timestamp;
    }

    public void setBody (String body) {
        this.body = body;
    }

    public String getbody(){
        return body;

    }

    public boolean isValidSubject(String Subject){
        return subject.length() !=0;

    }
}

