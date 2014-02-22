/**
 * Created by Admin on 09.02.14.
 */
public class Square extends Figure {
    private int storona;

    public Square(String name, int storona) {
        super(name);
        this.storona = storona;
    }

    public double calcPerimetr(){
        return storona *4;
    }


    public double calcSquare(){
        return storona * storona;

    }

    public int getStorona() {
        return storona;
    }

    public void setStorona(int storona) {
        this.storona = storona;
    }
}
