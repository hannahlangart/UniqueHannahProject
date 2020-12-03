import java.io.Serializable;

public class Patient implements Serializable {
    protected String name;
    protected String contactNum;

    public Patient (String name, String contactNum){
        this.name=name;
        this.contactNum = contactNum;
    }
}
