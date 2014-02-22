import java.util.ArrayList;

/**
 * Created by Admin on 08.02.14.
 */
public class Dev extends Employee {
    private String progLanguage;
    private ArrayList<String> workProjects;

    public Dev(String name, String lname, int age, int salary, String progLanguage, ArrayList<String> workProjects) {
        super(name, lname, age, salary);
        this.progLanguage = progLanguage;
        this.workProjects = workProjects;
    }

    public String getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {
        this.progLanguage = progLanguage;
    }

    public ArrayList<String> getWorkProjects() {
        return workProjects;
    }

    public void setWorkProjects(ArrayList<String> workProjects) {
        this.workProjects = workProjects;
    }
}
