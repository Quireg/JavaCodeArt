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
 class Notebook extends Good {
    private String type;
    private String size;
    private String os;
    private boolean wifi;


    public Notebook(String model, int weight, int cost, String manufacturer, int goodid, String type, String size, String os, boolean wifi) {
        super(model, weight, cost, manufacturer, goodid);
        this.type = type;
        this.size = size;
        this.os = os;
        this.wifi = wifi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
class Printer extends Good {
    private String type;
    private String color;

    public Printer(String model, int weight, int cost, String manufacturer, int goodid, String type, String color) {
        super(model, weight, cost, manufacturer, goodid);
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Cellphone extends Good {
    private int ram;
    private String os;
    private int diagonal;
    private boolean video;

    public Cellphone(String model, int weight, int cost, String manufacturer, int goodid, int ram, String os, int diagonal, boolean video) {
        super(model, weight, cost, manufacturer, goodid);
        this.ram = ram;
        this.os = os;
        this.diagonal = diagonal;
        this.video = video;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }
}


