import java.util.ArrayList;

/**
 * Created by Admin on 01.03.14.
 */
public class MusicSchoolClass extends SchoolClass {
    @Override
    public int oLevel() {
        int temp = 0;
        int tempresult = 0;
        int result = 0;
        for (int i = 0; i < getKidsList().size() ; i++) {
            for (int j = 0; j < getKidsList().get(i).getMusicMarks().length ; j++) {
                temp += getKidsList().get(i).getMusicMarks()[j];

            }
            tempresult += temp/(getKidsList().get(i).getMusicMarks().length);
        }
        result += tempresult/(getKidsList().size());
        return result;

    }

    protected MusicSchoolClass() {
        super("skd", new ArrayList<Kid>());
    }
}
