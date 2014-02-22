import java.util.ArrayList;

/**
 * Created by Admin on 16.02.14.
 */
public class Main {
    public static void main(String[] args) {
        City kyiv = new City("Kyiv", new ArrayList<Company>());



        Company privat24 = new Bank("Privat24", new ArrayList<Employee>());
        Employee ivan = new Employee("Ivan", "Negod", 26, 2300);
        Employee vasia = new Employee("Vasia", "Dolg", 29, 2700);
        privat24.getEmployees().add(ivan);
        privat24.getEmployees().add(vasia);

        Company praveks = new Bank("Praveks", new ArrayList<Employee>());
        Employee ivan1 = new Employee("Vania", "Pryanik", 22, 1200);
        Employee vasia1 = new Employee("Vasiok", "Pryvet", 26, 1700);
        praveks.getEmployees().add(ivan1);
        praveks.getEmployees().add(vasia1);

        Company radikal = new Factory("Radikal", new ArrayList<Employee>());
        Employee kolia = new Employee("Kolia", "Ivanov", 35, 1500);
        Employee misha = new Employee("Misha", "Nikylin", 33, 900);
        radikal.getEmployees().add(kolia);
        radikal.getEmployees().add(misha);

        Company megometr = new Factory("Megometr", new ArrayList<Employee>());
        Employee kolia1 = new Employee("Kolia", "Trywkov", 25, 1500);
        Employee misha1 = new Employee("Misha", "Lev", 23, 900);
        megometr.getEmployees().add(kolia1);
        megometr.getEmployees().add(misha1);

        Company evroset = new Store("Euronetwork", new ArrayList<Employee>());
        Employee kolia2 = new Employee("Kolia", "Zemlakov", 30, 35000);
        Employee misha2 = new Employee("Misha", "Ritin", 43, 1900);
        evroset.getEmployees().add(kolia2);
        evroset.getEmployees().add(misha2);

        Company silpo = new Store("Silpo", new ArrayList<Employee>());
        Employee kolia3 = new Employee("Kolian", "Grebenko", 35, 700);
        Employee misha3 = new Employee("Mithgol", "Nikylin", 33, 2000);
        silpo.getEmployees().add(kolia3);
        silpo.getEmployees().add(misha3);

        kyiv.getCompanies().add(praveks);
        kyiv.getCompanies().add(privat24);
        kyiv.getCompanies().add(megometr);
        kyiv.getCompanies().add(silpo);
        kyiv.getCompanies().add(evroset);
        kyiv.getCompanies().add(radikal);

         kyiv.cityReport();
         kyiv.changeEmployee();
       kyiv.cityReport();
    }
}
