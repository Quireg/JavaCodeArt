import java.util.ArrayList;

/**
 * Created by Quireg on 19.02.14.
 */
public class Knife extends Weapon{
    private String name = "Knife";
    private int damage = 10;
    private ArrayList<Pers> whoCanUse;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        damage = damage + (-2 + (int)(Math.random() * ((2 - (-2)) + 1)));
        return damage;
    }



    public ArrayList<Pers> getWhoCanUse() {
        return whoCanUse;
    }

    public void setWhoCanUse(ArrayList<Pers> whoCanUse) {
        this.whoCanUse = whoCanUse;
    }
}
