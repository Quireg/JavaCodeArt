package main;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import model.Company;
import model.User;

public class Main {

    public static void main(String[] args) throws IOException, IllegalAccessException {

        ArrayList<Object> objectList = new ArrayList<Object>();

        User user = new User("ivan", "ivanov", 12, 123);
        User user1 = new User("ivan", "ivan2ov", 12, 123);
        Company company = new Company("intel", "metalistov 3");
        load(1, User.class);
    }

    public static void save(Object obj) throws IOException, IllegalAccessException {
        File folder = new File("C:\\javatemp\\");
        File[] files = folder.listFiles();
        File tempFile = null;
//        if (files.length == 0) {
//            tempFile = new File("C:\\javatemp\\" + obj.getClass().getSimpleName());
//
//        } else {
        for (File file : files) {
            if (obj.getClass().getSimpleName().equals(file.getName())) {
                tempFile = file;
            } else {
                tempFile = new File("C:\\javatemp\\" + obj.getClass().getSimpleName());
                tempFile.createNewFile();
            }
        }
//        }
        int linecount = 0;
        int counter = 0;
        String line;
        BufferedReader bf = new BufferedReader(new FileReader(tempFile));
        while ((line = bf.readLine()) != null) {
            // Increment the count and find the index of the word
            linecount++;
            int indexfound = line.indexOf("ID");

            // If greater than -1, means we found the word
            if (indexfound > -1) {
                counter++;
            }
        }
        FileWriter fileWriter = new FileWriter(tempFile, true);
        fileWriter.write("ID" + " " + (counter + 1) + "\n");
        for (Field declaratedField : obj.getClass().getDeclaredFields()) {
            declaratedField.setAccessible(true);
            fileWriter.write(declaratedField.getName() + ":" + declaratedField.get(obj) + "\n");
        }
        fileWriter.close();
    }

    public static <T extends Object> T load(long id, Class<T> incomingClass) throws IOException {
        File folder = new File("C:\\javatemp\\");
        File[] files = folder.listFiles();
        File tempFile = null;

        for (File file : files) {
            if (incomingClass.getSimpleName().equals(file.getName())) {
                tempFile = file;
            } else {
                System.out.println("\n" + "No classes was stored.");
            }
        }
        Object temp = null;
        T result = null;

        int linecount = 0;
        int counter = 0;
        String line;
        String line2= "asd";
        ArrayList<String> futureFields = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new FileReader(tempFile));
        while ((line = bf.readLine()) != null) {
            int indexfound = line.indexOf("ID" + " " + id);

            if (indexfound > -1) {
                while ((line = bf.readLine()) != null) {
                int indexfound1 = line.indexOf("ID" + " " + (id + 1));
                    if (indexfound1 == -1)
                    futureFields.add(line.toString());
                    else break;
                }

            }
        }


        Field[] fields = incomingClass.getDeclaredFields();
//
//        for (Field field : fields) {
//            field.set(incomingClass);
//        }


        return null;
    }
}
