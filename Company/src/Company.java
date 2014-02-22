import java.util.ArrayList;

/**
 * Created by Admin on 08.02.14.
 */
public class Company {
    private String  name;
    private ArrayList<Employee> employees;

    public Company(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Employee showMaxSal(){
        int max  = 0;

        for (int i = 0; i < getEmployees().size() ; i++) {
            if(getEmployees().get(i).getSalary() >= getEmployees().get(max).getSalary()){
                max = i;

            }

        }
        return getEmployees().get(max);
    }
}
