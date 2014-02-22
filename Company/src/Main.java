import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Admin on 08.02.14.
 */
public class Main {
    public static void main(String[] args) {
        Company intel = new Company("Intel", new ArrayList<Employee>());
        Admin a0 = new Admin("Kolia", "Ivanov", 23, 2000, 20, "Carlsberg");
        Admin a1 = new Admin("Kolia", "Loboda", 23, 2200, 15, "Obolon");
        Admin a2 = new Admin("Kolia", "Kopernik", 23, 2500, 10, "Hike");
        Manager m0 = new Manager("Vasia", "Kiev", 16,800,new ArrayList<String>());
        Manager m1 = new Manager("Jora", "Dolg", 34,1600,new ArrayList<String>());
        Manager m2 = new Manager("Misha", "Svoboda", 23,1300,new ArrayList<String>());
        Dev d0 = new Dev("Kiril", "Oreshkin", 25, 1500,"Java", new ArrayList<String>());
        Dev d1 = new Dev("Kiril", "Mjasoedod", 27, 2400,"C++", new ArrayList<String>());
        Dev d2 = new Dev("Kiril", "Govnoedov", 25, 1500,"PHP", new ArrayList<String>());



        intel.getEmployees().add(a0);
        intel.getEmployees().add(a1);
        intel.getEmployees().add(a2);
        intel.getEmployees().add(m0);
        intel.getEmployees().add(m1);
        intel.getEmployees().add(m2);
        intel.getEmployees().add(d0);
        intel.getEmployees().add(d1);
        intel.getEmployees().add(d2);

        System.out.println(intel.showMaxSal().getName() + " "+ intel.showMaxSal().getLname() + " "+  intel.showMaxSal().getSalary());
    }
}
