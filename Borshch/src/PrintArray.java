import java.util.ArrayList;

/**
 * Created by Admin on 15.03.14.
 */
public class PrintArray {
    public static void PrintArray(ArrayList<User> arr){
        for (int i = 0; i < arr.size() ; i++) {
            System.out.println(arr.get(i).getName()+ " "+ arr.get(i).getlName()+" "
                    +arr.get(i).getAge() + " "+ arr.get(i).getSalary());
        }
    }
}
