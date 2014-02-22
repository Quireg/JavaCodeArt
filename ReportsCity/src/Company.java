import java.util.ArrayList;

/**
 * Created by Admin on 16.02.14.
 */
abstract public class Company {
    private String name;
    private ArrayList<Employee> employees;

    abstract public ArrayList<Employee>  report();

    public  Employee maxSalaryEmployee(){
        Employee temp = getEmployees().get(0);
        for (int j = 0; j < getEmployees().size() ; j++) {
            if(getEmployees().get(j).getSalary() > temp.getSalary()){
                temp = getEmployees().get(j);

            }

        }
        return temp;
    }

    public  Employee minSalaryEmployee(){
        Employee temp = getEmployees().get(0);
        for (int j = 0; j < getEmployees().size() ; j++) {
            if(getEmployees().get(j).getSalary() < temp.getSalary()){
                temp = getEmployees().get(j);

            }

        }
        return temp;
    }

    public void companyReport(){
        System.out.println();
        System.out.println("Company name: " + getName());
        System.out.println("Sorted employees");
        for (int i = 0; i < report().size() ; i++) {
            System.out.println(report().get(i).getfName() + " " + report().get(i).getlName()+ " "+
                    + report().get(i).getSalary()+ " " + report().get(i).getAge());
        }
    }


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
}
