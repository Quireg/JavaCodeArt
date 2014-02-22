/**
 * Created by Admin on 02.02.14.
 */
public class Vagon {
    private int number;
    private String type;
    private int maxPass;
    private Passenger[] passengers;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxPass() {
        return maxPass;
    }

    public void setMaxPass(int maxPass) {
        this.maxPass = maxPass;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }
}
