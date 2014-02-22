package Task1;

/**
 * Created by Quireg on 2/15/14.
 */
public class Good {
    private int id;
    private String name;
    private int cost;
    private String type;
    private String owner;

    public Good(int id, String name, int cost, String type, String owner) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
