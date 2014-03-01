
public class Battle {

    public Pers letsBattle(Pers char1, Pers char2) {
//        char1.equipWeapon();
//        char2.equipWeapon();
        while (char1.getHitpoints() > 0 && char2.getHitpoints() > 0) {
            char1.attack(char2);
            if (char2.getHitpoints() <= 0) {

                System.out.println(char2.getName() + " is dead");
                return char1;
            }
            char2.attack(char1);
            if (char1.getHitpoints() <= 0) {

                System.out.println(char1.getName() + " is dead");
                return char2;
            }


            System.out.println();
            System.out.println(char1.getName() + " has left " + char1.getHitpoints() + " healpoints");
            System.out.println(char2.getName() + " has left " + char2.getHitpoints() + " healpoints");
            System.out.println();
        }
        return null;
    }

}
