/**
 * Created by Admin on 15.03.14.
 */
public class User {
    private String name;
    private String lName;
    private int age;
    private int salary;

    public User(String name, String lName, int age, int salary) {
        this.name = name;
        this.lName = lName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
