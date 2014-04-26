import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter(new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\ArrayLinkedCompare\\correct"), false);
        fileWriter.write("correct" + "\n");
        for (int i = 0; i < 100; i++) {
            fileWriter.write("correct"+ i +"\n");
        }
        fileWriter.close();
        System.out.println("Written");

        ArrayList<String> all = new ArrayList<>();
        File file1 = new File("C:\\javatemp\\big.txt");
        Scanner scanner1 = new Scanner(file1);
        while (scanner1.hasNextLine()) {
            String[] strings = scanner1.nextLine().split(" ");
            for (String s : strings) {
                all.add(s);
            }
        }
        System.out.println("Loaded");
        Main.ll(all);
        System.out.println("Linked list done");
        Main.al(all);
        System.out.println("Array list done");
        Main.hs(all);
        System.out.println("Hash Set done");
    }

    public static void ll(ArrayList all) throws FileNotFoundException {
        long i = System.nanoTime();
        LinkedList<String> correct = new LinkedList<>();
        File file2 = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\ArrayLinkedCompare\\correct");
        Scanner scanner2 = new Scanner(file2);
        while (scanner2.hasNextLine()) {
            String[] strings = scanner2.nextLine().split(" ");
            for (String s : strings) {
                correct.add(s);
            }
        }
        int counter = 0;
        for (int j = 0; j < all.size(); j++) {
            for (int k = 0; k < correct.size(); k++) {
                if (all.get(j).equals(correct.get(k))) {
                    counter++;
                }
            }
        }
        long i1 = System.nanoTime();
        System.out.println("Elements found "+counter);
        System.out.println("Process took " + (double) ((i1 - i) / 1000000) + " miliseconds");
    }

    public static void al(ArrayList all) throws FileNotFoundException {
        long i = System.nanoTime();
        ArrayList<String> correct = new ArrayList<>();
        File file2 = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\ArrayLinkedCompare\\correct");
        Scanner scanner2 = new Scanner(file2);
        while (scanner2.hasNextLine()) {
            String[] strings = scanner2.nextLine().split(" ");
            for (String s : strings) {
                correct.add(s);
            }
        }
        int counter = 0;
        for (int j = 0; j < all.size(); j++) {
            for (int k = 0; k < correct.size(); k++) {
                if (all.get(j).equals(correct.get(k))) {
                    counter++;
                }
            }
        }
        long i1 = System.nanoTime();
        System.out.println("Elements found "+counter);
        System.out.println("Process took " + (double) ((i1 - i) / 1000000) + " miliseconds");
    }

    public static void hs(ArrayList all) throws FileNotFoundException {
        long i = System.nanoTime();
        HashSet<String> correct = new HashSet<>();
        File file2 = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\ArrayLinkedCompare\\correct");
        Scanner scanner2 = new Scanner(file2);
        while (scanner2.hasNextLine()) {
            String[] strings = scanner2.nextLine().split(" ");
            for (String s : strings) {
                correct.add(s);
            }
        }
//        ITERATOR HERE!
//        Iterator<String> hs = correct.iterator();
//        while (hs.hasNext()){
//            String element = hs.next();
//            System.out.println(element);
//        }
        int counter = 0;
        for (int k = 0; k < all.size(); k++) {
            if (correct.contains(all.get(k))) {
                counter++;
            }
        }

        long i1 = System.nanoTime();
        System.out.println("Elements found "+counter);
        System.out.println("Process took " + (double) ((i1 - i) / 1000000) + " miliseconds");
    }
}
