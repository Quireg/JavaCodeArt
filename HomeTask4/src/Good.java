/**
 * Created with IntelliJ IDEA.
 * User: Quireg
 * Date: 20.03.14
 * Time: 2:40
 * To change this template use File | Settings | File Templates.
 */
public class Good {
    private String model;
    private int weight;
    private int cost;
    private String manufacturer;
    private int goodid;

    public Good(String model, int weight, int cost, String manufacturer, int goodid) {
        this.model = model;
        this.weight = weight;
        this.cost = cost;
        this.manufacturer = manufacturer;
        this.goodid = goodid;
    }

    public int getGoodid() {
        return goodid;
    }

    public void setGoodid(int goodid) {
        this.goodid = goodid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
