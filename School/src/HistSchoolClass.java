import java.util.ArrayList;

/**
 * Created by Admin on 01.03.14.
 */
public class HistSchoolClass extends SchoolClass {
    @Override
    public int oLevel() {
        int temp = 0;
        int tempresult = 0;
        int result = 0;
        for (int i = 0; i < getKidsList().size() ; i++) {
            for (int j = 0; j < getKidsList().get(i).getHistMarks().length ; j++) {
                temp += getKidsList().get(i).getHistMarks()[j];

            }
            tempresult += temp/(getKidsList().get(i).getHistMarks().length);
        }
        result += tempresult/(getKidsList().size());
        return result;

    }

    protected HistSchoolClass() {
        super("skv", new ArrayList<Kid>());
    }
}
