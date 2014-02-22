/**
 * Created by Admin on 09.02.14.
 */
public class Triangle extends Figure {
    private int storona;

    public Triangle(String name, int storona) {
        super(name);
        this.storona = storona;
    }


    public double calcPerimetr(){
        return storona *3;
    }


    public int getStorona() {
        return storona;
    }

    public void setStorona(int storona) {
        this.storona = storona;
    }

    public double calcSquare(){
        return (storona * storona)/2;


    }
}
