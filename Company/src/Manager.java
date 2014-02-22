import java.util.ArrayList;

/**
 * Created by Admin on 08.02.14.
 */
public class Manager extends Employee {

    private ArrayList<String> watchProjects;

    public Manager(String name, String lname, int age, int salary, ArrayList<String> watchProjects) {
        super(name, lname, age, salary);
        this.watchProjects = watchProjects;
    }

    public ArrayList<String> getWatchProjects() {
        return watchProjects;
    }

    public void setWatchProjects(ArrayList<String> watchProjects) {
        this.watchProjects = watchProjects;
    }
}