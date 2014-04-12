import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Admin on 12.04.2014.
 */
public class MyFileReader {
    public static void read() throws FilipKirkorovException, NegativeValueException {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\Exception\\temp");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
               String[] s = scanner.nextLine().split(":");
                System.out.println(s[0]+ " "+ s[1] + " "+ s[2]+ " " + s[3]);
                if(s[0].equals("filip") && s[1].equals("kirkorov")){
                    throw new FilipKirkorovException();
                }else if(Integer.parseInt(s[2]) < 0 || Integer.parseInt(s[3]) < 0){
                    throw new NegativeValueException();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
