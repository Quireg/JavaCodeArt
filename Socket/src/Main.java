import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.net.ServerSocket;

/**
 * Created by Admin on 23.03.2014.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        new Thread(() -> {
            ServerSocket ss = null;
            try {
                ss = new ServerSocket(8080);
                Socket s =  ss.accept();
                Scanner sc = new Scanner(s.getInputStream());

                while (sc.hasNextLine()){
                    String str = sc.nextLine();
                    System.out.println(str);
                    if("exit".equals(str)) {
                        System.exit(0);
                    };
                }


            } catch (IOException e) {
                e.printStackTrace();
            }

        }).start();
        new Thread(() -> {
            while (true){
                System.out.println("Running");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } ).start();
















//        new Thread(()->{
//            File file = new File("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\Test");
//            try {
//                FileWriter fileWriter = new FileWriter(file, false);
//                fileWriter.write("run");
//                fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                Scanner scanner = new Scanner(file);
//                String sc = scanner.next();
//                while (sc.equals("run")){
//
//                    System.out.println("I am still alive!");
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }).start();
    }
}
