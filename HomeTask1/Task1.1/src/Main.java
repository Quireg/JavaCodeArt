import java.util.ArrayList;

/**
 * Created by Admin on 31.01.14.
 */
public class Main {
    public static void main(String[] args) {

        //-----------------------------------------------------
        // Наши сотрудники
        Employee ivan = new Employee();
        ivan.setName("Ваня");
        ivan.setLname("Пряник");
        ivan.setAge(21);
        ivan.setSalary(1300);
        ivan.setGender(true);

        Employee tania = new Employee();
        tania.setName("Мария");
        tania.setLname("Орошко");
        tania.setAge(23);
        tania.setSalary(12300);
        tania.setGender(false);


        Employee masha = new Employee();
        masha.setName("Мария");
        masha.setLname("Степаненко");
        masha.setAge(29);
        masha.setSalary(2000);
        masha.setGender(false);

        Employee katia = new Employee();
        katia.setName("Катя");
        katia.setLname("Долг");
        katia.setAge(25);
        katia.setSalary(1500);
        katia.setGender(false);

        Employee viktor = new Employee();
        viktor.setName("Виктор");
        viktor.setLname("Крутик");
        viktor.setAge(45);
        viktor.setSalary(4000);
        viktor.setGender(true);
        //-----------------------------------------------------



        Company intel = new Company();
        ArrayList<Employee> employees = new ArrayList<Employee>();


        intel.setEmployees(employees);
        intel.getEmployees().add(ivan);
        intel.getEmployees().add(tania);
        intel.getEmployees().add(masha);
        intel.getEmployees().add(katia);
        intel.getEmployees().add(viktor);

//        intel.showCompanyList();
        intel.showNameStartingWithPrefix("М");
//        intel.showNameLetterNumber(5);
//        intel.sortManBySalary();
//        intel.sortWomanBySalary();
//        intel.report();
//        intel.fire(false);
//        intel.showCompanyList();
//        intel.raiseSalary(4000, true);
//        intel.showCompanyList();


    }

}
