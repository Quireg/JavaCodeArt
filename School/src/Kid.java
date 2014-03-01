/**
 * Created by Admin on 01.03.14.
 */
public class Kid {
    private String firstName;
    private String lastName;
    private int age;
    private int[] mathMarks;
    private int[] histMarks;
    private int[] musicMarks;

    public Kid() {
        this.firstName = "Ivan";
        this.lastName = "Ivanovushamu";
        this.age = 12;
        this.mathMarks = new int[]{2, 12, 3, 10, 2};
        this.histMarks = new int[]{2, 12, 2, 4, 2};
        this.musicMarks = new int[]{2, 12, 5, 6, 2};
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int[] mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int[] getHistMarks() {
        return histMarks;
    }

    public void setHistMarks(int[] histMarks) {
        this.histMarks = histMarks;
    }

    public int[] getMusicMarks() {
        return musicMarks;
    }

    public void setMusicMarks(int[] musicMarks) {
        this.musicMarks = musicMarks;
    }
}
