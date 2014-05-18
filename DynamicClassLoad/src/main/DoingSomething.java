package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DoingSomething {
    public static Comparator<String> comparator  = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return Integer.parseInt(o1) - Integer.parseInt(o2);
        }
    };

    public static void setComparator(Comparator comparator) {
        DoingSomething.comparator = comparator;
    }

    public static void start(){

        Thread t1 = new Thread(new MyRunnable());
        t1.start();
        Thread t2 = new Thread(new MyRunnable2());
//        t2.start();

    }
}
