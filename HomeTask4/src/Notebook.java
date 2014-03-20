/**
 * Created with IntelliJ IDEA.
 * User: Quireg
 * Date: 20.03.14
 * Time: 2:45
 * To change this template use File | Settings | File Templates.
 */
public class Notebook extends Good {
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
