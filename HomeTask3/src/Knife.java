import java.util.ArrayList;

/**
 * Created by Quireg on 19.02.14.
 */
public class Knife extends Weapon{





    protected Knife() {
        super("Knife", 10, new String[]{"elf", "troll"}, 3);


    }



    public int getDamage() {
        int tempdamage = damage + (-2 + (int)(Math.random() * ((2 - (-2)) + 1)));
        return tempdamage;
    }




}

