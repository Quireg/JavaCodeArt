/**
 * Created by Admin on 16.02.14.
 */
public class Employee {
    private String fName;
    private String lName;
    private int age;
    private int salary;

    public Employee(String fName, String lName, int age, int salary) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
