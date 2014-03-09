import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int i, n = 10;
//        for (i = 0; -i < n; i--) {
//            System.err.println("*");
//        }


        ArrayList<Integer> str = new ArrayList<Integer>();
        str.add(12);
        str.add(421);
        str.add(23);
        str.add(42);
        str.add(76);
        str.add(1);
        str.add(23);
        MyCompar compar = new MyCompar();
        Collections.sort(str);

        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));

        }

    }
}
