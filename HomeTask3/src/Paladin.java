/**
 * Created by Quireg on 24.02.14.
 */
public class Paladin extends Pers {
    protected Paladin(String name) {
        super(name, 140);
    }

    @Override
    public void attack(Pers enemy) {
        if(getWeaponEquipped() != null){
            // (8 + (int)(Math.random() * ((12 - 8) + 1)))
            int damage1 = getWeaponEquipped().getDamage();
            enemy.setHitpoints(enemy.getHitpoints() - damage1);
            System.out.println(getName() + " hit for "+ damage1 + " damage");

        } else {
            System.out.println("Give me a weapon!");
            equipWeapon();
        }

    }
}
