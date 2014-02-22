import java.util.ArrayList;

/**
 * Created by Admin on 31.01.14.
 */
public class Company {
    private String name;
    private String address;
    private ArrayList<Employee> employees;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }


    public void fire(boolean gender){

        ArrayList<Employee> notFiredEmployees = new ArrayList<Employee>();

        for (int i = 0; i <getEmployees().size(); i++) {
                if(getEmployees().get(i).isGender() != gender){
                    notFiredEmployees.add(getEmployees().get(i));
            }
        }

        getEmployees().clear();
        setEmployees(notFiredEmployees);
        System.out.println();
        System.out.println("Уволены были все " + gender);
    }



    public void raiseSalary(int salaryRaiseSum, boolean gender){

        for (int i = 0; i < getEmployees().size() ; i++) {
            if(getEmployees().get(i).isGender() == gender){
                getEmployees().get(i).setSalary(getEmployees().get(i).getSalary() + salaryRaiseSum);

            }
        }
        System.out.println();
        System.out.println("Зарплата была поднята на " + salaryRaiseSum + " всем " + gender);

    }
    public void showCompanyList(){
        System.out.println();
        System.out.println("Список сотрудников компании");
        for (int i = 0; i < getEmployees().size(); i++) {

                System.out.println(getEmployees().get(i).getName() + " " + getEmployees().get(i).getLname()
                        + " " + getEmployees().get(i).getSalary() + " " + getEmployees().get(i).getAge()+
                        " " + getEmployees().get(i).isGender());

        }
    }

    public void showNamesCount(){

    }
    //--------------------------
    //Сортируем всех по зарплате
    public void sortManBySalary(){
        for (int i = 0; i < getEmployees().size() - 1; i++) {

                for (int j = i+1; j < getEmployees().size() ; j++) {
                    if(getEmployees().get(i).getSalary()<getEmployees().get(j).getSalary()){


                        Employee temp = new Employee();
                        temp = getEmployees().get(i);
                        getEmployees().set(i, getEmployees().get(j));
                        getEmployees().set(j, temp);

                    }

                }

        }
        //Выведем сортированых мужиков по зарплате.
        System.out.println();
        System.out.println("Сортированые мужики по зарплате");
        for (int i = 0; i < getEmployees().size(); i++) {
            if(getEmployees().get(i).isGender() == true){
                System.out.println(getEmployees().get(i).getName() + " " + getEmployees().get(i).getLname()
                        + " " + getEmployees().get(i).getSalary() + " " + getEmployees().get(i).getAge());
            }
        }
    }

    //--------------------------
    //Сортируем женщин по возрасту.

    public void sortWomanBySalary(){

        for (int i = 0; i < getEmployees().size() - 1; i++) {

            for (int j = i+1; j < getEmployees().size() ; j++) {
                if(getEmployees().get(i).getAge()>getEmployees().get(j).getAge()){


                    Employee temp = new Employee();
                    temp = getEmployees().get(i);
                    getEmployees().set(i, getEmployees().get(j));
                    getEmployees().set(j, temp);

                }

            }

        }

        //Выведем сортированых женищин по возрасту.
        System.out.println();
        System.out.println("Сортированые женщины по возрасту");
        for (int i = 0; i < getEmployees().size();  i++) {
            if(getEmployees().get(i).isGender() == false){
                System.out.println(getEmployees().get(i).getName() + " " + getEmployees().get(i).getLname()
                        + " " + getEmployees().get(i).getSalary() + " " + getEmployees().get(i).getAge());
            }
        }
    }
    public void showNameStartingWithPrefix(String prefix){
        System.out.println();
        System.out.println("Люди у которых имя начинается на букву " + prefix);
        for (int i = 0; i < getEmployees().size(); i++) {
            if(getEmployees().get(i).getName().startsWith(prefix)){
                System.out.println(getEmployees().get(i).getName() + " " + getEmployees().get(i).getLname()
                        + " " + getEmployees().get(i).getSalary() + " " + getEmployees().get(i).getAge());
            }
        }
    }
    public void showNameLetterNumber(int amount){
//    Выведем сотрудников фамилия которых состоит из заданого колличества символов
        System.out.println();
        System.out.println("Люди у которых имя состоит из 6 букв ");
        for (int i = 0; i < getEmployees().size(); i++) {
            if(getEmployees().get(i).getName().length() == amount){
                System.out.println(getEmployees().get(i).getName() + " " + getEmployees().get(i).getLname()
                        + " " + getEmployees().get(i).getSalary() + " " + getEmployees().get(i).getAge());
            }
        }
     }
    public void report(){
        ArrayList<String> report = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        for (int i = 0; i < getEmployees().size() ; i++) {
            report.add(getEmployees().get(i).getName());
        }
        for (int i = 0; i < getEmployees().size() ; i++) {
            count.add(i, 1);
        }
        for (int i = 0; i < report.size(); i++) {
            for (int j = i+1; j < getEmployees().size(); j++) {
                if(report.get(i) == getEmployees().get(j).getName()){

                count.add(i, count.get(i) + 1);
                count.add(j, count.get(j) + 1);}

            }

        }
        System.out.println();
        System.out.println("Список имен сотрудников и кол. повторений");
        for (int i = 0; i < report.size() ; i++) {
            System.out.println(report.get(i) + " " + count.get(i));
        }

    }
}
