import java.util.Scanner;

/**
 * Created by Quireg on 19.02.14.
 */
abstract public class Pers {
    private String name;
    private Weapon weaponEquipped;
    private String charClass;
    protected int hitpoints;

    protected Pers(String name, int hitpoints) {
        this.name = name;
        this.hitpoints = hitpoints;
    }

    public Pers createPers() {
        System.out.println("Character create");
        System.out.println("Please enter character name: ");
        Scanner scanName = new Scanner(System.in);
        String scanNameResult = scanName.nextLine();
        System.out.println("Please choose character class");
        System.out.println("1 - Elf");
        System.out.println("2 - Wizard");
        System.out.println("3 - Troll");
        System.out.println("4 - Paladin");
        System.out.println("5 - Dwarf");
        Scanner scanClass = new Scanner(System.in);
        String scanClassResult = scanClass.nextLine();
        if (scanClassResult.equals("1")) {
            Pers result = new Elf(scanNameResult);
            return result;
        } else if (scanClassResult.equals("2")) {
            Pers result = new Wizard(scanNameResult);
            return result;
        }else if (scanClassResult.equals("3")) {
            Pers result = new Troll(scanNameResult);
            return result;
        }else if (scanClassResult.equals("2")) {
            Pers result = new Paladin(scanNameResult);
            return result;
        }else if (scanClassResult.equals("2")) {
            Pers result = new Dwarf(scanNameResult);
            return result;
        }else {
            System.out.println("Invalid option");
            createPers();
        }
        return null;
    }

    abstract public void attack(Pers enemy);

    public void equipWeapon() {
        System.out.println();
        System.out.println("Choose weapon for " + getName());
        System.out.println("1 - Knife");
        System.out.println("2 - Bow");
        System.out.println("3 - Crossbow");
        System.out.println("4 - Sword");
        System.out.println("5 - Stuff");
        System.out.println("6 - Club");

        Scanner enterWeapon = new Scanner(System.in);
        String weaponNumber = enterWeapon.nextLine();
        if (weaponNumber.equals("1")) {
            setWeaponEquipped(new Knife());
            System.out.println(getName() + " took " + getWeaponEquipped().getName());
        } else if (weaponNumber.equals("2")) {
            weaponEquipped = new Bow();
        } else if (weaponNumber.equals("3")) {
            weaponEquipped = new Crossbow();
        } else if (weaponNumber.equals("4")) {
            weaponEquipped = new Sword();
        } else if (weaponNumber.equals("5")) {
            weaponEquipped = new Stuff();
        } else if (weaponNumber.equals("6")) {
            weaponEquipped = new Club();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeaponEquipped() {
        return weaponEquipped;
    }

    public void setWeaponEquipped(Weapon weaponEquipped) {
        this.weaponEquipped = weaponEquipped;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }
}
