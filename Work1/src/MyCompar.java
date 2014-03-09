import java.util.Comparator;

/**
 * Created by Admin on 09.03.14.
 */
public class MyCompar implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){
            return 1;
        }else if(o1.length() == o2.length()){
        return 0;
        }else if(o1.length() < o2.length()){
        return -1;}
        return 0;
    }
}
