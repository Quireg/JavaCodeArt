import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 16.03.14.
 */
public class ReadandWrite {
    public static ArrayList<String> getStrings() {
        File f = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\Swing\\src\\temp");
        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        ArrayList<String> str = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            str.add(scanner.nextLine());
        }
        return str;
    }


    public static void addStrings(String str, boolean q) {
        File f = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\Swing\\src\\temp");

        try {
            FileWriter fileWriter = new FileWriter(f, q);


            fileWriter.write("\n" + str);


            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void showFileContents() {
    }
}
