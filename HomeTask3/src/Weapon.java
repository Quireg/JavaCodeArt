import java.util.ArrayList;

/**
 * Created by Quireg on 19.02.14.
 */
abstract public class Weapon {
    private String name;
    protected int damage;
    private String[] whoCanUse;
    private int attackSpeed = 3;

    protected Weapon(String name, int damage, String[]  whoCanUse, int attackSpeed) {
        this.name = name;
        this.damage = damage;
        this.whoCanUse = whoCanUse;
        this.attackSpeed = attackSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    abstract public int getDamage();


}
