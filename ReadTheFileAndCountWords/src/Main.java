import com.sun.org.apache.xalan.internal.xsltc.dom.SimpleResultTreeImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 09.02.14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String str = new String();
        Scanner scanFilePath = new Scanner(System.in);
        System.out.println("Введите путь к файлу");
        str = scanFilePath.nextLine();
        System.out.println();
        System.out.println("Введите искомое слово");
        Scanner inputWord = new Scanner(System.in);
        String input = inputWord.nextLine();



        File file = new File(str);
        Scanner scn = new Scanner(file);
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            if(scn.hasNextLine()){
                strings.add(scn.nextLine());
            }

        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));

        }

        System.out.println();
        int counter = 0;
        for (int i = 0; i <strings.size() ; i++) {
            String[] strs = strings.get(i).split(" ");
            for (int j = 0; j <strs.length; j++) {
                if(strs[j].equals(input)){
                counter = counter +1;
                }

            }
        }
        System.out.println("Искомое слово встречается "+counter + " раз");






    }
}
