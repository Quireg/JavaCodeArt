import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Quireg
 * Date: 21.02.14
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */
public class Bow extends Weapon {
    protected Bow() {
        super("Bow", 50 , new String[]{"elf", "troll"}, 1);


    }



    public int getDamage() {
        int tempdamage = damage + (-15 + (int)(Math.random() * ((15 - (-15)) + 1)));
        return tempdamage;
    }
}
