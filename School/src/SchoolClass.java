import java.util.ArrayList;

/**
 * Created by Admin on 01.03.14.
 */
abstract public class SchoolClass {
    private String name;
    private ArrayList<Kid> kidsList;


    abstract public int oLevel();



    protected SchoolClass(String name, ArrayList<Kid> kidsList) {
        this.name = name;
        this.kidsList = kidsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Kid> getKidsList() {
        return kidsList;
    }

    public void setKidsList(ArrayList<Kid> kidsList) {
        this.kidsList = kidsList;
    }
}
