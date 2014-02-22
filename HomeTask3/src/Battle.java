
public class Battle {

    public Pers letsBattle(Pers char1, Pers char2) {
        char1.equipWeapon();
        char2.equipWeapon();
        while (char1.getHitpoints() > 0 && char2.getHitpoints() > 0) {
            char1.attack(char2);
            char2.attack(char1);
            System.out.println(char1.getName() + " has left " + char1.getHitpoints() + " healpoints");
            System.out.println(char2.getName() +" has left " + char2.getHitpoints() +" healpoints");
            System.out.println();
        }
        if (char1.getHitpoints() <= 0) {
            System.out.println(char1.getName() + " is dead");
            return char1;
        } else if (char2.getHitpoints() <= 0) {
            System.out.println(char2.getName() + " is dead");
            return char2;
        }else{
            return null;
        }

    }

}
