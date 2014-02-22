package Task1;

/**
 * Created by Quireg on 2/15/14.
 */
public class Tv extends Good {
    private int inches;

    public Tv(int id, String name, int cost, String type, String owner, int inches) {
        super(id, name, cost, type, owner);
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }


}
