
public class Singletone {
    private static Singletone temp;

    public Singletone createTemp1(){
        if (temp == null){
            temp = new Singletone();
        }
        return temp;
    }

    private Singletone() {
    }
}
