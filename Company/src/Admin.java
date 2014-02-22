/**
 * Created by Admin on 08.02.14.
 */
public class Admin extends Employee{

    private int beardLength;
    private String beerBrand;

    public Admin(String name, String lname, int age, int salary, int beardLength, String beerBrand) {
        super(name, lname, age, salary);
        this.beardLength = beardLength;
        this.beerBrand = beerBrand;
    }

    public String getBeerBrand() {
        return beerBrand;
    }

    public void setBeerBrand(String beerBrand) {
        this.beerBrand = beerBrand;
    }


}
