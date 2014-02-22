import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main  {
    public static void main(String[] args) throws FileNotFoundException {


        NewFile file = new NewFile();

        while (true) {
            System.out.println("Enter option");
            System.out.println("1- Sort hor.");
            System.out.println("2- Sort vert,");
            System.out.println("3- Sort diag.");
            System.out.println("4- Exit");

            Scanner chooseAct = new Scanner(System.in);
            String act = chooseAct.nextLine();

            if (act.equals("1")) {
                file.sortHor();
                System.out.println("Sorting hor completed");
            } else if (act.equals("2")) {
                file.sortVer();
            } else if (act.equals("3")) {
                file.sortDiag();
            } else if (act.equals("4")) {
                System.exit(0);
            } else {
                System.out.println("Invalid option");
            }

        }

    }
}
