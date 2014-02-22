import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class NewFile {

    File file = new File("C:\\Users\\Quireg\\Documents\\1.txt");

    public void sortHor() throws FileNotFoundException {
        Scanner scanFile = new Scanner(file);
        while (scanFile.hasNext()) {
            String s = scanFile.next();
            System.out.print(s + " ");
        }
    }

    public void sortVer() throws FileNotFoundException {
        Scanner scanFile = new Scanner(file);
        scanFile.useDelimiter(" ");
        while (scanFile.hasNext()) {
            String s = scanFile.next();
            System.out.println(s);
        }
    }

    public void sortDiag() throws FileNotFoundException {
        Scanner scanFile = new Scanner(file);
        String j = " ";
        while (scanFile.hasNext()) {
            String s = scanFile.next();
            for (int k = 0; k < s.length(); k++) {
                j = j + " ";
            }
            System.out.println(j + s);
        }

    }
}


