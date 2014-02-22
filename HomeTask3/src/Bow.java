import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Quireg
 * Date: 21.02.14
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */
public class Bow extends Weapon {
    private String name = "Bow";
    private int damage = 100;
    private ArrayList<Pers> whoCanUse;

    public String getName() {
        return name;
    }

    public int getDamage() {
        damage = damage + (-50 + (int)(Math.random() * ((50 - (-50)) + 1)));
        return damage;
    }

    public ArrayList<Pers> getWhoCanUse() {
        return whoCanUse;
    }
}
