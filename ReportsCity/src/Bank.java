import java.util.ArrayList;

/**
 * Created by Admin on 16.02.14.
 */
public class Bank extends Company {
    @Override
    public ArrayList<Employee> report() {


        Employee temp = getEmployees().get(0);
        for (int i = 0; i < getEmployees().size() - 1; i++) {
            for (int j = i + 1; j < getEmployees().size(); j++) {
                if (getEmployees().get(j).getSalary() > getEmployees().get(i).getSalary()) {
                    temp = getEmployees().get(i);
                    getEmployees().set(i, getEmployees().get(j));
                    getEmployees().set(j, temp);
                }

            }

        }
        return getEmployees();
    }


    public Bank(String name, ArrayList<Employee> employees) {
        super(name, employees);
    }

}
