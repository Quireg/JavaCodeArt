import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

    while (true){
        System.out.println("Enter option");
        System.out.println("1 - Show users in the list");
        System.out.println("2 - Add user to the list");
        System.out.println("3 - Exit");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(input.equals("1")){
            PrintArray.PrintArray(ParseFile.getUsers());
        }else if (input.equals("2")){
            ParseFile.addUser(ParseFile.createUser());

        }else if (input.equals("3")){
            System.exit(0);
        }else {
            System.out.println("invalid option");
        }



    }

    }
}
