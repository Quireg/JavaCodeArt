import java.util.*;

public class Main {

    public static void main(String[] args) {

//        int i, n = 10;
//        for (i = 0; -i < n; i--) {
//            System.err.println("*");
//        }


        ArrayList<Integer> str = new ArrayList<Integer>();
        LinkedList<Integer> str1 = new LinkedList<Integer>();
        str.add(12);
        str.add(421);
        str.add(23);
        str.add(42);
        str.add(76);
        str.add(1);
        str.add(23);

        Collections.sort(str, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));

        }
        for (Integer s : str){
            System.out.println(s);
        }

    }
}
