/**
 * Created by Admin on 09.02.14.
 */
public class Circle extends Figure{
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public double calcPerimetr(){
        return Math.PI * radius * 2;
    }


    public double calcSquare(){
        return Math.PI * radius * radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
