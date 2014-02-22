import java.util.ArrayList;

/**
 * Created by Admin on 16.02.14.
 */
public class City {

    public void cityReport() {
        for (int i = 0; i < getCompanies().size(); i++) {
            getCompanies().get(i).companyReport();
        }


    }


    public void changeEmployee() {
        Employee tempEmployee = getCompanies().get(0).getEmployees().get(0);
        Employee minEmployee = getCompanies().get(0).getEmployees().get(0);
        Employee maxEmployee = getCompanies().get(0).getEmployees().get(0);

        for (int i = 0; i < getCompanies().size(); i++) {
            for (int j = 0; j < getCompanies().size(); j++) {
                if (getCompanies().get(i).maxSalaryEmployee().getSalary() >
                        maxEmployee.getSalary()) {
                    maxEmployee = getCompanies().get(i).maxSalaryEmployee();

                }
            }

        }
        System.out.println(maxEmployee.getSalary());

        for (int i = 0; i < getCompanies().size(); i++) {
            for (int j = 0; j < getCompanies().size(); j++) {
                if (getCompanies().get(i).minSalaryEmployee().getSalary() <
                        minEmployee.getSalary()) {
                    minEmployee = getCompanies().get(i).minSalaryEmployee();

                }
            }

        }
        System.out.println(minEmployee.getSalary());

        for (int i = 0; i < getCompanies().size(); i++) {
            for (int j = 0; j < getCompanies().get(i).getEmployees().size(); j++) {
                if (getCompanies().get(i).getEmployees().get(j).getSalary() == maxEmployee.getSalary()) {
                    for (int k = 0; k < getCompanies().size(); k++) {
                        for (int l = 0; l < getCompanies().get(k).getEmployees().size(); l++) {
                            if (getCompanies().get(k).getEmployees().get(l).getSalary() == minEmployee.getSalary()) {
                                tempEmployee = getCompanies().get(i).getEmployees().get(j);
                                getCompanies().get(i).getEmployees().set(j, getCompanies().get(k).getEmployees().get(l));
                                getCompanies().get(k).getEmployees().set(l, tempEmployee);

                            }
                        }

                    }

                }
            }

        }


    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(ArrayList<Company> companies) {
        this.companies = companies;
    }

    public City(String name, ArrayList<Company> companies) {
        this.name = name;
        this.companies = companies;
    }

    private String name;
    private ArrayList<Company> companies;
}
