/**
 * Created with IntelliJ IDEA.
 * User: Quireg
 * Date: 21.02.14
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */
public class Club extends Weapon {
    protected Club() {
        super("Club", 15 , new String[]{"elf", "troll"}, 2);


    }



    public int getDamage() {
        int tempdamage = damage + (-10 + (int)(Math.random() * ((10 - (-10)) + 1)));
        return tempdamage;
    }
}
