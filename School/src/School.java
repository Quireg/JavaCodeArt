import java.util.ArrayList;

/**
 * Created by Admin on 01.03.14.
 */
public class School {
    private String name;
    private ArrayList<SchoolClass> listClasses;

    public int oLevelSchool() {
        int tempOlevel = 0;


        for (int i = 0; i < getListClasses().size(); i++) {
            tempOlevel += getListClasses().get(i).oLevel();
        }
        int result = tempOlevel / (getListClasses().size());

        return result;
    }

    public School(String name, ArrayList<SchoolClass> listClasses) {
        this.name = name;
        this.listClasses = listClasses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SchoolClass> getListClasses() {
        return listClasses;
    }

    public void setListClasses(ArrayList<SchoolClass> listClasses) {
        this.listClasses = listClasses;
    }
}
