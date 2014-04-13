import java.io.*;
import java.lang.reflect.Field;


public class ClassName {
    public static void main(String[] args) throws IllegalAccessException, IOException, ClassNotFoundException {
        User user = new User("Ivan", "ivanos", 23);
        writeObjInfo(user, "C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\Exception\\temp");
//        User user1 = (User) readObjInfo("C:\\Users\\Admin\\IdeaProjects\\JavaCodeArt\\Exception\\temp");
//        System.out.println(user1.getLname());
    }
    public static void objInfo(Object obj) throws IllegalAccessException {
        String str = obj.getClass().getSimpleName();
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field o : fields) {
            o.setAccessible(true);
            System.out.println(o.getName() + " " + o.get(obj) );
        }

    }
    public static void writeObjInfo(Object obj, String filePath) throws IOException {
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(filePath));
        ous.writeObject(obj);


    }
    public static Object readObjInfo(String filepath) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath));

        return ois.readObject();
    }
}
class User implements Serializable{
    User(String name, String lname, int age) {
        this.name = name;
        this.lname = lname;
        this.age = age;
    }

    private String name;
    private String lname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
