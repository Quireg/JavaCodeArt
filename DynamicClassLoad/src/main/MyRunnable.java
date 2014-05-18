package main;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MyRunnable implements Runnable {


    private Comparator getComp() {

        return DoingSomething.comparator;
    }


    public void run() {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Press 1 for asd \nPress 2 for asd \nPress 3 for exit");
                String line = scanner.nextLine();
                if (line.equals("1")) {


                    Properties props = new Properties();
                    try {
                        props.load(new FileReader("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\DynamicClassLoad\\src\\main\\Props.properties"));
                        Scanner fr = new Scanner(new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\DynamicClassLoad\\src\\main\\temp"));
                        String[] arr = null;
                        while (fr.hasNextLine()) {
                            arr = fr.nextLine().split(" ");

                        }

                        Arrays.sort(arr, getComp());
                        for (Object o : arr) {
                            System.out.println(o);
                        }
                        fr.close();
                        Thread.sleep(Long.parseLong(props.getProperty("time")));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
}
}
