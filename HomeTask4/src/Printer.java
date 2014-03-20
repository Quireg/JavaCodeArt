/**
 * Created with IntelliJ IDEA.
 * User: Quireg
 * Date: 20.03.14
 * Time: 2:42
 * To change this template use File | Settings | File Templates.
 */
public class Printer extends Good {
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
