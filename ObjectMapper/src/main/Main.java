package main;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

import model.Company;
import model.MineProgramException;
import model.User;

public class Main {

    public static void main(String[] args) throws MineProgramException, IllegalAccessException, NoSuchFieldException, IOException, InstantiationException {

        ArrayList<Object> objectList = new ArrayList<Object>();

        User user = new User("ivan", "ivanov", 12, 123);
        User user1 = new User("ivan", "ivan2ov", 12, 123);
        Company company = new Company("intel", "metalistov 3");

        save(user1);
        save(user1);
        save(user1);
        save(user1);
        save(user1);
        save(user1);
        save(user1);
        save(user1);
        save(user1);
        save(user1);
        User u1 = (User) load(2, User.class);
        System.out.println(u1.getName() + " " + u1.getAge());

    }

    public static void save(Object obj) throws IOException, IllegalAccessException, NoSuchFieldException {
        File folder = new File("C:\\javatemp\\");
        File[] files = folder.listFiles();
        File tempFile = null;
        File confFile = null;
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
        for (File file : files) {
            if (obj.getClass().getSimpleName().equals(file.getName() + ".conf")) {
                confFile = file;

            } else {
                confFile = new File("C:\\javatemp\\" + obj.getClass().getSimpleName() + ".conf");
                confFile.createNewFile();
                FileWriter fw = new FileWriter(confFile, false);
                for (Field field : obj.getClass().getDeclaredFields()) {
                    fw.write(field.getName() + "\n");
                }
                fw.close();

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
        fileWriter.write("ID" + (counter + 1));
        Scanner scanner = new Scanner(confFile);
        ArrayList<String> arr = new ArrayList<>();
        while (scanner.hasNextLine()) {
            arr.add(scanner.nextLine());
        }
        for (String str : arr) {

            Field fld = obj.getClass().getDeclaredField(str);
            fld.setAccessible(true);
            fileWriter.write(":" + fld.get(obj));

        }


        fileWriter.write("\n");
        fileWriter.close();
    }

    public static Object load(long id, Class incomingClass) throws IOException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        File folder = new File("C:\\javatemp\\");
        File[] files = folder.listFiles();
        File tempFile = null;
        File confFile = null;

        for (File file : files) {
            if (incomingClass.getSimpleName().equals(file.getName())) {
                tempFile = file;
                break;
            } else {
                System.out.println("\n" + "No classes was stored.");
            }
        }
        String confFileName = incomingClass.getSimpleName() + ".conf";
        for (File file : files) {
            if (confFileName.equals(file.getName())) {
                confFile = file;
                break;
            } else {
                System.out.println("\n" + "No classes was stored.");
            }
        }

        ArrayList<String> futureFields = new ArrayList<>();
        Scanner scanID = new Scanner(tempFile);
        String line;
        String[] existingValues = null;
        while (scanID.hasNextLine()) {
            if (scanID.nextLine().startsWith("ID" + id)) {
                existingValues = scanID.nextLine().split(":");
            }
        }

        Scanner scanner = new Scanner(confFile);
        ArrayList<String> arr = new ArrayList<>();
        while (scanner.hasNextLine()) {
            arr.add(scanner.nextLine());
        }
//        ArrayList<String> existingValues = new ArrayList<>();
//        ArrayList<String> existingFields = new ArrayList<>();
//        for (int i = 1; i < futureFields.size() ; i++) {
//            String[] lines = futureFields.get(i).split(":");
//            existingValues.add(lines[1]);
//            existingFields.add(lines[0]);
//        }

        Object result = incomingClass.newInstance();
        for (int i = 1; i < arr.size(); i++) {
            Field f = incomingClass.getDeclaredField(arr.get(i - 1));
            f.setAccessible(true);

            if (f.getType().equals(String.class)) {
                f.set(result, existingValues[i]);
            } else if (f.getType().equals(Integer.class)){
                f.set(result, Integer.parseInt(existingValues[i]));}
            else if (f.getType().equals(int.class)){
                f.set(result, Integer.parseInt(existingValues[i]));}
        }


        return result;
    }
}
