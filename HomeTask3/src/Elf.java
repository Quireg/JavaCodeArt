/**
 * Created by Quireg on 19.02.14.
 */
public class Elf extends Pers {


    protected Elf(String name) {
        super(name, 100);
    }

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
