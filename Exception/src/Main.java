import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws AuthenticationFailedException {
    Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Login");
        String login = scanner1.nextLine();
    Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = scanner2.nextLine();

    String credentials = login + ":" + password;
        checkAuth(credentials);
    }
    public static ArrayList<String> getPass(){
        File file = new File("C:\\Users\\Quireg\\IdeaProjects\\JavaCodeArt\\Exception\\temp");
        ArrayList<String> str = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                str.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }
        return str;
    }
    public static void checkAuth(String loginPass) {
       String[] strings =  loginPass.split(":");

            for (int i = 0; i < getPass().size(); i++) {
                String[] origStr = getPass().get(i).split(":");
                if (origStr[0].equals(strings[0]) && origStr[1].equals(strings[1])) {
                    System.out.println("Access Granted");
                    return;
                }
            }
        try {
            throw new AuthenticationFailedException();
        } catch (AuthenticationFailedException e) {
            e.printStackTrace();
        }

    }

    private static class AuthenticationFailedException extends Exception {
    }
}

