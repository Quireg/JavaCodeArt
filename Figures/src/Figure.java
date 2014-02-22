/**
 * Created by Admin on 09.02.14.
 */
abstract public class Figure {
    private String name;

abstract public double calcPerimetr();

abstract  public double calcSquare();

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
