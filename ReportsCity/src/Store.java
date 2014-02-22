import java.util.ArrayList;

/**
 * Created by Admin on 16.02.14.
 */
public class Store extends Company {
    @Override
    public ArrayList<Employee> report() {

        return getEmployees();
    }

    public Store(String name, ArrayList<Employee> employees) {
        super(name, employees);
    }
}
