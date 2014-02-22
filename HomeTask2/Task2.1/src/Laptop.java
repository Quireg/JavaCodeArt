package Task1;

/**
 * Created by Quireg on 2/15/14.
 */
public class Laptop extends Good {
    private String characteristics;

    public Laptop(int id, String name, int cost, String type, String owner, String characteristics) {
        super(id, name, cost, type, owner);
        this.characteristics = characteristics;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}
