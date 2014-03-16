import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 15.03.14.
 */
public class ParseFile {

    public static ArrayList<User> getUsers(){
        File f = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\Borshch\\users");
        Scanner scanner = null;
        try {
            scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        ArrayList<User> arr = new ArrayList<User>();
        while (scanner.hasNextLine() == true){
            String[] strs = scanner.nextLine().split(":");
            User u = new User(strs[0], strs[1], Integer.parseInt(strs[2]), Integer.parseInt(strs[3]));
            arr.add(u);

        }
        return arr;

    }
    public static User createUser(){
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter name");
        Scanner scanLName = new Scanner(System.in);
        System.out.println("Enter Last name");
        Scanner scanAge = new Scanner(System.in);
        System.out.println("Enter age");
        Scanner scanSalary = new Scanner(System.in);
        System.out.println("Enter salary");



        User result = new User(scanName.nextLine(), scanLName.nextLine(),
                Integer.parseInt(scanAge.nextLine()), Integer.parseInt(scanSalary.nextLine()));

        return result;
    }
    public static void addUser(User user){
        File f = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\Borshch\\users");
        try {
            FileWriter fileWriter = new FileWriter(f, true);
            fileWriter.write("\n" +user.getName()+":"+user.getlName()+":"+user.getAge()+":"+user.getSalary());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
