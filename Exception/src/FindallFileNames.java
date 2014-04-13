import java.io.File;
import java.util.Scanner;

/**
 * Created by Admin on 13.04.2014.
 */
public class FindallFileNames {
    public static void main(String[] args) {

            System.out.println("Enter folder location");
            Scanner scanner = new Scanner(System.in);
            String path = scanner.nextLine();
            System.out.println("Enter file prefix");
            Scanner scanner1 = new Scanner(System.in);
            String prefix = scanner1.nextLine();

            findAllFilesWithPrefix(prefix,path);





    }
    public static void  findAllFilesWithPrefix(String prefix, String path){
        for (File file : getFilesList(path)) {
            if (file.getName().startsWith(prefix)){
                System.out.println(file.getName());
            }
        }


    }
    public static File[] getFilesList(String path){
        File folder = new File(path);
//        folder.list()
        File[] files = folder.listFiles();
        return files;
    }
}
