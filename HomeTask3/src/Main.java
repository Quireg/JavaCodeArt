import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pers  aldalerk = new Elf("Adalerk");

        Pers quireg = new Elf("Quireg");

        Battle battle1 = new Battle();
        battle1.letsBattle(aldalerk, quireg);

    }
}
