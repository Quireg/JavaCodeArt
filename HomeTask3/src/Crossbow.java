/**
 * Created with IntelliJ IDEA.
 * User: Quireg
 * Date: 21.02.14
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */
public class Crossbow extends Weapon {
    protected Crossbow() {
        super("Crossbow", 25 , new String[]{"elf", "troll"}, 1);


    }



    public int getDamage() {
        int tempdamage = damage + (-5 + (int)(Math.random() * ((5 - (-5)) + 1)));
        return tempdamage;
    }
}
