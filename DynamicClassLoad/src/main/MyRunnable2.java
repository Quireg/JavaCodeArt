package main;


import java.util.Comparator;
import java.util.Scanner;

public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        try {
            Comparator comp = (Comparator) Class.forName(line).newInstance();
            DoingSomething.setComparator(comp);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
