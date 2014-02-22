import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Quireg
 * Date: 21.02.14
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */
public class Sword extends Weapon {
    private String name = "Sword";
    private int damage = (5 + (int)(Math.random() * ((15 - 5) + 1)));
    private ArrayList<Pers> whoCanUse;
}
